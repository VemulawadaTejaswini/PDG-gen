import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);
		Scanner s = new Scanner(System.in);
		
		String[] split = f.readLine().split("\\s+");
		int n = Integer.parseInt(split[0]), x = Integer.parseInt(split[1]);
		int res=0;
		int[]a=new int[n];
		split=f.readLine().split("\\s+");
		long sum1 = 0;
		for(int i = 0; i < n; i++) sum1 += (a[i] = Integer.parseInt(split[i]));
		if(x == 0) {
			System.out.println(sum1);
			return;
		}
		for(int i = 0; i < n-1; i++) {
			if(a[i] + a[i+1] > x) {
//				System.out.println(a[i] +  " " + a[i+1]);
				long sum = a[i] + a[i+1];
				if(sum - a[i+1] <= x) {
					long add = sum - x;
					res += add;
					a[i+1] -= add;
				} else {
					long add = sum - x;
					sum -= a[i+1];
					res += add;
					a[i+1] -= add;
					add = sum - x;
					res += add;
					a[i] -= add;
				}
			}
		}
		System.out.println(res);
	}
}