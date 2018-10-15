
public class Track extends Auto {
	
	private int cargo;
	

	public Track() {
		super("gaz", new Engine(4.2f));
		System.out.println("Track()");
	}

	public Track(int cargo) {
		super();
		this.cargo = cargo;
	}

	public int getCargo() {
		return cargo;
	}

	public void setCargo(int cargo) {
		this.cargo = cargo;
	}
	

}
