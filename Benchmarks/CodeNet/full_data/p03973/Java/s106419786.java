
import static java.lang.System.in;
import static java.lang.System.out;

import java.io.*;
import java.util.*;

public class Main {
	static final double EPS = 1e-10;
	static final double INF = 1L << 31;
	static final double PI = Math.PI;

	public static Scanner sc = new Scanner(in);
	StringBuilder sb = new StringBuilder();
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public void run() throws IOException {
		String input;
		String[] inputArray;
		input = br.readLine();
		inputArray = input.split(" ");

		int n = Integer.valueOf(inputArray[0]);
		int [] a = new int[n]; 
		long ans = 0L;
		a[0] = Integer.valueOf(br.readLine());
		ans+=(a[0]-1);
		int m = 1;
		for (int i=1; i<n; i++){
			a[i] = Integer.valueOf(br.readLine());
			if (a[i]==m+1) m++;
			else if (a[i]>m+1){
				ans+=(a[i]-1)/(m+1);
			}
		}
		sb.append(ans);
		ln(sb);
	}

	public static void main(String[] args) throws IOException {
		new Main().run();
	}
	public static void ln(Object obj) {
		out.println(obj);
	}
}
