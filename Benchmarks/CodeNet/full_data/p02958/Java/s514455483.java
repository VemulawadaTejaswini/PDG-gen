import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		sc.close();

		int cnt = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] != i + 1) {
				cnt++;
			}
		}
		if (cnt <= 2) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
}
