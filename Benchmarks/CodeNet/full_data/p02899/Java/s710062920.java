
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = in.nextInt();
		}

		int[] arr2 = new int[n];
		for(int i = 1; i <= n; i++) {
			for(int j = 0; j < n; j++) {
				if(arr[j] == i) {
					arr2[i-1] = j + 1;
				}
			}
		}


		System.out.print(arr2[0]);
		for(int i = 1; i < n; i++)
			System.out.print(" " + arr2[i]);
	}
}