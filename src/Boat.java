
public class Boat extends Vehiclee {
   private String location;
	
	public Boat()
	{ 
		super();
		location="Bermuda";
	}
	public Boat(String name,int Speed,String location)
	{ 
		super();
		this.location=location;
	}
	public  String floating(String name,int Speed,String location)
	{ 
		return "The Boat is floating with:"+" "+getSpeed()+" "+"speed"+"and Located at"+" "+getLocation();
	}
   public String vehicleStatus() {
    	    String status = "";
    	    status = floating(getName(),getSpeed(), getLocation());
    	    return status;
		
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	@Override
	public  int run(int speed) {
		// TODO Auto-generated method stub
		
		return getSpeed();
	}

	

	
	@Override
	public int accelerate(int speed) {
		// TODO Auto-generated method stub
		int BoatSpeed=getSpeed();
		return BoatSpeed;
	}

	@Override
	public  String stop() {
		// TODO Auto-generated method stub
		return "the Boat has stopped";
	}
	
	
}
