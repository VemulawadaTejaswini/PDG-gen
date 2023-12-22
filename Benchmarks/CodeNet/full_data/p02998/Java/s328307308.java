import java.io.*;
import java.util.*;
//import java.math.*;
//import java.awt.Point;
 
public class Main {
	//static final long MOD = 998244353L;
	//static final long INF = -1000000000000000007L;
	static final long MOD = 1000000007L;
	//static final int INF = 1000000007;
	
	public static void main(String[] args) {
		FastScanner sc = new FastScanner();
		PrintWriter pw = new PrintWriter(System.out);
		int N = sc.ni();
		int[][] points = new int[N][2];
		ArrayList<Integer> Xs = new ArrayList<Integer>();
		ArrayList<Integer> Ys = new ArrayList<Integer>();
		for (int i = 0; i < N; i++) {
			points[i][0] = sc.ni();
			Xs.add(points[i][0]);
			points[i][1] = sc.ni();
			Ys.add(points[i][1]);
		}
		HashMap<Integer,Integer> xMap = new HashMap<Integer,Integer>();
		HashMap<Integer,Integer> yMap = new HashMap<Integer,Integer>();
		Collections.sort(Xs);
		int xI = 0;
		for (int i = 0; i < N; i++) {
			if (i == 0 || Xs.get(i) > Xs.get(i-1)) {
				xMap.put(Xs.get(i),xI);
				xI++;
			}
		}
		Collections.sort(Ys);
		int yI = 0;
		for (int i = 0; i < N; i++) {
			if (i == 0 || Ys.get(i) > Ys.get(i-1)) {
				yMap.put(Ys.get(i),yI);
				yI++;
			}
		}
		ArrayList<Integer>[] graph = new ArrayList[xI+yI];
		for (int i = 0; i < xI+yI; i++)
			graph[i] = new ArrayList<Integer>();
		for (int i = 0; i < N; i++) {
			points[i][0] = xMap.get(points[i][0]);
			points[i][1] = yMap.get(points[i][1])+xI;
			
			graph[points[i][0]].add(points[i][1]);
			graph[points[i][1]].add(points[i][0]);
		}
		boolean[] visited = new boolean[xI+yI];
		long ans = 0;
		ArrayDeque<Integer> bfs = new ArrayDeque<Integer>();
		for (int root = 0; root < xI+yI; root++) {
			if (visited[root])
				continue;
			//Find the number of xNodes, yNodes, and edges in this component
			int xCnt = 0;
			int yCnt = 0;
			int e = 0;
			visited[root] = true;
			bfs.add(root);
			while (! bfs.isEmpty()) {
				int node = bfs.poll();
				if (node < xI)
					xCnt++;
				else
					yCnt++;
				for (int neighbor: graph[node]) {
					if (! visited[neighbor]) {
						e++;
						visited[neighbor] = true;
						bfs.add(neighbor);
					}
				}
			}
			
			//According to a "well known" statement, the number of added points is (xCnt*yCnt)-e.
			long add = (xCnt+0L)*yCnt-e;
			ans += add;
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
				  //return 0;
				  if (arr1[0] < arr2[0]) {
					  return -1;
				  } else if (arr1[0] > arr2[0]) {
					  return 1;
				  } else {
					  return 0;
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