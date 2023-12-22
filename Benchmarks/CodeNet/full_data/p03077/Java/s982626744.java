import java.util.Scanner;

public class Main {
	static long[]m = new long[5];
	static long Mod = 1000_000_007;

	public static void main(String[] args) {
		Main main = new Main();
		main.solve();
	}

	void solve() {
		Scanner sc = new Scanner(System.in);
		long n = Long.parseLong(sc.next());
		long min = 1000000000000000L;
		for(int i=0;i<5;i++) {
			m[i]=Long.parseLong(sc.next());
			if(m[i]<min)min=m[i];
		}
		sc.close();

		long res = 0;
		if(min<n) {
			res = n/min;
			if(n%min==0)res--;
		}
		res+=5;

		System.out.println(res);
	}

}