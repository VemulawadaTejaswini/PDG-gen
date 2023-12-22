import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();
		int amountArray[] = new int[n];
		for (int i = 0; i < n; i++) {
			amountArray[i] = sc.nextInt();
		}
		Arrays.sort(amountArray);
		for (int i = 0; i < m; i++) {
			amountArray[n-1] = (int) amountArray[n-1] / 2;
			Arrays.sort(amountArray);
		}

		System.out.println(Arrays.stream(amountArray).sum());
		sc.close();
	}
}
