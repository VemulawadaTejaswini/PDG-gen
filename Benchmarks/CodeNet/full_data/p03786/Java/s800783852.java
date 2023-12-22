
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = s.nextInt();

		}
		Arrays.sort(arr);

		int count = 1;
		int curr = arr[0];
	
		for (int j = 1; j < n; j++) {
			if (arr[j] <= 2 * curr) {
				count++;

			} else {
				count = 1;
			}
			curr += arr[j];

		}
		System.out.println(count);

	}

}