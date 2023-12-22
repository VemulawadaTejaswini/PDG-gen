import java.util.*;
import java.io.*;

public class Main {
	private static void solve(){
	//Implement solution here.
		int n = ni();
		int m = ni();
		int[] aa = new int[m];
		int[] ba = new int[m];
		
		long result = (long)n*(n-1)/2;
		Deque<Long> resultq = new ArrayDeque<>();
		resultq.push(result);
		
		ufinit(n);
		for(int i = 0; i < m; i++){
			aa[i] = ni();
			ba[i] = ni();
		}
		
		for(int i = m - 1; i > 0; i--){			
			if(!ufsame(aa[i], ba[i])) result -= ufgcount(aa[i]) * ufgcount(ba[i]);
			ufunite(aa[i], ba[i]);
			resultq.push(result);			
		}
		
		while(!resultq.isEmpty()){
			System.out.println(resultq.pop());
		}
	}
	
	//Union find tree.
	static int[] ufpar;
	static int[] ufrank;
	
	static void ufinit(int n) {
		ufpar = new int[n+1];
		ufrank = new int[n+1];
		for(int i = 0; i <= n; i++) {
			ufpar[i] = i;
			ufrank[i] = 0;
		}		
	}
	
	static int uffind(int x) {
		if(ufpar[x] == x) {
			return x;
		} else {
			return uffind(ufpar[x]);
		}
	}
	
	static void ufunite(int x, int y) {
		int xpar = uffind(x);
		int ypar = uffind(y);
		if(xpar == ypar) return;
		
		if(ufrank[xpar] < ufrank[ypar]) {
			ufpar[xpar] = ypar;
		} else {
			ufpar[ypar] = xpar;
			if(ufrank[xpar] == ufrank[ypar]) ufrank[xpar] ++;
		}
		
	}
	
	static boolean ufsame(int x, int y) {
		return uffind(x) == uffind(y);
	}
	static int ufgcount(int x) {
		int p = ufpar[x];
		int result = 0;
		for(int i = 0; i < ufpar.length; i++) {
			result += ufpar[i] == p ? 1 : 0;
		}
		return result;
	}
	
	
    //Switch input source (stdin/file)
	private static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args){
        String debugDataPath = System.getenv("DD_PATH");        
        if(debugDataPath != null){
            try{
                scanner = new Scanner(new BufferedReader(new InputStreamReader(new FileInputStream(new File(debugDataPath)))));
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
				tokenizer = new StringTokenizer(scanner.nextLine());
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