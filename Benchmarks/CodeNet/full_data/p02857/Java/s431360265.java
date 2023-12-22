import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static Scanner in;
	static PrintWriter out;
	static String INPUT = "";
	
	static int n;
	
	static boolean q(int... a)
	{
		assert a.length == n;
		out.print("?");
		for(int v : a){
			out.print(" " + (v+1));
		}
		out.println();
		out.flush();
		return in.next().trim().equals("Red");
	}
	
	static boolean qq(int k)
	{
		int[] a = new int[n];
		for(int j = 0;j < n;j++){
			a[j] = (k+j) % (2*n);
		}
		return q(a);
	}
	
	static void solve()
	{
		n = ni();
		int l, r;
		if(!qq(0)){
			l = 0;
			r = n;
		}else{
			l = n;
			r = 2*n;
		}
		while(r - l > 1){
			int h = r+l>>1;
			if(qq(h)){
				r = h;
			}else{
				l = h;
			}
		}
		int tar = l;
		
		int[] color = new int[2*n];
		// f -> t
		// tar = blue, tar+n = red
		color[tar] = -1; 
		color[(tar+n)%(2*n)] = 1;
		for(int k = 1;k < n;k++){
			int[] a = new int[n];
			for(int j = 0;j < n;j++){
				a[j] = (tar+j) % (2*n);
				if(j == k){
					a[j] = (tar+n) % (2*n);
				}
			}
			if(q(a)){
				color[(tar+k) % (2*n)] = -1;
			}else{
				color[(tar+k) % (2*n)] = 1;
			}
		}
		for(int k = 1;k < n;k++){
			int[] a = new int[n];
			for(int j = 0;j < n;j++){
				a[j] = (tar+n+j) % (2*n);
				if(j == k){
					a[j] = tar;
				}
			}
			if(q(a)){
				color[(tar+n+k) % (2*n)] = -1;
			}else{
				color[(tar+n+k) % (2*n)] = 1;
			}
		}
		out.print("! ");
		for(int i = 0;i < 2*n;i++){
			out.print(color[i] == 1 ? 'R' : 'B');
		}
		out.println();
		out.flush();
	}
	
	public static void main(String[] args) throws Exception
	{
		in = INPUT.isEmpty() ? new Scanner(System.in) : new Scanner(INPUT);
		out = new PrintWriter(System.out);
		
		solve();
		out.flush();
	}
	
	static int ni() { return Integer.parseInt(in.next()); }
	static long nl() { return Long.parseLong(in.next()); }
	static double nd() { return Double.parseDouble(in.next()); }
	static void tr(Object... o) { if(INPUT.length() != 0)System.out.println(Arrays.deepToString(o)); }
}
