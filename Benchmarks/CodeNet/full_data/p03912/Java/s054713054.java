
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
		int m = Integer.valueOf(inputArray[1]);
		int [] mods = new int[m];

		input = br.readLine();
		inputArray = input.split(" ");
		int ans = 0;
		HashSet<Integer> set = new HashSet<Integer>();
		int [] pairs = new int[m];
		for (int i=0; i<n; i++){	
			int x = Integer.valueOf(inputArray[i]);
			if (set.contains(x)){
				set.remove(x);
				pairs[x%m]++;				
			} else{
				set.add(x);
			}
			mods[x%m]++;
		}	
		ans += mods[0]/2;
		for (int i=1; i<(m+1)/2; i++){
			ans += Math.min(mods[i],mods[m-i]);
			if (mods[i]>mods[m-i]){
				ans += Math.min((mods[i]-mods[m-i])/2, pairs[i]);
			} else{
				ans += Math.min((mods[m-i]-mods[i])/2, pairs[m-i]);
			}
		}
		if (m%2==0){
			ans+=mods[m/2]/2;
		}
//		for (int i=0; i<m; i++)
//			sb.append(mods[i] + " ");
//		ln(sb);
		ln(ans);

	}

	public static void main(String[] args) throws IOException {
		new Main().run();
	}
	public static void ln(Object obj) {
		out.println(obj);
	}
}
