import java.io.PrintWriter;
import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		final int MOD = 1000000007;
		final int INF = 1100000000;

		//入力
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i = 0; i < n; i++){
			a[i] = sc.nextInt();
		}
		sc.close();

		//処理
		long ans = (1 << 30);
		boolean bool = true;
		for(int count = 0; count < 2; count++){
			long temp = 0;
			bool ^= true;
			boolean f = bool;
			long sum = 0;
			for(int i = 0; i < n; i++){
				sum += (long)a[i];
				if(sum > 0 == f){
					//nothing
				}else{
					temp += (long)Math.abs(sum) + 1;
					if(f){
						sum = 1;
					}else{
						sum = -1;
					}
				}
				f ^= true;
			}
			ans = Math.min(ans, temp);
		}

		//出力	
		out.println(ans);
		out.flush();
	}

	static class Pair{
		int w,v;
		public Pair(int a, int b){
			this.w = a;
			this.v = b;
		}
	}
}