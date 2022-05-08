import java.util.Scanner;

public class DriverBuildingAssembly {

	public static final Scanner sc = new Scanner(System.in);
	public static int floorAndDays[][]; // Stores Floor Size, Day on which it was made available
	
	public static void main(String[] args) {

		System.out.print("\nEnter the Number of Floors to Construct: ");
		int noOfFloors = sc.nextInt();
		floorAndDays = new int[noOfFloors][2];
		
		System.out.println("Enter the size of Floors available on follwing days: ");
		
		for(int i=0; i<noOfFloors; i++)
		{
			System.out.print("Day " + (i+1) + " : ");
			floorAndDays[i][0] = sc.nextInt();// Floor Size
			floorAndDays[i][1] = i+1;         // Day on which the above floor is made available
		}
BuildingAssembly.assembleBuilding(floorAndDays);	
		
	}

}
