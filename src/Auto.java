
public class Auto {
	
	private String mark;
	private Engine engine;
	private String color;
	
	
	public Auto() {
		System.out.println("Auto()");
		
	}
	
	public Auto(String mark, Engine engine) {
		
		this.mark = mark;
		this.engine = engine;
		this.color = "white";
		System.out.println("Auto(..)");
	
	}
	
	
	
	public String getColor() {
		return color;
	}

	public String getMark() {
		return this.mark;
						
	}
	
	public Engine getEngine() {
		return engine;
	}
	
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	
	public void upgrade(Engine engine, String color) {
		
		if(engine.getVolume() > this.engine.getVolume()) {
			this.engine = engine;
		}
		if(!color.equals("white")) {
			this.color = color;
		}
		
	}

}
