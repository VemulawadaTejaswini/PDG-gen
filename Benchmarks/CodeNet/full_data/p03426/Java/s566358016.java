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
				v--;
				a[i][j]=v;
				m.put(v, new Pair(i,j));
			}
		}
		int sum[][] = new int[D][H*W+1];
		for(int i=0; i<D; i++) {
			Pair p1 = m.get(i);
			int preh=p1.h;
			int prew=p1.w;
			for(int j=i; j<H*W-D; j+=D) {
				Pair p2 = m.get(j+D);
				sum[i][j+D] = sum[i][j] + Math.abs(p2.h-preh) + Math.abs(p2.w-prew);
				preh=p2.h;
				prew=p2.w;
			}

		}
		int Q = sc.nextInt();
		for(int i=0; i<Q; i++) {
			int l=sc.nextInt();l--;
			int r=sc.nextInt();r--;
			int l2 = l%D;
			int ans = sum[l2][r]-sum[l2][l];
			System.out.println(ans);
		}
		sc.close();
	}

}
