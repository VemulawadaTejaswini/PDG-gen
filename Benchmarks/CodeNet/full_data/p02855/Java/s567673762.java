import java.util.*;
import java.io.*;

public class Main {
	static char[][] map;
	static int[][] result;
	static int num = 1;
	static int h;
	static int w;
	private static void solve(){
		//Implement solution here.
		h = ni();
		w = ni();
		int k = ni();
		map = new char[h][w];
		result = new int[h][w];
		for(int i = 0; i < h; i++) {
			map[i] = next().toCharArray();
		}

		for(int i = 0; i < h; i++) {
			for(int j = 0; j < w; j++) {
				if(map[i][j] == '.') {
					continue;
				} else {
					result[i][j] = num;
					int upcnt = up(j,i);
					int leftcnt = left(j,i,upcnt);
					int downcnt = down(j,i,leftcnt);
					right(j,i,upcnt,downcnt);
					num++;
				}
			}
		}

		for(int i = 0; i < h; i++) {
			for(int j = 0; j < w; j++) {
				System.out.print(result[i][j] + " ");
			}
			System.out.println();
		}
	}

	static void result() {
		for(int i = 0; i < h; i++) {
			for(int j = 0; j < w; j++) {
				System.out.print(result[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
	}
	static int up(int x, int y) {		
		if(y < 1 || result[y - 1][x] != 0) return 0;
		result[y - 1][x] = num;		
		return 1 + up(x, y -1);
	}

	static int left(int x, int y, int upcnt) {
		if(x < 1) return 0;		
		boolean ok = true;
		for(int i = 0; i <= upcnt; i++) {
			if(result[y - i][x - 1] != 0 )ok = false;
		}

		if(ok) {
			for(int i = 0; i <= upcnt; i++) {
				result[y - i][x - 1] = num;
			}
			return 1 + left(x - 1, y, upcnt);
		} else {
			return 0;
		}

	}

	static int down(int x, int y, int leftcnt) {
		if(y >= h - 1) return 0;
		boolean ok = true;
		for(int i = 0; i <= leftcnt; i++) {
			if(result[y + 1][x - i] != 0 || map[y + 1][x - i] == '#')ok = false;
		}

		if(ok) {
			for(int i = 0; i <= leftcnt; i++) {
				result[y + 1][x - i] = num;
			}
			return 1 + down(x, y + 1, leftcnt);
		}else {
			return 0;
		}
	}

	static int right(int x, int y, int upcnt, int downcnt) {
		if(x >= w - 1) return 0;
		boolean ok = true;
		//System.out.println(x + " " + y + " " + upcnt + " " + downcnt);
		for(int i = 0; i <= upcnt; i++) {
			if(result[y - i][x + 1] != 0 || map[y - i][x + 1] == '#')ok = false;
		}
		for(int i = 0; i <= downcnt; i++) {
			if(result[y + i][x + 1] != 0 || map[y + i][x + 1] == '#')ok = false;
		}

		if(ok) {
			for(int i = 0; i <= upcnt; i++) {
				result[y - i][x + 1] = num;
			}
			for(int i = 0; i <= downcnt; i++) {
				result[y + i][x + 1] = num;
			}
			return 1 + right(x + 1, y, upcnt, downcnt);
		} else {
			return 0;
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