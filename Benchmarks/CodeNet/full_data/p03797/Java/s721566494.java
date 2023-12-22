import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		main.solve();
	}

	void solve() {
		Scanner sc = new Scanner(System.in);
		long n = Long.parseLong(sc.next());
		long m = Long.parseLong(sc.next());
		sc.close();

		//nとm*2は等価である為m/2して扱いやすいように 奇数の場合1を切り捨てても問題ない
		m/=2;
		if(n < m) {
			//極端にnとmの差が大きい場合の高速化する為の処理
			n += m/2;m-=m/2;m+=n/2;n-=n/2;
			while(m-n>=20000000000L) {n+=10000000000L; m-=10000000000L;}
			while(m-n>=200000000L) {n+=100000000L; m-=100000000L;}
			while(n+n<m-n) {m-=n; n+=n;}
			while(n<m){m--; n++;}
		}
		//作れる個数 Math.min(n,m)
		System.out.println(n<m?n:m);
	}

}
