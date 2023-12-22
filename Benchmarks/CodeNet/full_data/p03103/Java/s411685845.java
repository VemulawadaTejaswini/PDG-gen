import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);

	void doIt() {
		int N = sc.nextInt();
		int M = sc.nextInt();
		pInt[] drink = new pInt[N];
		for(int i = 0; i < N; i++) {
			drink[i] = new pInt(sc.nextInt(), sc.nextInt());
		}
		Arrays.sort(drink);
		long ans = 0;
		for(int i = 0; i < N; i++) {
			if(M > drink[i].cap) {
				ans += drink[i].cap * drink[i].cost;
				M -= drink[i].cap;
			}
			else {
				ans += M * drink[i].cost;
				System.out.println(ans);
				return;
			}
		}
	}
	
	class pInt implements Comparable<pInt>{
		long cost;
		long cap;
		pInt(long c, long n){
			cost = c;
			cap = n;
		}
		@Override
		public int compareTo(pInt arg0) {
			return (int)(this.cost - arg0.cost);
		}
		
		
	}
	
	public static void main(String[] args) {
		new Main().doIt();
	}
}
