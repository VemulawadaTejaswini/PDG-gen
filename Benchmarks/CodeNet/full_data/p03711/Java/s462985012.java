import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int[] group1 = {1,3,5,7,8,10,12};
		int[] group2 = {4,6,9,11};
		int[] group3 = {2};
		int h1 = 0;
		int h2 = 0;
		Scanner sc = new Scanner(System.in);
		h1 = sc.nextInt();
		h2 = sc.nextInt();
		sc.close();
		String strValue = "";
		
		if ((Arrays.binarySearch(group1, h1) >= 0 && Arrays.binarySearch(group1, h2) >= 0)
				|| (Arrays.binarySearch(group2, h1) >= 0 && Arrays.binarySearch(group2, h2) >= 0)
				|| (Arrays.binarySearch(group3, h1) >= 0 && Arrays.binarySearch(group3, h2) >= 0)) {
			strValue = "Yes";
		} else {
			strValue = "No";
		}

		System.out.println(strValue);
	}
}