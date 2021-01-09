import java.util.Scanner;

public class Unit {

	private String unitNumber;
	private String unitSize;
	private String floor;
	private double price;

	Unit(String unitNumber, String unitSize, String floor, double price) {

		this.setUnitNumber(unitNumber);
		this.setUnitSize(unitSize);
		this.setFloor(floor);
		this.setPrice(price);
	}

	public String getUnitNumber() {
		return unitNumber;
	}

	public void setUnitNumber(String unitNumber) {
		this.unitNumber = unitNumber;
	}

	public String getUnitSize() {
		return unitSize;
	}

	public void setUnitSize(String unitSize) {
		this.unitSize = unitSize;
	}

	public String getFloor() {
		return floor;
	}

	public void setFloor(String floor) {
		this.floor = floor;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public static Unit createUnitScreen() {
		System.out.println("\nYou Pressed 3 and now you are in the Unit Creation Screen");
		Scanner keyInput = new Scanner(System.in);
		System.out.print("\nEnter Unit Number: ");
		String b = keyInput.next();
		System.out.print("\nEnter Unit Size: ");
		String c = keyInput.next();
		System.out.print("\nEnter Floor: ");
		String d = keyInput.next();
		System.out.print("\nEnter Unit Price: ");
		double e = keyInput.nextDouble();
		// keyInput.close();???
		System.out.println("\nUnit Created ");
		Unit unit = new Unit(b, c, d, e);
		return unit;
	}

}
