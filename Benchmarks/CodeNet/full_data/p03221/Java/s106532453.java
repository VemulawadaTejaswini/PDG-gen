import java.util.*;
import java.io.*;

public class Main {
	static int[] f = new int[101];
	static int n;
	private static void solve(){
		//Implement solution here.
		int n = ni();
		int m = ni();
		
		int[] p = new int[m];
		int[] y = new int[m];
		for(int i = 0; i < m; i++) {
			p[i] = ni();
			y[i] = ni();
		}
		ArrayList<ArrayList<Integer>> cl = new ArrayList<ArrayList<Integer>>() {
			{
				for(int i = 0; i < n; i++) {
					add(new ArrayList<Integer>());
				}
			}
		};

		for(int i = 0; i < m; i++) {
			cl.get(p[i] - 1).add(y[i]);
		}
		
		for(int i = 0; i < n; i++) {
			Collections.sort(cl.get(i));
		}

		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < m; i++) {
			int idx =Collections.binarySearch(cl.get(p[i] - 1), y[i]) + 1;
			sb.append(String.format("%06d", p[i]) + String.format("%06d", idx));
			sb.append(System.getProperty("line.separator"));
		}
		System.out.println(sb.toString());
	}

	//Switch input source (stdin/file)
	private static BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args){
		String debugDataPath = System.getenv("DD_PATH");        
		if(debugDataPath != null){
			try{
				br = new BufferedReader(new InputStreamReader(new FileInputStream(new File(debugDataPath))));
			}catch(Exception e){
				throw new RuntimeException(e);
			}
		}
		solve();
	}

	//Input read utility
	private static StringTokenizer tokenizer = null;
	public static String next() {
		while (tokenizer == null || !tokenizer.hasMoreTokens()) {
			try {
				tokenizer = new StringTokenizer(br.readLine());
			} catch (Exception e) {
				throw new RuntimeException(e);
			}
		}
		return tokenizer.nextToken();
	}
	//Get next single int
	private static int ni() {
		return Integer.parseInt(next());
	}
	//Get next single long
	private static long nl() {
		return Long.parseLong(next());
	}
	//Get next single double
	private static double nd() {
		return Double.parseDouble(next());
	}
	//Get next int array from one line
	private static int[] na(int n) {
		int[] a = new int[n];
		for (int i = 0; i < n; i++)
			a[i] = ni();
		return a;
	}
	//Get next char array from one line
	private static char[] ns() {
		return next().toCharArray();
	}
	//Get next long array from one line
	private static long[] nal(int n) {
		long[] a = new long[n];
		for (int i = 0; i < n; i++)
			a[i] = nl();
		return a;
	}
}
