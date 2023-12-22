
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	class Pair implements Comparable<Pair>{
		int x;
		int y;
		Pair(int x, int y){
			this.x=x;
			this.y=y;
		}
		@Override
		public int compareTo(Pair o) {
			if(this.y==o.y) {
				return Integer.compare(o.x, this.x);
			}
			return Integer.compare(this.y, o.y);
		}


	}
	public void run() {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		ArrayList<Pair> a = new ArrayList<>();
		for(int i=0; i<m; i++) {
			a.add(new Pair(sc.nextInt(), sc.nextInt()));
		}

		Collections.sort(a);

		int t=-1;
		int cnt=0;
		for(int i=0; i<m; i++) {
			Pair p = a.get(i);
			if(t<=p.x) {
				cnt++;
				t=p.y;
			}
		}
		System.out.println(cnt);
		sc.close();
	}


}
