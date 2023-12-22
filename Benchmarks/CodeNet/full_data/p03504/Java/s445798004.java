import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		
		int N = scanner.nextInt();
		int C = scanner.nextInt();
		
		Program[] pgs = new Program[N];
		for (int i = 0; i < N; i++) {
			pgs[i] = new Program();
			pgs[i].s = scanner.nextInt();
			pgs[i].t = scanner.nextInt();
			pgs[i].c = scanner.nextInt();
		}
		
		int rn = 1;
		Recoder[] recs = new Recoder[N];
		recs[0] = new Recoder(N);
		recs[0].add(pgs[0]);

		System.out.println(String.format("Rec set %d: %s", 0, recs[0].toString()));
		for (int i = 1; i < N; i++) {
			int l = rn;
			for (int j = 0; j < l; j++) {
				if (recs[j].isAvailable(pgs[i])) {
					recs[j].add(pgs[i]);
					break;
				}
				if (j + 1 == l) {
					recs[rn] = new Recoder(N - i);
					Program p = new Program();
					p.s = pgs[i].s;
					p.t = pgs[i].t;
					p.c = pgs[i].c;
					recs[rn].add(p);
					rn++;
				}
			}
		}
		
		System.out.println(rn);
		
	}
	
	static public class Program {
		public int s;
		public int t;
		public int c;

		@Override
		public String toString() {
			return String.format("%d %d %d", this.s, this.t, this.c);
		}
	}
	
	static public class Recoder {
		int n;
		Program[] res;
		
		public Recoder(int N) {
			n = 0;
			res = new Program[N];
		}
		
		public void add(Program p) {
			res[n] = p;
			n++;
		}
		
		public Boolean isAvailable(Program r) {
			for (int i = 0; i < n; i++) {
				float s1 = (float)r.s;
				float t1 = (float)r.t;
				float s2 = (float)res[i].s;
				float t2 = (float)res[i].t;
				boolean sc = r.c == res[i].c;
				if (s1 >= s2 && (sc ? s1 : s1 - 0.5) < t2) return false;
				if (t1 <= t2 && t1 > (sc ? s2 : s2 - 0.5)) return false;
			}
			return true;
		}
	}

}
