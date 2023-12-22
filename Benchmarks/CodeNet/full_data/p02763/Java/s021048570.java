import java.io.*;
import java.util.*;

public class Main {
static class tuple{
	int cnt;
	int[]freq;
	public tuple() {}
	public tuple(int cnt, int[] freq) {
		this.cnt = cnt;
		this.freq = freq;
	}
}
static class SegmentTree{
	
	int left, right;
	// lChild => tree[2*tn] , rChild => tree[2*tn+1]
	SegmentTree lChild, rChild; 
	int[]freq = new int[26];
	public SegmentTree(char[]arr, int left, int right) {
		this.left = left;
		this.right = right;
		this.freq = new int[26];
		if(left == right) {
			freq[arr[left] - 'a']++;
		}
		else {
			int mid = (left + right) >> 1;
			lChild = new SegmentTree(arr, left, mid);
			rChild = new SegmentTree(arr, mid + 1, right);
			recalculate();
		}
	}
	
	public void recalculate() {
		for(int i=0; i<26; i++) {
			freq[i] = lChild.freq[i] + rChild.freq[i];
		}
	}
	
	public void pointUpdate(int index, char value, int type) { // point update of type SET TO
		if(left == right) {
			if(type > 0) {
				freq[value - 'a']++;
			}else {
				assert(freq[value - 'a'] > 0);
				freq[value - 'a']--;
			}
		}else {
			if(index <= lChild.right) {
				lChild.pointUpdate(index, value, type);
			}else {
				rChild.pointUpdate(index, value, type);
			}
			recalculate();
		}
	}
	
	
	public tuple sum(int ql, int qr) {
		if(ql <= this.left && qr >= this.right) {
			int distinct = 0;
			for(int i=0; i<26; i++) {
				if(freq[i] > 0)distinct++;
			}
			return new tuple(distinct, freq);
		}
		if(qr < this.left || ql > this.right) { // NO OVERLAP
			return new tuple(0, new int[26]);
		}
		tuple lDistinct =  lChild.sum(ql, qr);
		tuple rDistinct =  rChild.sum(ql, qr);
		return  merge(lDistinct, rDistinct);
	}

	private tuple merge(tuple lDistinct, tuple rDistinct) {
		int[]ans = new int[26];
		int distinct = 0;
		for(int i=0; i<26; i++) {
			ans[i] = lDistinct.freq[i] + rDistinct.freq[i];
			if(ans[i] > 0)distinct++;
		}
		return new tuple(distinct, ans);
	}
	
}

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
        	q = s.nextInt();
        	SegmentTree seg = new SegmentTree(str, 0, n-1);
        	while(q-- > 0) {
        		int type = s.nextInt();
        		if(type == 1) {
        			int ind = s.nextInt()-1;
        			char c = s.next().charAt(0);
        			seg.pointUpdate(ind, str[ind], -1);
        			str[ind] = c;
        			seg.pointUpdate(ind, c, 1);
        			
        		}else {
        			int ql = s.nextInt()-1, qr = s.nextInt()-1;
        			out.println(seg.sum(ql, qr).cnt);
        		}
        	}
        } 
           
        out.flush();
        out.close();
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
