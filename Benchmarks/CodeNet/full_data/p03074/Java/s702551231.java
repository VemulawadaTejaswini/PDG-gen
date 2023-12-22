import java.util.*;
import java.io.*;

public class Main {
	private static void solve(){
		//Implement solution here.
		int n = ni();
		int k = ni();
		char[] ca = next().toCharArray();
		int[] cnta = new int[n];

		int cnt = 1;
		int aidx = 0;
		for(int i = 1; i < ca.length; i++) {
			if(ca[i] != ca[i-1]) {				
				cnta[aidx] = cnt;
				aidx++;
				cnt = 1;
			} else {
				cnt++;
			}
		}
		cnta[aidx] = cnt;
//		Arrays.stream(cnta).forEach(v -> System.out.print(v +","));
//		System.out.println();	
		
		boolean zhead =  ca[0] == '0';
		int cidx = zhead ? 0 : 1;
		int tmp = zhead ? 0 : cnta[0];
		int result = 0;
		int scnt = 0;
		while(cidx < cnta.length) {
//			System.out.println(cidx + " " + scnt + " " + tmp);
			if(cnta[cidx] == 0) break;
			if(scnt < k) {
				tmp += cnta[cidx] += cnta[cidx + 1];
				scnt ++;
			} else {
				tmp += cnta[cidx] += cnta[cidx + 1];
				if(zhead) {
					tmp -= cnta[cidx - 2*k];
				} else {
					tmp -= cnta[cidx - 2*k] + cnta[cidx - 2*k + 1];
				}
			}
			result = Math.max(result,tmp);
			cidx += 2;
		}
		result = Math.max(result,tmp);
		
		System.out.println(result);
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