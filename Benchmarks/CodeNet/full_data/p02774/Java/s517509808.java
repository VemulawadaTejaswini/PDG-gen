import java.io.*;
import java.util.*;
import java.math.*;
import java.awt.Point;
 
public class Main {
	//static final long MOD = 998244353L;
	//static final long INF = -1000000000000000007L;
	static final long MOD = 1000000007L;
	//static final int INF = 1000000007;
	
	static long[] factorial;
	
	public static void main(String[] args) {
		FastScanner sc = new FastScanner();
		PrintWriter pw = new PrintWriter(System.out);
		int N = sc.ni();
		long K = sc.nl();
		ArrayList<Long> pos = new ArrayList<Long>();
		ArrayList<Long> neg = new ArrayList<Long>();
		for (int i = 0; i < N; i++) {
			long n = sc.nl();
			if (n >= 0)
				pos.add(n);
			else
				neg.add(n);
		}
		Collections.sort(pos);
		Collections.sort(neg);
		long min = -1000000000000000000L;
		long max = 1000000000000000000L;
		while (min < max) {
			long med = (min+max)/2;
			if (min+max < 0)
				med = (min+max-1)/2;
			long val = 0;
			for (int i = 0; i < neg.size(); i++) {
				if (med < 0) {
					if (neg.get(i)*pos.get(pos.size()-1) > med)
						continue;
					int low = 0;
					int high = pos.size()-1;
					while (low < high) {
						int ind = (low+high)/2;
						if (neg.get(i)*pos.get(ind) <= med) {
							high = ind;
						} else {
							low = ind+1;
						}
					}
					val += (pos.size()-low);
				} else {
					val += pos.size();
					if (i==neg.size()-1 || neg.get(i)*neg.get(neg.size()-1) > med) {
						continue;
					}
					int low = i+1;
					int high = neg.size()-1;
					while (low < high) {
						int ind = (low+high)/2;
						if (neg.get(i)*neg.get(ind) <= med) {
							high = ind;
						} else {
							low = ind+1;
						}
					}
					val += (neg.size() - low);
				}
			}
 
			for (int i = 0; i < pos.size(); i++) {
				if (med < 0) break;
				if (i==pos.size()-1 || pos.get(i)*pos.get(i+1) > med) {
					continue;
				}
				
				int low = i+1;
				int high = pos.size()-1;
				while (low < high) {
					int ind = (low+high+1)/2;
					if (pos.get(i)*pos.get(ind) <= med) {
						low = ind;
					} else {
						high = ind-1;
					}
				}
				val += (low - i);
			}
			
			if (val >= K) {
				max = med;
			} else {
				min = med+1;
			}
			//pw.println(min + " " + max + " " + val);
		}
		pw.println(min);
		pw.close();
	}
 
	
	public static long dist(long[] p1, long[] p2) {
		return (Math.abs(p2[0]-p1[0])+Math.abs(p2[1]-p1[1]));
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
		if (y < 0) return 0L;
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
				  return arr1[0]-arr2[0]; //ascending order
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
				  //return 0;
				  if (Math.min(Math.abs(arr1[0]),Math.abs(arr1[1])) < Math.min(Math.abs(arr2[0]),Math.abs(arr2[1]))) {
					  return -1;
				  } else {
					  return 1;
				  }
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