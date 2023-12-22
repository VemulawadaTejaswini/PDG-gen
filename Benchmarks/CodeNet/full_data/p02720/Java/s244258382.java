import java.io.*;
import java.util.*;
import java.math.*;
import java.awt.Point;
 
public class Main {
	static final long MOD = 998244353L;
	//static final long INF = 1000000000000000007L;
	//static final long MOD = 1000000007L;
	//static final int INF = 1000000007;
	
	//static long[] factorial;
 
	public static void main(String[] args) {
		FastScanner sc = new FastScanner();
		PrintWriter pw = new PrintWriter(System.out);
		
		int K = sc.ni()-1;
		TreeSet<Long> lunlun = new TreeSet<Long>();
		for (int d1 = 0; d1 <= 9; d1++) {
			for (int d2 = d1-1; d2 <= d1+1; d2++) {
				for (int d3 = d2-1; d3 <= d2+1; d3++) {
					for (int d4 = d3-1; d4 <= d3+1; d4++) {
						for (int d5 = d4-1; d5 <= d4+1; d5++) {
							for (int d6 = d5-1; d6 <= d5+1; d6++) {
								for (int d7 = d6-1; d7 <= d6+1; d7++) {
									for (int d8 = d7-1; d8 <= d7+1; d8++) {
										for (int d9 = d8-1; d9 <= d8+1; d9++) {
											for (int d10 = d9-1; d10 <= d9+1; d10++) {
												int[] num = new int[]{d1,d2,d3,d4,d5,d6,d7,d8,d9,d10};
												for (int d = 1; d <= 10; d++) {
													long ans = calc(num,d);
													if (good(num,d) && ans > 0) {
														lunlun.add(ans);
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
		
		int index = 0;
		for (long num: lunlun) {
			if (index == K)
				pw.println(num);
			index++;
		}
		
		pw.close();
	}
	
	public static boolean good(int[] num, int d) {
		for (int i = 0; i < d; i++) {
			if (num[i] < 0 || num[i] > 9)
				return false;
		}
		return true;
	}
	
	public static long calc(int[] num, int d) {
		long ans = 0;
		for (int i = 0; i < d; i++) {
			ans += (long)(num[i]*Math.pow(10,i));
		}
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