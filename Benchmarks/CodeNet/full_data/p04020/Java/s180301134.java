import java.io.*;
import java.util.*;

public class Main{
	public static void main(String[] args) throws Exception {
		BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
		Scanner s = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		
		int n = Integer.parseInt(f.readLine().trim());
		long[] vals = new long[n];
		for(int i = 0; i < n; i++) 
			vals[i] = Integer.parseInt(f.readLine().trim());
		long ans = 0, curSum = 0;
		for(int i = 0; i < n; i++) {
			if(vals[i] == 0) {
				ans += curSum/2;
				curSum = 0;
			}
			curSum += vals[i];
		}
		ans += curSum/2;
		System.out.println(ans);
	}
}