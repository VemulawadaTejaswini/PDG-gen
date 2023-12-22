import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = Integer.parseInt(sc.next());
		int k = Integer.parseInt(sc.next());
		int q = Integer.parseInt(sc.next());

		int[] a = new int[q];
		int[] an = new int[n];
		for (int i = 0; i < q; i++) {
			a[i] = Integer.parseInt(sc.next());
			an[a[i] - 1]++;
		}

		for (int i = 0; i < n; i++) {
//			System.out.print(an[i]);
			if (k - (q - an[i]) > 0) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		}

		sc.close();
	}
}