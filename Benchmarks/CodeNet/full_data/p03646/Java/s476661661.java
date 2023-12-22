import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long k = sc.nextLong();
		long[] a = new long[50];
		long t = k / 50;
		long m = k % 50;
		for (int i = 0; i < 50; i++) {
			a[i] = i + t;
		}

		for (int i = 0; i < m; i++) {
			a[49 - i] += 50 - (i + 2);
		}

		System.out.println(50);
		for (int i = 0; i < 50; i++) {
			System.out.print(a[i]);
			System.out.print(" ");
		}
		System.out.println();
	}
}
