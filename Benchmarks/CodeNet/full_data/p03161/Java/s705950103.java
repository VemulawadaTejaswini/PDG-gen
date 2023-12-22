import java.util.*;
import java.io.*;

public class Main {
	static int[] c;
	static int[] f;
	static int k;
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(in.readLine());
		int n = Integer.parseInt(st.nextToken());  k = Integer.parseInt(st.nextToken());
		f = new int[n];
		Arrays.fill(f, -1);
		c = new int[n];
		st = new StringTokenizer(in.readLine());
		for(int i = 0; i < n; i++) {
			c[i] = Integer.parseInt(st.nextToken());
		}
		solve(0);
		System.out.println(f[0]);
	}
	public static int solve(int idx) {
		if(f[idx] != -1) {return f[idx];}
		if(idx == f.length - 1) {return 0;}
		int min = Integer.MAX_VALUE;
		for(int i = idx + 1; i < idx + k + 1 && i < f.length; i++) {
			int m = Math.abs(c[i] - c[idx]);
			m += solve(i);
			if(m < min) {
				//System.out.println(m + "," + i + "," + idx);
				min = m;
			}
		}

		f[idx] = min;
	//	System.out.println(f[idx] + "," + idx);
		return min;
	}
}
