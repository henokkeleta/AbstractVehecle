
public class Car extends Vehiclee{
	private  int carryingCapacity; 
	
	
	

    public Car()
    { 
    	super();
    	this.carryingCapacity=0;
    }
    
    public Car(String name,int speed,int carry)
    { 
    	super();
    	this.carryingCapacity= carry;
    }
    
    
	
	
	public int getCarryingCapacity() {
		return carryingCapacity;
	}

	public void setCarryingCapacity(int carryingCapacity) {
		this.carryingCapacity = carryingCapacity;
	}

	
  
	public  String driving(String name,int Speed,int carryingCapacity)
	{ 
		return "The Truck is running with:"+" "+getSpeed()+" "+"speed"+" "+"and has carrying capacity of"+" "+getCarryingCapacity();
	}
   public  String vehicleStatus() {
    	    String status = "";
    	    status = driving(getName(),getSpeed(), getCarryingCapacity());
    	    return status;
		
	}
	

@Override
public  int run(int speed) {
	// TODO Auto-generated method stub
	
	return getSpeed();
}




@Override
public int accelerate(int speed) {
	// TODO Auto-generated method stub
	int carSpeed=getSpeed();
	return carSpeed;
}

@Override
public  String stop() {
	// TODO Auto-generated method stub
	return "the Truck has stopped";
}






	
}
