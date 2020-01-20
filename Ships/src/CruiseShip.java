
public class CruiseShip extends Ship {
	private int maxPassengers; //holds the amount of passengers
	
	/**
	 * CruiseShip constructor creates a CruiseShip object
	 * @param n Name of the Ship
	 * @param y Year the ship was built
	 * @param max Maximum number of passengers the ship can hold
	 */
	public CruiseShip(String n, String y, int max) {
		super(n, y);
		maxPassengers = max;
	}
	
	public CruiseShip() {
		super();
		maxPassengers = 0;
	}
	
	/**
	 * The setMax method sets the maximum number of passengers
	 * @param max the maximum number of passengers
	 */
	public void setMax(int max) {
		maxPassengers = max;
	}
	
	public int getMax() {
		return maxPassengers;
	}
	
	@Override
	public String toString() {
		String str = "\nShip Name: " + super.getName();
		str += "\nMaximum Passengers: " + maxPassengers;
		return str;
	}
}
