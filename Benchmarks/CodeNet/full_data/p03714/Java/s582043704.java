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
		int[] nums = new int[3*N];
		long sum = 0;
		int[] Rinit = new int[2*N];
		for (int i = 0; i < 3*N; i++) {
			nums[i] = sc.ni();
			if (i < N) {
				sum += nums[i];
			} else {
				sum -= nums[i];
				Rinit[i-N] = nums[i];
			}
		}
		Rinit = shuffle(Rinit);
		Arrays.sort(Rinit);
		
		long sumL = 0;
		PriorityQueue<Integer> removeL = new PriorityQueue<Integer>(new Comparator<Integer>(){
			public int compare(Integer a, Integer b) {
				return (int)(b-a);
			}
		});
		PriorityQueue<Integer> pendingL = new PriorityQueue<Integer>(new Comparator<Integer>(){
			public int compare(Integer a, Integer b) {
				return (int)(a-b);
			}
		});
		for (int i = 0; i < N; i++) {
			pendingL.add(nums[i]);
		}
		
		
		long sumR = 0;
		TreeMap<Integer,Integer> removeR = new TreeMap<Integer,Integer>();
		for (int i = N; i < 2*N; i++) {
			removeR.put(Rinit[i],removeR.getOrDefault(Rinit[i],0)+1);
			sumR += Rinit[i];
		}
		long ans = sum+sumR;
		for (int i = N; i < 2*N; i++) {
			sum += 2*nums[i];
			
			//work with the L
			pendingL.add(nums[i]);
			int num = pendingL.poll();
			removeL.add(num);
			sumL += num;
			while (!removeL.isEmpty()&&!pendingL.isEmpty()&&removeL.peek() > pendingL.peek()) {
				//transfer
				int add = pendingL.poll();
				int getRidOf = removeL.poll();
				removeL.add(add);
				sumL += (add-getRidOf);
			}
			
			//work with the R
			int key = removeR.firstKey();
			if (nums[i] <= key) {
				sumR -= key;
				removeR.put(key, removeR.get(key)-1);
				if (removeR.get(key)==0)
					removeR.remove(key);
			} else {
				sumR -= nums[i];
				removeR.put(nums[i], removeR.get(nums[i])-1);
				if (removeR.get(nums[i])==0)
					removeR.remove(nums[i]);
			}
			
			ans = Math.max(ans,sum-sumL+sumR);
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
				  return a[1]-b[1]; //ascending order
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