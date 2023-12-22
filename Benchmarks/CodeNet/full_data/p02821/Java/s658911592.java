import java.io.*;
import java.util.*;
import java.math.*;
import java.awt.Point;
 
public class Main {
	static final long MOD = 998244353L;
	//static final long INF = -1000000000000000007L;
	//static final long MOD = 1000000007L;
	//static final int INF = 1000000007;
	public static void main(String[] args) {
		FastScanner sc = new FastScanner();
		PrintWriter pw = new PrintWriter(System.out);
		int N = sc.ni();
		long M = sc.nl();
		ArrayList<Integer> nums = new ArrayList<Integer>();
		for (int i = 0; i < N; i++) {
			nums.add(sc.ni());
		}
		Collections.sort(nums,Collections.reverseOrder());
		long[] pref = new long[N+1];
		for (int i = 1; i <= N; i++) {
			pref[i] = pref[i-1]+nums.get(i-1);
		}
		//pw.println(nums);
		//Binary search to find the minimum value of each of the M handshakes
		int low = 0;
		int high = 2*nums.get(0);
		while (low < high) {
			int med = (low+high+1)/2;
			long shakes = 0;
			for (int i = 0; i < N; i++) {
				//Do another binary search to find the number of shakes possible
				int min = med-nums.get(i);
				if (min > nums.get(0)) {
					break;
				}
				int Li = 0;
				int Ri = N-1;
				while (Li < Ri) {
					int Mi = (Li+Ri+1)/2;
					if (nums.get(Mi) >= min) {
						Li = Mi;
					} else {
						Ri = Mi-1;
					}
				}
				
				shakes += (Li+1);
			}

			if (shakes >= M) {
				low = med;
			} else {
				high = med-1;
			}
		}
		
		long ans = 0;
		long shakes = 0;
		for (int i = 0; i < N; i++) {
			int min = low-nums.get(i);
			if (min > nums.get(0)) {
				break;
			}
			
			int Li = 0;
			int Ri = N-1;
			while (Li < Ri) {
				int Mi = (Li+Ri+1)/2;
				if (nums.get(Mi) >= min) {
					Li = Mi;
				} else {
					Ri = Mi-1;
				}
			}
			shakes += (Li+1);
			ans += ((Li+1)*nums.get(i));
			ans += pref[Li+1];
		}
		long extraShakes = shakes-M;
		ans -= extraShakes*low;
		pw.println(ans);
		pw.close();
	}
	
	//Find the GCD of two numbers
	public static long gcd(long a, long b) {
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
				  return arr1[1]-arr2[1]; //ascending order
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