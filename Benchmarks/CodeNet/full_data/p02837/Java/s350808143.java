import java.util.*;
import java.io.*;

public class Main {

	private static void solve(){
		//Implement solution here.
		int n = ni();
		int result = 0;
		Map<Integer,Map<Integer,Integer>> map = new HashMap<Integer, Map<Integer,Integer>>();
		for(int i = 0; i < n; i++) {
			int cnt = ni();
			map.put(i + 1, new HashMap<Integer,Integer>());
			for(int j = 0; j < cnt; j++) {
				//System.out.println(i + " " + j + " " + id);
				map.get(i + 1).put(ni(), ni());
			}
		}

		for(int i = 0; i < Math.pow(2, n); i++) {
			boolean ok = true;
			String s = String.format("%0" + n + "d",Integer.parseInt(Integer.toBinaryString(i)));
			char[] ca = s.toCharArray();
			for(int key:map.keySet()) {//証言者
				for(int jkey:map.get(key).keySet()) {//target
					int tv = map.get(key).get(jkey);
					if(ca[key - 1] == '1') {//証言者が正直者の場合
						if((tv == 1 && ca[jkey - 1] != '1') || (tv == 0 && ca[jkey - 1] != '0')) {
							ok = false;
							break;
						}
					} else {
						if((tv == 1 && ca[jkey - 1] == '1') || (tv == 0 && ca[jkey - 1] == '0')) {
							ok = false;
							break;
						}
					}
				}
				if(!ok)break;
			}
			if(ok) {
				int cnt = 0;
				for(char c:ca) {
					if(c == '1')cnt++;
				}
				result = Math.max(result, cnt);
			}
		}
		System.out.println(result);
		
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