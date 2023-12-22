import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(sc.next());
		}

		int count = solve(a);

		System.out.println(count);
		sc.close();
	}

	public static int solve(int[] a) {
		boolean flag = true;
		int count = 0;
		while (flag) {
			for (int i = 0; i < a.length; i++) {
				if (a[i] % 2 == 1) {
					flag = false;
				}
			}
			if (flag) {
				for (int i = 0; i < a.length; i++) {
					a[i] /= 2;
				}
				count++;
			}
		}
		return count;
	}

}