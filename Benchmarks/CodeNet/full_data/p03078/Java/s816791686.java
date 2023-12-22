import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static Long []a,b,c;

	public static void main(String[] args) {
		Main main = new Main();
		main.solve();
	}

	void solve() {
		Scanner sc = new Scanner(System.in);
		int x = Integer.parseInt(sc.next());
		int y = Integer.parseInt(sc.next());
		int z = Integer.parseInt(sc.next());
		int K = Integer.parseInt(sc.next());
		a = new Long[x];
		b = new Long[y];
		c = new Long[z];
		for(int i=0;i<x;i++) {
			a[i]=Long.parseLong(sc.next());
		}
		for(int i=0;i<y;i++) {
			b[i]=Long.parseLong(sc.next());
		}
		for(int i=0;i<z;i++) {
			c[i]=Long.parseLong(sc.next());
		}
		sc.close();
		Arrays.sort(a,(a1,a2)->Long.compare(a2,a1));
		Arrays.sort(b,(a1,a2)->Long.compare(a2,a1));
		Arrays.sort(c,(a1,a2)->Long.compare(a2,a1));

		int xyz = Math.min(3000,x*y*z);
		Long[] res = new Long [xyz];
		int cnt = 0;
		for(int i=0;i<x&&cnt<xyz;i++) {
			for(int j=0;j<y;j++) {
				for(int k=0;k<z;k++,cnt++) {
					res[cnt] = a[i]*b[i]*c[i];
				}
			}
		}

		Arrays.sort(res,(a1,a2)->Long.compare(a2,a1));
		for(int i=0;i<K;i++) {
			System.out.println(res[i]);
		}

	}

}