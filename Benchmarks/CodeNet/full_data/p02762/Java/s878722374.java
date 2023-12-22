import java.util.*;
import java.io.*;

public class Main {	
	private static void solve(){
		//Implement solution here.
		int N = ni();
		int M = ni();
		int K = ni();
		Map<Integer, Set<Integer>> fmap = new HashMap<Integer, Set<Integer>>();
		Map<Integer, Set<Integer>> bmap = new HashMap<Integer, Set<Integer>>();

		for(int i = 0; i < M; i++) {
			int A = ni();
			int B = ni();
			if(!fmap.containsKey(A)) fmap.put(A, new HashSet<Integer>());
			fmap.get(A).add(B);
			if(!fmap.containsKey(B)) fmap.put(B, new HashSet<Integer>());
			fmap.get(B).add(A);
		}
		
		for(int i = 0; i < K; i++) {
			int A = ni();
			int B = ni();
			if(!bmap.containsKey(A)) bmap.put(A, new HashSet<Integer>());
			bmap.get(A).add(B);
			if(!bmap.containsKey(B)) bmap.put(B, new HashSet<Integer>());
			bmap.get(B).add(A);
		}
		
		int[] result = new int[N];
		Queue<Integer> q = new ArrayDeque<Integer>();
		for(int i = 1; i <= N; i++) {
			boolean[] checked = new boolean[N + 1];
			checked[i] = true;
			q.add(i);
			while(!q.isEmpty()) {
				for(int next : fmap.get(q.poll())) {
					if(!checked[next]) {
						if(!fmap.get(i).contains(next)) {
							if(bmap.containsKey(i)) {
								if(!bmap.get(i).contains(next)) {
									result[i - 1]++;
								}
							} else {
								result[i - 1]++;
							}							
						}
						q.add(next);
						checked[next] = true;
					}					
				}
			}
		}
		for(int i : result) {
			System.out.print(i + " ");
		}
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
