
public class Plane extends Vehiclee{
    private int flyingAtHeight;
  
    
    public Plane()
    { 
    	super();
    	this.flyingAtHeight=0;
    }
    
    public Plane(String name,int speed,int newHieght)
    { 
    	super();
    	this.flyingAtHeight=newHieght;
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
	public  String driving(String name,int Speed,int carryingCapacity)
	{ 
		return "The Plane  is flying with:"+" "+getSpeed()+" "+"speed"+" "+"and  flying at height of"+" "+getFlyingAtHeight();
	}
    public int getFlyingAtHeight() {
		return flyingAtHeight;
	}

	public void setFlyingAtHeight(int flyingAtHeight) {
		this.flyingAtHeight = flyingAtHeight;
	}

	public String vehicleStatus() {
    	    String status = "";
    	    status = driving(getName(),getSpeed(), getFlyingAtHeight());
    	    return status;
		
	}



	
}
