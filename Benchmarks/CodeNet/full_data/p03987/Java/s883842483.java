import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int n = sc.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		long sum = 0;
		int min;
		for (int i = 0; i < n; i++) {
			min = a[i];
			sum += min;
			for (int j = i + 1; j < n; j++) {
				min = Math.min(min, a[j]);
				sum += min;
			}
		}
		System.out.println(sum);
	}
}