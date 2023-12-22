import java.util.*;
import java.io.*;

public class Main {

	private static void solve(){
		//Implement solution here.
		int n = ni();
		Map<Integer,Integer> omap = new HashMap<Integer, Integer>();
		Map<Integer,Integer> emap = new HashMap<Integer, Integer>();
		for(int i = 1; i <= n; i++) {
			int tmp = ni();
			if(i%2 == 0) {
				if(!emap.containsKey(tmp)) {
					emap.put(tmp, 1);
				}else {
					emap.put(tmp,emap.get(tmp) + 1);
				}
			}else {
				if(!omap.containsKey(tmp)) {
					omap.put(tmp, 1);
				}else {
					omap.put(tmp,omap.get(tmp) + 1);
				}
			}			
		}
		
		List<NumCount> elist = new ArrayList<Main.NumCount>();
		List<NumCount> olist = new ArrayList<Main.NumCount>();
		for(int key:emap.keySet()) {
			elist.add(new NumCount(key, emap.get(key)));
		}
		for(int key:omap.keySet()) {
			olist.add(new NumCount(key, omap.get(key)));
		}
		Comparator<NumCount> comparator = Comparator.comparing(NumCount::getNum);
		elist.sort(comparator);
		olist.sort(comparator);
		int e1 = elist.get(0).getNum();
		int e1cnt = elist.get(0).getCnt();
		int o1 = olist.get(0).getNum();
		int o1cnt = olist.get(0).getCnt();
		
		int result = 0;
		if(e1 != o1) {
			result += elist.size() <= 1 ? 0 : n/2 - e1cnt;
			result += olist.size() <= 1 ? 0 : n/2 - o1cnt;
		} else {
			int e2cnt = elist.size() <= 1 ? 0 : elist.get(1).getCnt();
			int o2cnt = olist.size() <= 1 ? 0 : olist.get(1).getCnt();
			result += n/2 - Math.max(e2cnt, o2cnt);
		}
		
		System.out.println(result);
	}
	
	static class NumCount{
		private int num;
		private int cnt;
		public NumCount(int num, int cnt) {
			this.num = num;
			this.cnt = cnt;
		}
		public int getNum() {
			return num;
		}
		public void setNum(int num) {
			this.num = num;
		}
		public int getCnt() {
			return cnt;
		}
		public void setCnt(int cnt) {
			this.cnt = cnt;
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