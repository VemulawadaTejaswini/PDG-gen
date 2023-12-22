import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int n = sc.nextInt();
		int[] a = new int[n];
		int sum = 0;
		for (int i = 0; i < n; i++) {
			int num = sc.nextInt();
			if (num >= k / 2) {
				sum += num - k / 2;
			} else {
				sum += num;
			}
		}
		
		System.out.println(sum);
	}
}
