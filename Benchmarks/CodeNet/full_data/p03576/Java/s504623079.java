
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	class P{
		long x;
		long y;
		P(long x,long y){
			this.x=x;
			this.y=y;
		}
	}
	public void run() {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		ArrayList<P> pl = new ArrayList<P>();
		for(int i=0; i<n; i++) {
			P p = new P(sc.nextLong(), sc.nextLong());
			pl.add(p);
		}
		Collections.sort(pl, (x,y)->Long.compare(x.x, y.x));
		long ans = Long.MAX_VALUE;
		for(int i=0; i<n-k+1; i++) {
			P p = pl.get(i);
			long minx = p.x;
			long miny = p.y;
			long maxx = p.x;
			long maxy = p.y;
			for(int j=i+1; j<i+k; j++) {
				P p2 = pl.get(j);
				minx = Math.min(minx, p2.x);
				miny = Math.min(miny, p2.y);
				maxx = Math.max(maxx, p2.x);
				maxy = Math.max(maxy, p2.y);
			}
			long tmp = Math.abs(minx-maxx) * Math.abs(miny-maxy);
			ans = Math.min(ans, tmp);
		}
		System.out.println(ans);
		sc.close();
	}


}
