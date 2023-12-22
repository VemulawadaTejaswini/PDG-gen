import java.io.*;
import java.util.*;

public class Main {
	public static void main (String[] args) throws IOException{
		FastScanner sc = new FastScanner(System.in);
		int n = sc.nextInt();
		Pair[] p = new Pair[n];
		for(int i=0;i<n;i++){
		    long x = sc.nextLong(), l = sc.nextLong();
		    p[i] = new Pair(x-l, x+l);
		}
		Arrays.sort(p);
		boolean[] taken = new boolean[n];
		int ans = 0;
		for(int i=0;i<n;i++){
		    if(taken[i]) continue;
		    Pair prev = p[i];
		    int cnt = 1;
		    for(int j=i+1;j<n;j++){
		        if(p[j].l>=prev.r){
		            cnt++;
		            taken[j] = true;
		            prev = p[j];
		        }
		    }
		    ans = Math.max(ans, cnt);
		}
		System.out.println(ans);
	}
	static class Pair implements Comparable<Pair>{
	    long l, r;
	    public Pair(long a, long b){
	        l = a;
	        r = b;
	    }
	    public int compareTo(Pair p){
	        if(l==p.l) return (int)(r-p.r);
	        return (int)(l-p.l);
	    }
	}
	static class FastScanner {
		BufferedReader br;
		StringTokenizer st;
		FastScanner(File f) {
			try {
				br = new BufferedReader(new FileReader(f));
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
		}
		FastScanner(InputStream f) {
			br = new BufferedReader(new InputStreamReader(f));
		}
		String nextLine() {
			try {
				return br.readLine();
			} catch (IOException e) {
				return null;
			}
		}
		String next() {
			while (st == null || !st.hasMoreTokens()) {
				try {
					st = new StringTokenizer(br.readLine());
				} catch (IOException e) {
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
	}
}