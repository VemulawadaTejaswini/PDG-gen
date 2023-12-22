import java.io.*;
import java.util.*;
import java.math.*;
import java.awt.Point;
 
public class Code {
	//static final long MOD = 998244353L;
	//static final long INF = -1000000000000000007L;
	static final long MOD = 1000000007L;
	//static final int INF = 1000000007;
	static long[] factorial;
	public static void main(String[] args) {
		FastScanner sc = new FastScanner();
		PrintWriter pw = new PrintWriter(System.out);
		int N = sc.ni();
		int K = sc.ni();
		ArrayList<Integer> nums = new ArrayList<Integer>(N);
		for (int i = 0; i < N; i++)
			nums.add(sc.ni());
		Collections.sort(nums);
		if (K==1) {
			pw.println(0);
			pw.close();
			return;
		}
		
		factorial = new long[N+1];
		factorial[0] = 1L;
		for (int i = 1; i <= N; i++) {
			factorial[i] = (factorial[i-1]*i)%MOD;
		}
		
		long ans = 0;
		for (int i = 0; i < N; i++) {
			for (int j = i+K-1; j < N; j++) {
				//You have to include index i, int j, and K-2 indices in between.
				int diff = nums.get(j)-nums.get(i);
				long times = choose(j-i-1,K-2);
				ans += ((diff*times)%MOD);
				ans %= MOD;
			}
		}
		pw.println(ans);
		pw.close();
	}
	
	public static long choose(int n, int k) {
		long den = (factorial[n-k]*factorial[k])%MOD;
		long ans = (factorial[n]*(power(den,MOD-2,MOD)))%MOD;
		return ans;
	}
	
	//Find the GCD of two numbers
	public static long gcd(long a, long b) {
		if (a < b) return gcd(b,a);
		if (b == 0)
			return a;
		else
			return gcd(b,a%b);
	}
	
	//Fast exponentiation (x^y mod m)
	public static long power(long x, long y, long m) { 
		long ans = 1;
		x %= m;
		while (y > 0) { 
			if(y % 2 == 1) 
				ans = (ans * x) % m; 
			y /= 2;  
			x = (x * x) % m;
		} 
		return ans; 
	}
	
	public static int[][] shuffle(int[][] array) {
		Random rgen = new Random();
		for (int i = 0; i < array.length; i++) {
		    int randomPosition = rgen.nextInt(array.length);
		    int[] temp = array[i];
		    array[i] = array[randomPosition];
		    array[randomPosition] = temp;
		}
		return array;
	}
	
    public static int[][] sort(int[][] array) {
    	//Sort an array (immune to quicksort TLE)
 
		Arrays.sort(array, new Comparator<int[]>() {
			  @Override
        	  public int compare(int[] arr1, int[] arr2) {
				  //return arr1[1]-arr2[1]; //ascending order
				  for (int i = 0; i < arr1.length; i++) {
					  if (arr1[i] != arr2[i]) {
						  return arr1[i]-arr2[i];
					  }
				  }
				  return 0;
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
        	  public int compare(long[] arr1, long[] arr2) {
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