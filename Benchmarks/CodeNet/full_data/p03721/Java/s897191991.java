import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		solve();
	}

	public static void solve() {
		int ans = -1;
		//入力
  		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Long k = sc.nextLong();
		for(int i = 0; i < n; i++){
			int a = sc.nextInt();
			int b = sc.nextInt();
			if(k > 0){
				k -= b;
				if(k <= 0){
					ans = a;
				}
			}
		}
		sc.close();

		//処理
		

		//出力
		PrintWriter out = new PrintWriter(System.out);
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