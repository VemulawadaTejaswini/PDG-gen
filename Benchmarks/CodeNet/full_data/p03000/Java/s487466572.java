import java.io.*; 
import java.math.*;
import java.util.*;
 
public class Main {
	//static final long MOD = 998244353;
	static final long MOD = 1000000007;
	static final int INF = 1000000007;
	static int[][] perms;
	static int index;
    public static void main(String[] args) throws IOException {
    	FastScanner sc = new FastScanner();
    	int N = sc.nextInt();
    	int X = sc.nextInt();
    	int[] L = new int[N];
    	for (int i = 0; i < N; i++)
    		L[i] = sc.nextInt();
    	int[] pref = new int[N+1];
    	for (int i = 1; i <= N; i++)
    		pref[i] = pref[i-1]+L[i-1];
    	int ans = 0;
    	for (int i = 0; i <= N; i++) {
    		if (pref[i] <= X)
    			ans++;
    	}
    	System.out.println(ans);
    		
    }

    
    public static void permute(int[] nums, int l, int r) {
    	if (l == r) {
    		for (int i = 0; i < 4; i++) {
    			perms[index][i] = nums[i]*nums[i+1];
    		}
    		for (int i = 4; i < 10; i++) {
    			perms[index][i] = nums[i-4];
    		}
    		index++;
    	} else {
            for (int i = l; i <= r; i++) { 
                nums = swap(nums,l,i); 
                permute(nums, l+1, r); 
                nums = swap(nums,l,i); 
            } 
    	}
    }
    
    public static int[] swap(int[] a, int i, int j) { 
        int temp = a[i]; 
        a[i] = a[j]; 
        a[j] = temp; 
        return a; 
    } 
    
    static class DisjointSetUnion {
    	  public int[] parent;
    	  public int[] weight;
    	  public int count;

    	  public DisjointSetUnion(int nodes) {
    		  count = nodes;
    		  parent = new int[nodes];
    		  weight = new int[nodes];
    		  for (int i = 0; i < nodes; i++) {
    			  parent[i] = i;
    			  weight[i] = 1;
    		  }
    	  }
    	  //"find"
    	  public int root(int p) {
    		  while (p != parent[p]) {
    			  p = parent[p];
    		  }
    		  return p;
    	  }

    	  //"union"
    	  public void connect(int p, int q) {
    		  int rootP = root(p);
    		  int rootQ = root(q);
    		  if (rootP == rootQ) return;
    		  if (weight[rootP] < weight[rootQ]) {
    			  parent[rootP] = rootQ;
    			  weight[rootQ] += weight[rootP];
    		  } else {
    			  parent[rootQ] = rootP;
    			  weight[rootP] += weight[rootQ];
    		  }
    		  count--;
    	  }

    	  public boolean connected(int p, int q) {
    		  return root(p) == root(q);
    	  }
    }
    
    public static long power(long x, long y, long p) { 
        // Initialize result
        long res = 1;
         
        // Update x if it is more   
        // than or equal to p 
        x = x % p;  
      
        while (y > 0) 
        { 
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
    
    public static long dist(int[] point, int[] point2) {
    	return (long)(Math.pow((point2[1]-point[1]),2)+Math.pow((point2[0]-point[0]),2));
    }
    
    public static long gcd(long a, long b) {
    	if (b == 0)
    		return a;
    	else
    		return gcd(b,a%b);
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
				  return arr2[1]-arr1[1];
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
  
        int nextInt() { 
            return Integer.parseInt(next()); 
        } 
  
        long nextLong() { 
            return Long.parseLong(next()); 
        } 
  
        double nextDouble() { 
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