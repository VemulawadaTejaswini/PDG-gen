
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	class P implements Comparable<P>{
		long x;
		long y;
		P(long x, long y){
			this.x=x;
			this.y=y;
		}
		@Override
		public int compareTo(P arg0) {
			return Long.compare(this.x, arg0.x);
		}
	}
	public void run() {
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt();
		int K=sc.nextInt();

		long x[] = new long[N];
		long y[] = new long[N];
		for(int i=0; i<N; i++) {
			x[i]=sc.nextLong();
			y[i]=sc.nextLong();

		}

		long ans = Long.MAX_VALUE;
		//左
		for(int i=0; i<N; i++) {
			long x1 = x[i];
			//右
			for(int j=0; j<N; j++) {
				long x2 = x[j];
				if(x1>=x2) continue;
				//下
				for(int k=0; k<N; k++) {
					long y1 = y[k];
					//上
					for(int l=0; l<N; l++) {
						long y2 = y[l];
						if(y1>=y2) continue;
						int cnt=0;
						for(int m=0; m<N; m++) {
							if(x1<=x[m] && x[m]<=x2 && y1<=y[m] && y[m] <=y2) {
								cnt++;
							}
						}
						if(cnt==K) {
							ans = Math.min(ans, (x2-x1) * (y2-y1));
						}
					}
				}
			}
		}
		System.out.println(ans);
		sc.close();
	}



}
