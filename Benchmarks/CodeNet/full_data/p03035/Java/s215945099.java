import java.util.Scanner;

public class Main {

	/**
	 * problem solver
	 */
	public static class Problem {

		/**
		 * paramters
		 */
		private int a;
		private int b;

		/**
		 * constructor
		 */
		Problem() {
			a = 0;
			b = 0;
		}

		/**
		 * standard input
		 */
		void input() {
			Scanner sc = new Scanner(System.in);
			a = sc.nextInt();
			b = sc.nextInt();
			sc.close();
		}


		/**
		 * solver
		 */
		void solve() {
			int ans=0;
			if (a >=13) {
				ans = b;
			} else if (6 <= a && a <= 12) {
				ans = b/2;
			} else {
				ans = 0;
			}
			
			System.out.println(ans);
		}

	}

	public static void main(String args[]) {

		Problem p = new Problem();

		p.input();

		p.solve();
	}
}
