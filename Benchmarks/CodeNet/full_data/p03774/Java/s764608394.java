import java.io.*;
import java.util.*;
import java.math.*;
import java.awt.Point;
 
public class Main {
	//static final long MOD = 998244353L;
	//static final long INF = 1000000000000000007L;
	static final long MOD = 1000000007L;
	static final int INF = 1000000007;
	
	public static void main(String[] args) {
		FastScanner sc = new FastScanner();
		PrintWriter pw = new PrintWriter(System.out);
		
		int N = sc.ni();
		int M = sc.ni();
		int[][] s = new int[N][2];
		for (int i = 0; i < N; i++)
			s[i] = new int[]{sc.ni(),sc.ni()};
		int[][] c = new int[M][2];
		for (int i = 0; i < M; i++)
			c[i] = new int[]{sc.ni(),sc.ni()};
		for (int i = 0; i < N; i++) {
			int ans = -1;
			int dist = Integer.MAX_VALUE;
			for (int j = 0; j < M; j++) {
				int d = Math.abs(c[j][0]-s[i][0])+Math.abs(c[j][1]-s[i][1]);
				if (d < dist) {
					dist = d;
					ans = j;
				}
			}
			pw.println(ans+1);
		}
		
		pw.close();
	}
	
	public static long choose(int n, int k) {
		int[] primes = {2,3,5,7,11,13,17,19,23,29,31,37,41,43,47};
		HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
		for (int p: primes)
			hm.put(p,0);
		for (int i = 2; i <= n; i++) {
			int num = i;
			for (int p: primes) {
				int pow = 0;
				while (num % p == 0) {
					num /= p;
					pow++;
				}
				hm.put(p,hm.get(p)+pow);
			}
		}
		for (int i = 2; i <= k; i++) {
			int num = i;
			for (int p: primes) {
				int pow = 0;
				while (num % p == 0) {
					num /= p;
					pow++;
				}
				hm.put(p,hm.get(p)-pow);
			}
		}
		for (int i = 2; i <= (n-k); i++) {
			int num = i;
			for (int p: primes) {
				int pow = 0;
				while (num % p == 0) {
					num /= p;
					pow++;
				}
				hm.put(p,hm.get(p)-pow);
			}
		}
		long ans = 1;
		for (int p: hm.keySet())
			ans *= ((long)Math.pow(p,hm.get(p)));
		return ans;
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
	
	public static int[] shuffle(int[] array) {
		Random rgen = new Random();
		for (int i = 0; i < array.length; i++) {
		    int randomPosition = rgen.nextInt(array.length);
		    int temp = array[i];
		    array[i] = array[randomPosition];
		    array[randomPosition] = temp;
		}
		return array;
	}
	
	public static long[] shuffle(long[] array) {
		Random rgen = new Random();
		for (int i = 0; i < array.length; i++) {
		    int randomPosition = rgen.nextInt(array.length);
		    long temp = array[i];
		    array[i] = array[randomPosition];
		    array[randomPosition] = temp;
		}
		return array;
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
        	  public int compare(int[] a, int[] b) {
				  return a[0]-b[0]; //ascending order
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
        	  public int compare(long[] a, long[] b) {
				  if (a[0] < b[0])
					  return -1;
				  else if (a[0] > b[0])
					  return 1;
				  else
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