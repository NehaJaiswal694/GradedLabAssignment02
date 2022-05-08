

public class InsertionSortUtil {

	
	public static void insertionSort(int array[][]) {
		int n = array.length;
		int forCount = 0, whileCount = 0;
		for (int j = 1; j < n; j++) {
			int[] key = array[j];

			int i = j - 1;
			while ((i > -1) && (array[i][0] < key[0])) {
				array[i + 1] = array[i];
				i--;

			}
			array[i + 1] = key;

		}
	}

}