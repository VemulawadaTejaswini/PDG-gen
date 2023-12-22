import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Rest[] rests = new Rest[n];
		for (int i = 0; i < n; i++) {
			rests[i] = new Rest(i + 1, sc.next(), sc.nextInt());
		}
		Arrays.sort(rests, new Comparator<Rest>() {
		public int compare(Rest r1, Rest r2) {
			if (r1.s.equals(r2.s)) {
				return r2.p - r1.p;
			} else {
				return r1.s.compareTo(r2.s);
			}
		}
		});
		StringBuilder sb = new StringBuilder();
		for (Rest r : rests) {
			sb.append(r.idx).append("\n");
		}
		System.out.print(sb);
	}
	
	static class Rest {
		int idx;
		String s;
		int p;
		public Rest(int idx, String s, int p) {
			this.idx = idx;
			this.s = s;
			this.p = p;
		}
		
		public String toString() {
			return s + " " + p;
		}
	}
}
