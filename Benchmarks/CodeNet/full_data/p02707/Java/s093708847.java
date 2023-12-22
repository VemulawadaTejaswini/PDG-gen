import java.util.Scanner;

public class Main {
	public static void main(String args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int a[] = new int[200000];
		int ans[] = new int[200000];

		for (int i = 2; i <= n; i++) {
			a[i] = scan.nextInt();
			ans[a[i]]++;
		}

		scan.close();

		for (int i = 1; i <= n; i++) {
			System.out.println(ans[i]);
		}

	}
}