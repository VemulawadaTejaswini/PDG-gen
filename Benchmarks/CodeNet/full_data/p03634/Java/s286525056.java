import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		Dijkstra dj = new Dijkstra(n);

		for (int k = 0; k < n - 1; k++) {
			int i, j;
			i = sc.nextInt();
			j = sc.nextInt();

			dj.setE(i, j, sc.nextInt());
		}

		int q = sc.nextInt();
		int k = sc.nextInt();

		dj.dijkstra(k);
		long D[] = new long[n+1];
		for (int i = 0; i <= n; i++) {
			D[i] = dj.D[i];
		}

		for (int i = 0; i < q; i++) {
			System.out.println(dj.D[sc.nextInt()] + D[sc.nextInt()]);
		}

	}

	static class Dijkstra {
		DijList[] e;
		boolean[] S;
		long D[];
		int n;
		int s;

		Dijkstra(int n) {
			this.n = n;
			e = new DijList[n+1];
			S = new boolean[n+1];
			D = new long[n+1];
			for (int i = 0; i <= n; i++) {
				e[i] = new DijList(i, 0);
			}
		}

		void setE(int i, int j, int e) {
			this.e[i].setNext(new DijList(j, e));
			this.e[j].setNext(new DijList(i, e));
		}

		void dijkstra (int s) {
			this.s = s;
			for (int i = 1; i <= n; i++) {
				D[i] = Long.MAX_VALUE;
				S[i] = false;
			}
			D[s] = 0;
			for (int i = 1; i <= n; i++) {
				long min = Long.MAX_VALUE;
				int k = 0;
				for (int j = 1; j <= n; j++) {
					if (!S[j] && D[j] < min) {
						min = D[j];
						k = j;
					}
				}
				S[k] = true;
				for (int j = 1; j <= n; j++) {
					long temp = e[k].getW(j);
					if (temp != -1 && !S[j]) {
						long temp2 = D[k] + temp;
						D[j] = D[j] < temp2 ? D[j] : temp2;
					}
				}
			}
		}
	}

	static class DijList {
		DijList next;
		int n;
		long w;

		public DijList(int n, long w) {
			this.n = n;
			this.w = w;
		}

		public void setNext(DijList next) {
			if (this.next == null) this.next = next;
			else this.next.setNext(next);
		}

		public long getW(int n) {
			if (this.n == n) return w;
			if (this.next == null) return -1;
			return this.next.getW(n);
		}
	}
}
