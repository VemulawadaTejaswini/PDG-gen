import java.util.*;
import java.io.*;

public class Main {
	private static void solve(){
		//Implement solution here.
		int n = ni();
		int k = ni();
		int[][] sushi = new int[n][2];
		for(int i = 0; i < n; i++) {
			sushi[i][0] = ni();
			sushi[i][1] = ni();
		}
		map = new HashMap<>();
		x = 0;
		int cnt = 0;
		for(int i = 0; i < n; i++) {
			int t = sushi[i][0];
			int d = sushi[i][1];
			if(cnt < k) {
				addSushi(t,d);
				cnt++;
			} else {
				int remt = 0;
				int maxdelta = 0;
				for(Integer key:map.keySet()) {
					//Compare d
					long dd = 0;
					
					dd =  d - map.get(key).peek();
					//Compare x
					long xd = 0;
					if(key != d) {
						if(map.containsKey(t)) {
							if(map.get(key).size() <= 1) {
								xd = -2 * x + 1;
							} else {
								xd = 0;
							}
						} else {
							if(map.get(key).size() <= 1) {
								xd = 0;
							} else {
								xd = 2 * x + 1;
							}							
						}	
					}
					//Maximum 
					if(dd + xd > 0 && dd + xd > maxdelta) {
						remt = key;							
					}
				}
				if(remt > 0) {
					removeSushi(remt);
					addSushi(t, d);
				}				
			}
		}
		System.out.println(dsum + x*x);
	}

	static HashMap<Integer,PriorityQueue<Integer>> map;
	static long dsum;
	static long x;
	static void addSushi(int t, int d) {
		if(map.containsKey(t)) {
			map.get(t).add(d);
		} else {
			PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
			pq.add(d);
			map.put(t, pq);
			x++;
		}
		dsum += d;
	}

	static void removeSushi(int t) {
		dsum -= map.get(t).poll();
		if(map.get(t).size() < 1) {
			map.remove(t);
			x--;
		}
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
