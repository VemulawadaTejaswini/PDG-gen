import java.util.*;
import java.io.*;

public class Main {
	static int n;
	static int[] left;
	static int[] right;
	static boolean[] skip;
	
	private static void solve(){
		//Implement solution here.
		n = ni();
		left = new int[n];
		right = new int[n];
		skip = new boolean[n];
		int result = n;
		for(int i = 0; i < n; i++) {
			int x = ni();
			int l = ni();
			left[i] = x - l + 1;
			right[i] =  x + l - 1;
		}
		Map<Integer,Set<Integer>> map = countDup();
		while(true) {
			int maxDup = -1;
			int maxKey = -1;
			for(int key:map.keySet()) {
				if(map.get(key).size() > maxDup) {
					maxDup = map.get(key).size();
					maxKey = key;
				}
			}
			if(maxDup > 0) {
				Set<Integer> list = map.get(maxKey);
				for(Integer i: list) {
					map.get(i).remove(maxKey);
				}
				map.remove(maxKey);
				result--;
			} else {
				break;
			}
		}
		System.out.println(result);
	}
	
	private static Map<Integer,Set<Integer>> countDup() {
		Map<Integer,Set<Integer>> map = new HashMap<>();
		for(int i = 0; i < n; i++) {
			for(int j = i + 1; j < n; j++) {				
				if((left[j] <= right[i] && left[j] >= left[i]) || (right[j] >= left[i] && right[j] <= right[i])){
					if(map.get(i) == null)map.put(i, new HashSet<Integer>());
					map.get(i).add(j);
					if(map.get(j) == null)map.put(j, new HashSet<Integer>());
					map.get(j).add(i);
				}
			}
		}
		return map;
	}

	//Switch input source (stdin/file)
	private static BufferedReader br;
	public static void main(String[] args){
		br = new BufferedReader(new InputStreamReader(System.in));
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
