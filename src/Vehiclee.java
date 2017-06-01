
public abstract class Vehiclee {
	private String name;
	
	private int speed;

	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public abstract int run(int num );
	public abstract int accelerate(int num);
	public abstract String stop();
	public abstract String vehicleStatus();
}
