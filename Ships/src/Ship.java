
public class Ship {
	private String shipName; //The name of the ship
	private String yearBuilt; //The year the ship was built
	
	/**
	 * Constructor for the ship object
	 * @param n The ship name
	 * @param y The build year
	 */
	public Ship(String n, String y) {
		shipName = n;
		yearBuilt = y;
	}
	
	/**
	 * No-arg constructor for the ship object
	 */
	public Ship() {
		shipName = "";
		yearBuilt = "";
	}
	
	/**
	 * The set name method sets the ship's name
	 * @param n the name of the ship
	 */
	public void setName(String n) {
		shipName = n;
	}
	
	/**
	 * The setBuildYear method sets the ships build year
	 * @param y the year the ship was built
	 */
	public void setBuidYear(String y) {
		yearBuilt = y;
	}
	
	/**
	 * The getName method returns the name of the ship
	 * @return the ships name
	 */
	public String getName() {
		return shipName;
	}
	
	/**
	 * The getBuildYear method returns the ships build year
	 * @return the year the ship was built
	 */
	public String getBuildYear() {
		return yearBuilt;
	}
	
	public String toString() {
		String str = "\nShip Name: " + shipName;
		str += "\nBuild Year: " + yearBuilt;
		return str;
	}
}
