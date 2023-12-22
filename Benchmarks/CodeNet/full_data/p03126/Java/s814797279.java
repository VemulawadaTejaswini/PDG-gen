import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int n = cin.nextInt();
		int m = cin.nextInt();
		int[] arr = new int[m + 1];
		for (int i = 0; i < n; i++) {
			int t = cin.nextInt();
			for (int j = 0; j < t; j++) {
				int idx = cin.nextInt();
				arr[idx]++;
			}
		}
		int sum = 0;
		for (int i = 1; i <= m; i++) 
			if (arr[i] == n)
				sum++;
		System.out.println(sum);
	}
}