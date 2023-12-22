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
		final int MAX = 100000;

		//入力
		int n = sc.nextInt();
		long k = sc.nextLong();
		long[] nums = new long[MAX];
		Arrays.fill(nums, 0);
		for(int i = 0; i < n; i++){
			int a = sc.nextInt();
			long b = sc.nextLong();
			a--;
			nums[a] += b;
		}
		sc.close();

		//処理
		int ans = -1;
		for(int i = 0; i < MAX; i++){
			if(k <= nums[i]){
				ans = i + 1;
				break;
			}else{
				k -= nums[i];
			}
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