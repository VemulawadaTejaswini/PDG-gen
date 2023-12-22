import java.util.*;
import java.io.*;

public class Main {
	private static void solve(){
	//Implement solution here.
		int a = ni();
		int b = ni();
		int q = ni();
		long s[] = new long[a];
		long t[] = new long[b];

		for(int i = 0; i < a; i++){
			s[i] = nl();
		}
		for(int i = 0; i < b; i++){
			t[i] = nl();
		}
		
		for(int i = 0; i < q; i++){
			long x = nl();

			int abs = Arrays.binarySearch(s,x);
			int ab = ~abs - 1;
			int af = ab + 1;
			if(af >= s.length)af = -1;

			int bbs = Arrays.binarySearch(t,x);
			int	bb = ~bbs - 1;
			int	bf = bb + 1;
			if(bf >= t.length)bf = -1;

			long result = Long.MAX_VALUE;
			//ff
			if(af >= 0 && bf >= 0){
				long ad = s[af] - x;
				long bd = t[bf] - x;
				result = Math.max(s[af],t[bf]);
			}
			//fb
			if(af >= 0 && bb >= 0){
				long ad = s[af] - x;
				long bd = x - t[bb];
 				result = Math.min(result, 2*Math.min(ad,bd) + Math.max(ad,bd));	
			}
			//bf
			if(ab >= 0 && bf >= 0){
				long ad = x - s[ab];
				long bd = t[bf] - x;
				result = Math.min(result, 2*Math.min(ad,bd) + Math.max(ad,bd));	
			}
			//bb
			if(ab >= 0 && bb >= 0){
				long ad = x - s[ab];
				long bd = x - t[bb];
				result = Math.min(result, Math.max(ad,bd));
			}
			System.out.println(result);
		}
	}
	
    //Find position of target value.
    //If match value doesn't exists retur neerest position contains lesser value
    public static int binarySearchLe(int[] a, int spos, int epos, int target){
        if(spos == epos){
            return spos;
        }
        int mid = (epos + spos)/2;
        if(a[mid] > target){
            return binarySearchLe(a,spos,mid - 1,target);
        }else if(a[mid] < target){
            return binarySearchLe(a,mid,epos,target);
        }else{
            return mid;
        }
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