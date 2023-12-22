import java.util.*;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	class Ev implements Comparable<Ev>{
		int x;
		int time;
		int kind;

		public Ev(int x, int time, int kind) {
			this.x=x;
			this.time=time;
			this.kind=kind;
		}

		@Override
		public int compareTo(Ev arg0) {
			return this.time - arg0.time;
		}
	}

	public void run() {
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt();
		int Q=sc.nextInt();

		ArrayList<Ev> ev = new ArrayList<>();
		for(int i=0; i<N; i++) {
			int s=sc.nextInt();
			int t=sc.nextInt();
			int x=sc.nextInt();
			ev.add(new Ev(x, s-x, 1));
			ev.add(new Ev(x, t-x, -1));
		}

		Collections.sort(ev);

		ArrayList<Integer> D = new ArrayList<>();
		for(int i=0; i<Q; i++) {
			D.add(sc.nextInt());
		}

		TreeSet<Integer> set = new TreeSet<>();

		int ans[] = new int[Q];
		Arrays.fill(ans, -1);
		int didx = 0;

		for(Ev e : ev) {

			//アクティブイベントに対してDがぶつかるかテスト
			while(didx<D.size() && D.get(didx) < e.time) {
				if(set.isEmpty()) {
					ans[didx] = -1;
				}else {
					ans[didx] = set.first();
				}
				didx++;
			}


			//アクティブイベント更新
			if(e.kind==1) {
				set.add(e.x);
			} else {
				set.remove(e.x);
			}
		}

		for(int i=0; i<Q; i++) {
			System.out.println(ans[i]);
		}

		sc.close();
	}
}
