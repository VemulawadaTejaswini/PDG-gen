import java.io.*; 
import java.math.*;
import java.util.*;
 
public class Main {
	static final long MOD = 998244353;
	//static final long MOD = 1000000007;
	static boolean[] visited;
    public static void main(String[] args) throws IOException {
        FastScanner sc = new FastScanner();
        int N = sc.nextInt();
        String s = sc.next();
        long[][] code = new long[N][N];
        for (int l = 0; l < N; l++) {
        	for (int r = l; r < N; r++) {
        		if (l == r) {
        			code[l][r] = (long)s.charAt(r)-97;
        		} else {
        			code[l][r] = code[l][r-1]*29 + (s.charAt(r)-97);
        			code[l][r] %= MOD;
        		}
        	}
        }
        
        for (int len = N/2; len > 0; len--) {
        	for (int beg = 0; beg <= N-2*len; beg++) {
        		for (int end = beg+len; end <= N-len; end++) {
        			if (code[beg][beg+len-1]==code[end][end+len-1]) {
        				System.out.println(len);
        				return;
        			}
        		}
        	}
        }
        System.out.println(0);
    }
    
    public static int[] baseN(int N, int num) {
    	int[] ans = new int[N];
    	for (int i = N-1; i >= 0; i--) {
    		int pow = (int)Math.pow(N,i);
    		ans[i] = num/pow;
    		num -= ans[i]*pow;
    	}
    	return ans;
    }
    
    public static int[][] sort(int[][] array) {
    	//Sort an array (immune to quicksort TLE)
		Random rgen = new Random();
		for (int i = 0; i< array.length; i++) {
		    int randomPosition = rgen.nextInt(array.length);
		    int[] temp = array[i];
		    array[i] = array[randomPosition];
		    array[randomPosition] = temp;
		}
		Arrays.sort(array, new Comparator<int[]>() {
			  @Override
			  public int compare(int[] arr1, int[] arr2) {
				  //Descending order
				  return arr2[0]-arr1[0];
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

class Node {
	public HashSet<Node> children;
	public int n;
	
	public Node(int n) {
		this.n = n;
		children = new HashSet<Node>();
	}
	
	public void addChild(Node node) {
		children.add(node);
	}
	
	public void removeChild(Node node) {
		children.remove(node);
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		return n;
	}

	@Override
	public boolean equals(Object obj) {
		if (! (obj instanceof Node)) {
			return false;
		} else {
			Node node = (Node) obj;
			return (n == node.n);
		}
	}
	
	public String toString() {
		return (this.n+1)+"";
	}
}