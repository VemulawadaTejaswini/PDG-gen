import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int l = sc.nextInt();
		int[] aji = new int[n];
		for (int i = 0; i < aji.length; i++) {
			aji[i] = i + l;
		}
		int sum = 0;
		int sum1 = 0;
		int sum2 = 0;
		for (int i = 0; i < aji.length - 1; i++) {
			sum1 += aji[i];
		}
		for (int i = 1; i < aji.length; i++) {
			sum2 += aji[i];
		}
		for (int i = 0; i < aji.length; i++) {
			sum += aji[i];
		}
		int sum3 = sum - aji[(n - 1) / 2];
		if (Math.abs(sum - sum3) < Math.abs(sum - sum1) && Math.abs(sum - sum3) < Math.abs(sum - sum2)) {
			System.out.println(sum3);
		} else {
			if (Math.abs(sum - sum1) <= Math.abs(sum - sum2)) {
				System.out.println(sum1);
			} else {
				System.out.println(sum2);
			}
		}
	}
}
