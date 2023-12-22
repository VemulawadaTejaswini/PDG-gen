import java.util.HashMap;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		main.solve();
	}

	void solve() {
		Scanner sc = new Scanner(System.in);
		int H = Integer.parseInt(sc.next());
		int W = Integer.parseInt(sc.next());
		int D = Integer.parseInt(sc.next());

		HashMap<Integer, Integer> ty = new HashMap<Integer, Integer>();
		HashMap<Integer, Integer> tx = new HashMap<Integer, Integer>();

		for(int i=1;i<=H;i++) {
			for(int j=1;j<=W;j++) {
				int a = Integer.parseInt(sc.next());
				ty.put(a,i);
				tx.put(a,j);
			}
		}
		StringBuilder buf = new StringBuilder();
		int Q = Integer.parseInt(sc.next());
		for(int l=0;l<Q;l++) {
			int L = Integer.parseInt(sc.next());
			int R = Integer.parseInt(sc.next());
			int cnt = 0;
			int y,x,_y,_x;
			y = ty.get(L);
			x = tx.get(L);
			for(;L!=R;) {
				L += D;
				_y = y;_x = x;
				y = ty.get(L);x = tx.get(L);
				cnt+=Math.abs(y-_y)+Math.abs(x-_x);
			}
			buf.append(cnt);
			buf.append(System.getProperty("line.separator"));
		}
		sc.close();
		System.out.println(buf);
	}
}
