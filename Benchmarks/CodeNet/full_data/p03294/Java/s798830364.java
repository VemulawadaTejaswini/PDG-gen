import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		long max = 0;
		for(int i = 1; i <= 100001; i++) {
			long temp = 0;
			for(int j = 0; j < n; j++) {
				temp += i%a[j];
			}
			max = Math.max(temp, max);
		}
		System.out.println(max);
	}
}