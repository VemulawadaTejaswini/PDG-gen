
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	class Tuple implements Comparable<Tuple>{
		int x;
		int s;
		int t;
		public Tuple(int x, int s, int t) {
			this.x=x;
			this.s=s;
			this.t=t;
		}
		@Override
		public int compareTo(Tuple arg0) {
			return Integer.compare(this.x, arg0.x);
		}
	}

	class Pair implements Comparable<Pair>{
		int d;
		int i;
		Pair(int d, int i){
			this.d=d;
			this.i=i;
		}
		@Override
		public int compareTo(Pair o) {
			return Integer.compare(this.d, o.d);
		}
	}

	public void run() {
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt();
		int Q=sc.nextInt();

		ArrayList<Tuple> a = new ArrayList<>();
		for(int i=0; i<N; i++) {
			int s = sc.nextInt();
			int t = sc.nextInt();
			int x = sc.nextInt();
			Tuple tuple = new Tuple(x, s-x, t-x);
			a.add(tuple);
		}
		Collections.sort(a);

		SortedSet<Pair> ts = new TreeSet<>();
		for(int i=0; i<Q; i++) {
			ts.add(new Pair(sc.nextInt(), i));
		}

		ArrayList<Integer> ans = new ArrayList<>();
		for(int i=0; i<Q; i++) {
			ans.add(-1);
		}

		for(int i=0; i<N; i++) {
			Tuple tu = a.get(i);
			int x = tu.x;
			int s = tu.s;
			int t = tu.t;

			Iterator<Pair> it = ts.tailSet(new Pair(s,-1)).iterator();
			while(it.hasNext()) {
				Pair p = it.next();
				if(p.d>=t) break;
				ans.set(p.i, x);
				it.remove();
			}
		}

		for(int i=0; i<Q; i++) {
			System.out.println(ans.get(i));
		}
		sc.close();
	}
}
