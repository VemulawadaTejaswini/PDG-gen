import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		sc.close();

		StringBuilder sb0 = new StringBuilder();
		StringBuilder sb1 = new StringBuilder();
		for (int i = 0; i < n; i++) {
			if (i % 2 == 0) {
				sb0.append(a[i]).append(' ');
			} else {
				sb1.append(a[i]).append(' ');
			}
		}
		sb0.deleteCharAt(sb0.length() - 1);
		if (sb1.length() == 0) {
			System.out.println(sb0.toString());
			return;
		}
		sb1.deleteCharAt(sb1.length() - 1);
		if (n % 2 == 0) {
			sb1.reverse();
			sb1.append(' ').append(sb0);
			System.out.println(sb1.toString());
		} else {
			sb0.reverse();
			sb0.append(' ').append(sb1);
			System.out.println(sb0.toString());
		}
	}
}
