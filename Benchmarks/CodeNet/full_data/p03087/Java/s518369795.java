import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		main.solve();
	}

	void solve() {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		int q = Integer.parseInt(sc.next());
		char[] c = sc.next().toCharArray();
		int[] cnt = new int[n];
		for(int i=1;i<n;i++) {
			cnt[i]=cnt[i-1];
			if(c[i-1]=='A'&&c[i]=='C') {
				cnt[i]++;
			}
		}
		StringBuilder buf = new StringBuilder();
		String s ="\n";

		for(int i=0;i<q;i++) {
			int L = Integer.parseInt(sc.next())-1;
			int R = Integer.parseInt(sc.next())-1;
			buf.append((cnt[R]-cnt[L])+s);
		}
		sc.close();
		System.out.println(buf);
	}
}
