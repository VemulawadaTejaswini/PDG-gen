import java.util.*;
public class Main {

	static class event{
		int t, v, x;
		event(int t, int v, int x){
			this.t = t;
			this.v = v;
			this.x = x;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int Q = sc.nextInt();
		event[] e = new event[N*2];
		for(int i = 0; i < N; i++) {
			int S = sc.nextInt();
			int T = sc.nextInt();
			int X = sc.nextInt();
			e[i] = new event(S - X, 1, X);
			e[N*2-1-i] = new event(T - X, -1, X);
		}
		Arrays.sort(e, (x, y) -> x.t != y.t ? x.t - y.t : x.v - y.v);
		TreeSet<Integer> b = new TreeSet<>();
		int i = 0;
		StringBuilder ans = new StringBuilder();
		for(int q = 0; q < Q; q++) {
			int D = sc.nextInt();
			while(true) {
				if(i >= N*2 || e[i].t > D)
					break;
				if(e[i].v == 1)
					b.add(e[i].x);
				else
					b.remove(e[i].x);
				i++;
			}
			ans.append(b.size() == 0 ? -1 + "\n" : b.first() + "\n");
		}
		System.out.println(ans);
	}

}