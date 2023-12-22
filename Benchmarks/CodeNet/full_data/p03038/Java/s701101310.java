import java.io.Serializable;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Objects;
import java.util.PriorityQueue;
import java.util.Scanner;

import atcoder.abc127.f.Main.Problem.Sushi;

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
		private ArrayList<Long> a;
		private ArrayList<Long> c;
		private ArrayList<Integer> b;

		/**
		 * constructor
		 */
		Problem() {
			a = new ArrayList<Long>();
			c = new ArrayList<Long>();
			b = new ArrayList<Integer>();
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

			for (int i = 0; i < n; i++) {
				a.add(sc.nextLong());
			}
			
			for (int i = 0; i < m; i++) {
				b.add(sc.nextInt());
				c.add(sc.nextLong());
			}
			sc.close();
		}


		public static class Bc implements Comparable<Bc>, Serializable {

			private static final long serialVersionUID = 7126883977005996870L;

			public int b;
			public long c;

			Bc(int b, long c) {
				this.b = b;
				this.c = c;
			}

//            @Override
//            public int hashCode() {
//            	return Objects.hash(t,d);
//            }

			@Override
			public boolean equals(Object other) {
				if (other == this) {
					return true;
				}

				if (other instanceof Bc) {
					Bc that = (Bc) other;
					return Objects.equals(that.b, this.b) && Objects.deepEquals(that.c, this.c);
				}
				return false;
			}

			@Override
			public int compareTo(Bc that) {
				Comparator<Long> naturalOrder = Comparator.naturalOrder();
				return Objects.compare(this.c, that.c, naturalOrder);
			}

			@Override
			public String toString() {
				Object[] params = { b, c };
				MessageFormat mf = new MessageFormat("({0},{1})");
				return mf.format(params);
			}
		}
		

		/**
		 * solver
		 */
		void solve() {
			PriorityQueue<Long> pque = new PriorityQueue<>();
			ArrayList<Bc> bcs = new ArrayList<>();
			ArrayList<Long> candidates = new ArrayList<>();

			for (Long e : a) {
				pque.add(e);
			}
			
			for (int i =0; i < m;i++) {
				Bc bc = new Bc(b.get(i), c.get(i));
				bcs.add(bc);				
			}
			
			Collections.sort(bcs, Collections.reverseOrder());
			
			
			for(Bc bc : bcs) {
				for(int i=0;i<bc.b;i++) {
					candidates.add(bc.c);
					
					if(candidates.size() == n) {
						break;
					}
				}
				if (candidates.size() == n) {
					break;
				}
			}

			for(long l: candidates) {
				long amin = pque.peek();
				if (amin < l) {
					pque.poll();
					pque.add(l);
				}
			}
			
			
			long ans = 0;
			for (long e: pque) {
				ans += e;
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
