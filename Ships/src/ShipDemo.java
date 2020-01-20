/*
 * This Program simply creates a class and two subclasses from that class.
 * THe program prints the contents of the object created from that class
 * using a toString() method.
 */
public class ShipDemo {

	public static void main(String[] args) {
		//First object created from Ship Class
		Ship s1 = new Ship("Titanic", "1992");
		System.out.println(s1);
		
		//Second object created from Cruiseship class
		CruiseShip s2 = new CruiseShip("Royal Carribbean","2004",1500);
		System.out.println(s2);
		
		//Third object created from CargoShip class
		CargoShip s3 = new CargoShip("Blue Whale", "2009", 2000);
		System.out.println(s3);
		
		System.out.println("\nChanging name of Cargo Ship...");
		
		//Changes to the third object using a setName() method in the Ship class
		s3.setName("Green Machine");
		System.out.println(s3);
	}
	
}