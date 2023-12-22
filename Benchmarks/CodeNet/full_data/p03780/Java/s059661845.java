import java.io.PrintWriter;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main{
	static int n, k;
	static int[] a;

	public static void main(String[] args){
		//入力
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		k = sc.nextInt();
		a = new int[n];
		for(int i = 0; i < n; i++){
			a[i] = sc.nextInt();
		}
		sc.close();

		//処理
		Arrays.sort(a);
		int ret = binarySearch();
		int ans = 0;
		if(ret >= 0){
			ans = Math.min(n, ret + 1);
		}

		//出力
		PrintWriter out = new PrintWriter(System.out);
		out.println(ans);
		out.flush();
	}

	private static int binarySearch(){
		int ng = n; //条件を満たさない
		int ok = -1;  //条件を満たす

		while(Math.abs(ok - ng) > 1){
			int mid = (ok+ng) / 2;
			if(isOK(mid)) ok = mid;
			else ng = mid;
		}

		return ok;
	}

	static int[][] dp = new int[5000][5000];

	private static boolean isOK(int notuse){
		for(int[] t : dp) Arrays.fill(t, -1);
		dp[0][0] = 1;
		List<Integer> b = new ArrayList<>();
		for(int i = 0; i < n; i++){
			if(i != notuse && a[i] <= k) b.add(a[i]);
		}
		int m = b.size();

		for(int i = 0; i < m; i++){
			for(int j = 0; j < k; j++){
				if(dp[i][j] == 1){
					dp[i+1][j] = 1;
					if(j + b.get(i) < k) dp[i+1][j+b.get(i)] = 1;
				}
			}
		}

		boolean f = true;
		for(int i = k - a[notuse]; i < k; i++){
			if(dp[m][i] == 1) f = false;
		}

		return f;
	}
}