import java.io.PrintWriter;
import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		final int MOD = 1000000007;

		//入力
		String a = sc.nextLine();
		String b = sc.nextLine();
		sc.close();

		//処理
		String ans;
		if(a.length() > b.length()){
			ans = "GREATER";
		}else if(a.length() < b.length()){
			ans = "LESS";
		}else{
			if(a.compareTo(b) > 0){
				ans = "GREATER";
			}else if(a.compareTo(b) < 0){
				ans = "LESS";
			}else{
				ans = "EQUAL";
			}
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