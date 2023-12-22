import java.util.*;
import java.io.*;

public class Main {
	private static void solve(){
	//Implement solution here.
		int l = ni();
		long[] a = new long[l];
		for(int i = 0; i < l; i++){
			a[i] = nl();
		}
		long result = 0;
		int spos = calcSpos(a,l);
		for(int i = 0; i < spos; i++){
			result += a[i];
		}

		int epos = calcEpos(a,l);
		for(int i = l - 1; i > epos; i--){
			result += a[i];
		}

		long resultf = stepf(l,a,spos,epos);
		long resultb = stepb(l,a,spos,epos);

		System.out.println(result + Math.min(resultf,resultb));
	}
	
	private static long stepf(int l, long[] a, int spos, int epos){
		long result = 0;
		for(int i = spos; i <= epos; i++){
			if(a[i] % 2 == 0){
				result++;
			}else{
				continue;
			}
		}

		long v = 0;
		long vmin = 0;
		for(int i = epos; i >= spos ; i--){
			if(a[i] % 2 == 0){
				v--;
			}else{
				v++;
			}
			vmin = Math.min(vmin,v);
		}
		result += vmin;
		return result;
	}
	
	private static long stepb(int l, long[] a, int spos, int epos){
		long result = 0;
		for(int i = epos; i >= spos; i--){
			if(a[i] % 2 == 0){
				result++;
			}else{
				continue;
			}
		}
		long v = 0;
		long vmin = 0;
		for(int i = spos; i <= epos ; i++){
			if(a[i] % 2 == 0){
				v--;
			}else{
				v++;
			}
			vmin = Math.min(vmin,v);
		}
		result += vmin;
		return result;
	}
	
	
	private static int calcSpos(long[] a , int l){
		int result = 0;
		long v = a[0];
		if(v <= 0){
			result = 0;
		}
		for(int i = 1; i < l; i++){
			if(a[i] == 0){
				v -= 1;
			}else{
				v += a[i];
			}
			if(v <= 0){
				result = i + 1;
			}
		}
		return result;
	}
	
	private static int calcEpos(long[] a , int l){
		int result = l - 1;
		long v = a[l - 1];
		if(v <= 0){
			result = l-2;
		}
		for(int i = l - 2; i >= 0; i--){
			if(a[i] == 0){
				v -= 1;
			}else{
				v += a[i];
			}
			if(v <= 0){
				result = i - 1;
			}
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