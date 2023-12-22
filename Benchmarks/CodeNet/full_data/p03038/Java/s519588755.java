import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner seer = new Scanner(System.in);
		int n = seer.nextInt(); int m = seer.nextInt();
		PriorityQueue<Long> set = new PriorityQueue<>();
		for(int i = 0; i < n; i++){
			set.add(seer.nextLong());
		}
		Pair[] ps = new Pair[m];
		for(int i = 0; i < m; i++){
			int b = seer.nextInt();
			int c = seer.nextInt();
			ps[i] = new Pair(b, c);
		}
		Arrays.sort(ps);
		for(int i = m-1; i >= 0; i--){
			int b = ps[i].b; long c = ps[i].c;
			while(b > 0){
				long x = set.poll();
				if(x < c){
					set.add(c);
					b--;
				}
				else{
					set.add(x);
					break;
				}
			}
			if(b > 0) break;
		}
		long tot = 0;
		for(long a: set) tot += a;
		System.out.println(tot);
	}
	static class Pair implements Comparable<Pair>{
		int b; long c;
		public Pair(int b, long c){
			this.b = b; this.c = c;
		}
		@Override
		public int compareTo(Pair P) {
			if(c < P.c) return -1;
			else if(c == P.c) return 0;
			else return 1;
		}
	}
}
