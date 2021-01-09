import java.util.Scanner;

public class SelectionforUser {

	public static void selectionForUser() {
		@SuppressWarnings("resource")
		Scanner keyInput = new Scanner(System.in);

		System.out.println("\nPress 1 for List of Available Units");
		System.out.println("\nPress 2 for List of Rented Units");
		System.out.println("\nPress 3 to Create a Unit");
		System.out.println("\nPress 0 to Exit");
		int i = 1;
		while (i == 1) {
			int choice;
			choice = keyInput.nextInt();

			if (choice == 1) {
				AvailableUnits.unitSelectionScreen();
			} else if (choice == 3) {

				Unit x = Unit.createUnitScreen();
				System.out.println("Unit Number: " + x.getUnitNumber() + " Size: " + x.getUnitSize());
			} else if (choice == 0) {
				System.exit(0);

			}
		}
	}
}
