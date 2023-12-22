import java.io.*;
import java.util.*;
import java.math.*;
import java.awt.Point;
 
public class Main {
	static final long MOD = 998244353L;
	static final long INF = 1000000000000000007L;
	//static final long MOD = 1000000007L;
	//static final int INF = 1000000007;
	
	//static long[] factorial;
	
	public static void main(String[] args) {
		FastScanner sc = new FastScanner();
		PrintWriter pw = new PrintWriter(System.out);
		int N = sc.ni();
		int K = sc.ni();
		int[][] W = new int[2*K][2*K];
		int[][] B = new int[2*K][2*K];
		for (int i = 0; i < N; i++) {
			int x = sc.ni()%(2*K);
			int y = sc.ni()%(2*K);
			char c = sc.next().charAt(0);
			if (c=='W') {
				W[x][y] += 1;
			} else {
				B[x][y] += 1;
			}
		}
		
		int[][] Wpref = new int[4*K+1][4*K+1];
		int[][] Bpref = new int[4*K+1][4*K+1];
		for (int i = 1; i <= 4*K; i++) {
			for (int j = 1; j <= 4*K; j++) {
				Wpref[i][j] = (Wpref[i-1][j]+Wpref[i][j-1]+W[(i-1)%(2*K)][(j-1)%(2*K)]-Wpref[i-1][j-1]);
				Bpref[i][j] = (Bpref[i-1][j]+Bpref[i][j-1]+B[(i-1)%(2*K)][(j-1)%(2*K)]-Bpref[i-1][j-1]);
			}
		}
		
		int ans = 0;
		for (int i = 2*K; i <= 4*K; i++) {
			for (int j = 2*K; j <= 4*K; j++) {
				int Q1W = Wpref[i][j]-Wpref[i-K][j]-Wpref[i][j-K]+Wpref[i-K][j-K];
				int Q2W = Wpref[i-K][j]-Wpref[i-2*K][j]-Wpref[i-K][j-K]+Wpref[i-2*K][j-K];
				int Q3W = Wpref[i-K][j-K]-Wpref[i-2*K][j-K]-Wpref[i-K][j-2*K]+Wpref[i-2*K][j-2*K];
				int Q4W = Wpref[i][j-K]-Wpref[i-K][j-K]-Wpref[i][j-2*K]+Wpref[i-K][j-2*K];
				
				int Q1B = Bpref[i][j]-Bpref[i-K][j]-Bpref[i][j-K]+Bpref[i-K][j-K];
				int Q2B = Bpref[i-K][j]-Bpref[i-2*K][j]-Bpref[i-K][j-K]+Bpref[i-2*K][j-K];
				int Q3B = Bpref[i-K][j-K]-Bpref[i-2*K][j-K]-Bpref[i-K][j-2*K]+Bpref[i-2*K][j-2*K];
				int Q4B = Bpref[i][j-K]-Bpref[i-K][j-K]-Bpref[i][j-2*K]+Bpref[i-K][j-2*K];
				
				int val = Math.max(Q1W+Q3W+Q2B+Q4B,Q1B+Q3B+Q2W+Q4W);
				ans = Math.max(ans,val);
			}
		}
		
		pw.println(ans);
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
				  //return a[0]-b[0]; //ascending order
				  if (a[1] != b[1]) {
					  return (a[1]-b[1]);
				  } else {
					  return (a[0]-b[0]);
				  }
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