
public class CargoShip extends Ship {
	private int cargoCap;
	
	public CargoShip(String n, String y, int cap) {
		super(n, y);
		cargoCap = cap;
	}
	
	public CargoShip() {
		super();
		cargoCap = 0;
	}
	
	public void setCap(int cap) {
		cargoCap = cap;
	}
	
	public int getCap() {
		return cargoCap;
	}
	
	@Override
	public String toString() {
		String str = "\nShip Name: " + super.getName();
		str += "\nCargo Capacity: " + cargoCap + "(tons)"; 
		return str;
	}
}
