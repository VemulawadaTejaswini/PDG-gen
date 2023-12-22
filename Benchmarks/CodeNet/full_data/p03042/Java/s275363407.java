import java.io.*; 
import java.math.*;
import java.util.*;
import java.awt.Point;
 
public class Main {
	static final long MOD = 998244353L;
	//static final long INF = -1000000000000000007L;
	//static final long MOD = 1000000007L;
	//static final int INF = 1000000007;
	
	public static void main(String[] args) {
		FastScanner sc = new FastScanner();
		PrintWriter pw = new PrintWriter(System.out);
		String s = sc.next();
		int x = Integer.parseInt(s.substring(0,2));
		int y = Integer.parseInt(s.substring(2,4));
		if (1 <= x && x <= 12 && 1 <= y && y<=12) {
			pw.println("AMBIGUOUS");
		} else if (1 <= x && x <= 12 && 0 <= y && y <= 99) {
			pw.println("MMYY");
		} else if (1 <= y && y <= 12 && 0 <= x && x <= 99) {
			pw.println("YYMM");
		} else {
			pw.println("NA");
		}
		pw.close();
 	}
	
	//Fast exponentiation (x^y mod p)
	public static long power(long x, long y, long p) { 
		// Initialize result
		long res = 1;

		// Update x if it is more   
		// than or equal to p 
		x = x % p;  

		while (y > 0) { 
			// If y is odd, multiply x 
			// with result 
			if((y & 1)==1) 
				res = (res * x) % p; 

			// y must be even now 
			// y = y / 2 
			y = y >> 1;  
			x = (x * x) % p;  
		} 
		return res; 
	}
	
    public static int[][] sort(int[][] array) {
    	//Sort an array (immune to quicksort TLE)
		Random rgen = new Random();
		for (int i = 0; i < array.length; i++) {
		    int randomPosition = rgen.nextInt(array.length);
		    int[] temp = array[i];
		    array[i] = array[randomPosition];
		    array[randomPosition] = temp;
		}
		Arrays.sort(array, new Comparator<int[]>() {
			  @Override
        	  public int compare(int[] arr1, int[] arr2) {
				  return arr1[2]-arr2[2]; //ascending order
	          }
		});
		return array;
	}
    
    public static long[][] sort(long[][] array) {
    	//Sort an array (immune to quicksort TLE)
		Random rgen = new Random();
		for (int i = 0; i < array.length; i++) {
		    int randomPosition = rgen.nextInt(array.length);
		    long[] temp = array[i];
		    array[i] = array[randomPosition];
		    array[randomPosition] = temp;
		}
		Arrays.sort(array, new Comparator<long[]>() {
			  @Override
			  //Descending order
        	  public int compare(long[] arr1, long[] arr2) {
				  if (arr2[0] < arr1[0])
					  return -1;
				  if (arr2[0] > arr1[0])
					  return 1;
				  return 0;
	          }
		});
		return array;
	}
    
    static class FastScanner { 
        BufferedReader br; 
        StringTokenizer st; 
  
        public FastScanner() { 
            br = new BufferedReader(new InputStreamReader(System.in)); 
        } 
  
        String next() { 
            while (st == null || !st.hasMoreElements()) { 
                try { 
                    st = new StringTokenizer(br.readLine());
                } catch (IOException  e) { 
                    e.printStackTrace(); 
                } 
            } 
            return st.nextToken(); 
        } 
  
        int ni() { 
            return Integer.parseInt(next()); 
        } 
  
        long nl() { 
            return Long.parseLong(next()); 
        } 
  
        double nd() { 
            return Double.parseDouble(next()); 
        } 
  
        String nextLine() { 
            String str = ""; 
            try { 
                str = br.readLine(); 
            } catch (IOException e) {
                e.printStackTrace(); 
            } 
            return str;
        }
    }
}