

public class BuildingAssembly {

	public static void assembleBuilding(int[][] floorsAndDays) {
		
		
		InsertionSortUtil.insertionSort(floorsAndDays);


		for (int i = 0; i < floorsAndDays.length; i++) {
}
		System.out.println(
				"\nNow iterating DS and \nif Largest unassembled floor is unavailable TODAY then no floor is assembled today");

		int floorIndex = 0;
		
		
		for (int i = 0; i < floorsAndDays.length; i++) {
			System.out.println("Day " + (i + 1) + " Floors made today : ");
			
			
			while (floorIndex < floorsAndDays.length) {
				if (floorsAndDays[floorIndex][1] <= (i + 1)) {
					System.out.println("\tFloor : " + floorsAndDays[floorIndex][0]);
					floorIndex++;
				} else {
					break;
				}
			}
		}
	}
}