
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	class P implements Comparable<P>{
		double s;
		double t;
		int id;
		P(double s, double t, int id){
			this.s=s;
			this.t=t;
			this.id=id;
		}
		@Override
		public int compareTo(P arg0) {
			return Double.compare(this.t, arg0.t);
		}
	}
	public void run() {
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt();
		int C=sc.nextInt();
		ArrayList<P> l = new ArrayList<>();
		for(int i=0; i<N; i++) {
			double s = sc.nextDouble();
			s -= 0.5;
			double t = sc.nextDouble();
			int c = sc.nextInt();
			l.add(new P(s,t,c));
		}

		Collections.sort(l);
		ArrayDeque<P> q = new ArrayDeque<>();
		q.add(l.get(0));
		int ans = 1;
		for(int i=1; i<N; i++) {
			P p = l.get(i);
			if(q.peek().t<=p.s) {
				q.poll();
			}
			q.add(p);
			ans = Math.max(ans, q.size());
		}
		System.out.println(ans);
		sc.close();
	}
}
