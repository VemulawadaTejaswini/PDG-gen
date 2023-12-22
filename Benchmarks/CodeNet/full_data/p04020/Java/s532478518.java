import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
		Scanner s = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		
		int n = Integer.parseInt(f.readLine().trim());
		long[] vals = new long[n];
		for(int i = 0; i < n; i++) 
			vals[i] = Integer.parseInt(f.readLine().trim());
		if(n == 1) {
			System.out.println(vals[0]/2);
			return;
		}
		long ans = 0;
		long[] added = new long[n];
		for(int i = 0; i < n-1; i++) {
			long add = -1;
			add = Math.max(vals[i]/2, vals[i+1]/2);
			add = Math.max(add, Math.min(vals[i], vals[i+1]));
			add = Math.max(add, (vals[i]/2 + vals[i+1]/2) + ((vals[i]%2)+(vals[i+1]%2)) / 2);
			added[i+1] = add;
			ans += vals[i]/2;
		}
		ans += vals[n-1]/2;
		long max = 0;
		for(int i = 0; i < n; i+=2) {
			max += added[i];
		}
		long max2 = 0;
		for(int i = 1; i < n; i+=2) {
			max2 += added[i];
		}
		System.out.println(Math.max(Math.max(max, max2), ans));
//		System.out.println(Arrays.toString(added));
	}
}