import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	/**
	 * problem solver
	 */
	public static class Problem {

		/**
		 * paramters
		 */
		private int n;
		private int m;
		private ArrayList<Integer> l;
		private ArrayList<Integer> r;

		/**
		 * constructor
		 */
		Problem() {
			l = new ArrayList<Integer>();
			r = new ArrayList<Integer>();
			n = 0;
			m = 0;
		}

		/**
		 * standard input
		 */
		void input() {
			Scanner sc = new Scanner(System.in);
			n = sc.nextInt();
			m = sc.nextInt();

			for (int i = 0; i < m; i++) {
				l.add(sc.nextInt());
				r.add(sc.nextInt());
			}
			sc.close();
		}


		/**
		 * solver
		 */
		void solve() {
			int lmax = -1;
			int rmin = Integer.MAX_VALUE;

			for (int i = 0; i < m; i++) {
				lmax = Math.max(lmax, l.get(i));
				rmin = Math.min(rmin, r.get(i));
			}

			int ans = 0;
			
			if (lmax <= rmin) {
				ans = rmin - lmax + 1;
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
