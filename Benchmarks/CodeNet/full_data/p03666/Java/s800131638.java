import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;



/**
 * --------------------------------------------------
 * Main Class
 * --------------------------------------------------
 */
public class Main {

	public void exec() throws IOException {
		Scanner input = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);

		long n = input.nextInt();
		long a = input.nextInt();
		long b = input.nextInt();
		long c = input.nextInt();
		long d = input.nextInt();
		
		//aとbは入れ替えても成り立つので常にa<bとして考える
		if(a>b){
			long tmp = a;
			a = b;
			b = tmp;
		}
		
		String ret = "";
		if(d < (b-a)/(n-1)) {
			//aとbの差が大きすぎる
			ret = "NO";
		} else if (a < c && 1000000000-a < c) { 
			//次の数がかけない
			ret = "NO";
		} else if (b < c && 1000000000-b < c) { 
			//bに到達不可
			ret = "NO";
		} else if (c < d && c*2/(d-c)+2 <= n) {
			//規定回数のうちに移動不可能帯域がなくなる
			ret = "YES";
		} else if (c == d && c == 0){
			//C==D==0
			ret = (a == b) ? "NO" : "YES";
		} else {
			//nが偶数=aからbまでの遷移回数k
			long k = n-1;
			//移動可能帯域はc+dごとに繰り返しパターンを描くのでc+dの領域を調査すればOK
			long pos = (b-a) % (c+d);
			long mergin_upper = 1000000000 - c;
			long mergin_lower = a;
			if (k%2==1) {
				//kが奇数回
				long yesStr = c - (k-1)*(d-c)/2;
				if (mergin_lower < c && mergin_lower < (k-1)*(d-c)/2 ) { 
					yesStr = c - mergin_lower;
				}
				long yesEnd = yesStr + k * (d-c);
				ret =  (yesStr <= pos && pos <= yesEnd) ? "YES" : "NO";
			} else {
				//kが偶数回
				long noStr = k*(d-c)/2;
				if (mergin_upper < c && mergin_upper < k*(d-c)/2) {
					noStr = mergin_upper;
				}
				long noEnd = noStr + 2*c - (k+1) * (d-c);
				ret =  (noStr < pos && pos < noEnd) ? "NO" : "YES";
			}
		}
		
		out.println(ret);
		out.flush();
		input.close();
	}

	public static void main(String[] args) throws IOException {
//		long time = System.currentTimeMillis();
		new Main().exec();
//		System.out.println(System.currentTimeMillis() - time);
	}
}
