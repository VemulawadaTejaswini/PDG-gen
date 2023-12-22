
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	class Pair{
		int h;
		int w;
		Pair(int h, int w){
			this.h=h;
			this.w=w;
		}
	}
	public void run() {
		Scanner sc = new Scanner(System.in);
		int H=sc.nextInt();
		int W=sc.nextInt();
		int D=sc.nextInt();
		int a[][] = new int[H][W];
		Map<Integer, Pair> m = new HashMap<>();
		for(int i=0; i<H; i++) {
			for(int j=0; j<W; j++) {
				int v=sc.nextInt();
				a[i][j]=v;
				m.put(v, new Pair(i,j));
			}
		}
		int Q = sc.nextInt();
		for(int i=0; i<Q; i++) {
			int l=sc.nextInt();
			int r=sc.nextInt();
			int ans = 0;
			while(l != r) {
				int n=l+D;
				Pair p1 = m.get(l);
				Pair p2 = m.get(n);
				ans += Math.abs(p1.h-p2.h) + Math.abs(p1.w-p2.w);
				l=n;
			}
			System.out.println(ans);
		}

		sc.close();
	}

}
