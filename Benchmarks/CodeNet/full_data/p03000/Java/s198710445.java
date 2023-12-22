import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int n = in.nextInt();
		int x = in.nextInt();

		int ans = 0;
		int sum = 0;
		int[] l = new int[n];
		for ( int i = 0; i < n; i++ ) {
			l[i] = in.nextInt();
		}

		for ( int i = 0; i < n; i++ ) {
			sum += l[i];

			if ( sum == x ) {
				ans = i + 2;
				System.out.println(ans);
				return;
			} else if ( sum > x ) {
				ans = i + 1;
				System.out.println(ans);
				return;
			}
		}

		System.out.println(n + 1);
		in.close();
	}
}
