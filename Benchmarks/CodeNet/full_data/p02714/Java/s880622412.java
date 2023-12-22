import java.io.*;
import java.util.*;

public class Main {

public static void main(String[] args){

   new Thread(null, null, "Anshum Gupta", 99999999) {
        public void run() {
            try {
                solve();
            } catch(Exception e) {
                e.printStackTrace();
                System.exit(1);
            }
        }
    }.start();
}
static final long mxx = (long)(1e18+5);
static final int mxN = (int)(1e6);
static final int mxV = (int)(1e6), log = 18;
static long mod = (long)(1e9+7); //998244353;//̇
static final int INF = (int)1e9;
static boolean[]vis;
static ArrayList<ArrayList<Integer>> adj1, adj2;
static int n, m, k, q, h, w;
static char[]str;

public static void solve() throws Exception {
	   // solve the problem here
		s = new MyScanner();
   		out = new PrintWriter(new BufferedOutputStream(System.out), true);
//	   		out = new PrintWriter("output.txt");
        int tc = 1;//s.nextInt();
        while(tc-- > 0){
        	n = s.nextInt();
        	str = s.next().toCharArray();
        	long ans = 0;
        	char[]pos = {'R', 'G', 'B'};
        	ArrayList<Integer>[]ind = new ArrayList[3];
        	HashSet<Integer>[]hs = new HashSet[3];
        	for(int i=0; i<3; i++) {
        		ind[i] = new ArrayList<Integer>();
        		hs[i] = new HashSet<Integer>();
        	}
        	for(int i=0; i<n; i++) {
        		ArrayList<Integer> a1 = null, a2 = null;
        		HashSet<Integer> h1 = null, h2 = null;
        		for(int j=0; j<3; j++) {
        			if(pos[j] == str[i]) {
        				ind[j].add(i);
        				hs[j].add(i);
        				continue;
        			}
        			if(a1 == null) {
        				a1 = ind[j];
        				h1 = hs[j];
        			}else {
        				assert(a2 == null && h2 == null);
        				a2 = ind[j];
        				h2 = hs[j];
        			}
        		}
        		for(int j=0; j<a1.size(); j++) {
        			ans += getCount(a2, a1.get(j), i - a1.get(j), h2);
        		}
        		for(int j=0; j<a2.size(); j++) {
        			ans += getCount(a1, a2.get(j), i - a2.get(j), h1);
        		}
//        		out.println("a1 = " + a1 + " a2 = " + a2);
        	}
        	out.println(ans);
        } 
           
        out.flush();
        out.close();
}

private static long getCount(ArrayList<Integer> a2, int ind, int dif, HashSet<Integer> h2) {
	assert(h2.size() == a2.size());
	int lo = 0, hi = a2.size()-1, res = 0;
	while(lo <= hi) {
		int mid = (lo + hi) >> 1;
		if(a2.get(mid) < ind) {
			res = mid + 1;
			lo = mid + 1;
		}else {
			hi = mid - 1;
		}
	}
//	out.println("ind = " + ind + " dif = " + dif + " res = " + res);
	if(res == 0)return res;
	return  (h2.contains(ind - dif) && a2.get(res - 1) >= ind - dif) ? res-1 : res;
}
public static PrintWriter out;
public static MyScanner s;
static class MyScanner {

    BufferedReader br;
    StringTokenizer st;

    public MyScanner() {
        br = new BufferedReader(new InputStreamReader(System.in));
    }
    public MyScanner(String fileName) {
    	try {
			br = new BufferedReader(new FileReader(fileName));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
    }
    String next() {
        while (st == null || !st.hasMoreElements()) {
            try {
                st = new StringTokenizer(br.readLine());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return st.nextToken();
    }

    int nextInt() { return Integer.parseInt(next()); }
    long nextLong() { return Long.parseLong(next()); }
    double nextDouble() { return Double.parseDouble(next()); }
    int[] nextIntArray(int n){
    	int[]a = new int[n];
    	for(int i=0; i<n; i++) {
    		a[i] = this.nextInt();
    	}
    	return a;
    }
    long[] nextlongArray(int n) {
    	long[]a = new long[n];
    	for(int i=0; i<n; i++) {
    		a[i] = this.nextLong();
    	}
    	return a;
    }
    Integer[] nextIntegerArray(int n){
    	Integer[]a = new Integer[n];
    	for(int i=0; i<n; i++) {
    		a[i] = this.nextInt();
    	}
    	return a;
    }
    Long[] nextLongArray(int n) {
    	Long[]a = new Long[n];
    	for(int i=0; i<n; i++) {
    		a[i] = this.nextLong();
    	}
    	return a;
    }
    char[][] next2DCharArray(int n, int m){
    	char[][]arr = new char[n][m];
    	for(int i=0; i<n; i++) {
    		arr[i] = this.next().toCharArray();
    	}
    	return arr;
    }
    ArrayList<ArrayList<Integer>> readUndirectedUnweightedGraph(int n, int m) {
    	ArrayList<ArrayList<Integer>>adj = new ArrayList<ArrayList<Integer>>();
    	for(int i=0; i<=n; i++)adj.add(new ArrayList<Integer>());
    	for(int i=0; i<m; i++) {
    		int u = s.nextInt();
    		int v = s.nextInt();
    		adj.get(u).add(v);
    		adj.get(v).add(u);
    	}
    	return adj;
    }
    ArrayList<ArrayList<Integer>> readDirectedUnweightedGraph(int n, int m) {
    	ArrayList<ArrayList<Integer>>adj = new ArrayList<ArrayList<Integer>>();
    	for(int i=0; i<=n; i++)adj.add(new ArrayList<Integer>());
    	for(int i=0; i<m; i++) {
    		int u = s.nextInt();
    		int v = s.nextInt();
    		adj.get(u).add(v);
    	}
    	return adj;
    }
    String nextLine(){
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
