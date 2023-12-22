import java.io.PrintWriter;
import java.util.ArrayList;
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
  		Scanner sc = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		int h = sc.nextInt();
		int w = sc.nextInt();
		sc.nextLine();
		String[] t = new String[h];
		for(int i = 0; i < h; i++){
			t[i] = sc.nextLine();
		}
		sc.close();

 		for(int i = 0; i < h+2; i++){
			if(i == 0 || i == h+1){
				for(int j = 0; j < w+2; j++){
					out.print("#");
				}
				out.println();
			}else{
				out.println("#" + t[i-1] + "#");
			}
		}
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