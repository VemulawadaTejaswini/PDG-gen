import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		solve();
	}

	public static void solve() {
		Scanner sc = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		final int MOD = 1000000007;

		//入力
		int n = sc.nextInt();
		long t = sc.nextInt();
		long[] times = new long[n];
		for(int i = 0; i < n; i++){
			times[i] = sc.nextLong();
		}
		sc.close();

		//処理
		long ans = (long)n * t;
		long last = 0;
		for(int i = 0; i < n; i++){
			if(times[i] < last){
				ans -= last - times[i];
			}
			last = times[i] + t;
		}

		//出力	
		out.println(ans);
		out.flush();
	}

	static class Pair{
		int a,b;
		public Pair(int a, int b){
			this.a = a;
			this.b = b;
		}
	}
}