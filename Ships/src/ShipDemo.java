
public class ShipDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ship s1 = new Ship("Titanic", "1992");
		System.out.println(s1);
		
		CruiseShip s2 = new CruiseShip("Royal Carribbean","2004",1500);
		System.out.println(s2);
		
		CargoShip s3 = new CargoShip("Blue Whale", "2009", 2000);
		System.out.println(s3);
		
		System.out.println("\nChanging name of Cargo Ship...");
		
		s3.setName("Green Machine");
		System.out.println(s3);
	}
	
}