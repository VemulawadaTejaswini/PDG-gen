import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}

		int ma = 0;
		int mi = 1000000007;

		for (int i = 0; i < n; i++) {
			ma = Math.max(a[i], ma);
			mi = Math.min(a[i], mi);
		}

		System.out.println(ma - mi);
	}

}
