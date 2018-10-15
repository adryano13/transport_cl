
public class Bus extends Auto {
	
	private int passengers;
	
	

	public Bus() {
		System.out.println("Bus()");
		// TODO Auto-generated constructor stub
	}

	public Bus(int passengers) {
		super();
		this.passengers = passengers;
	}

	public int getPassengers() {
		return passengers;
	}

	public void setPassengers(int passengers) {
		this.passengers = passengers;
	}
	
	

}
