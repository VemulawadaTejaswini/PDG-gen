import java.io.*;
import java.util.*;

public class Main {

	
	public static void main(String[] args) {
		FastScanner in=new FastScanner();
		PrintWriter out=new PrintWriter(System.out);
	//	int t=in.nextInt();
	//	while(t-->0)
		solve(in,out);
		out.close();
	}
    static long gcd(long a,long b){
        if(b==0) return a;
        else return gcd(b,a%b);
    }
    static void solve(FastScanner in,PrintWriter out){
      int n=in.nextInt();
      int a[]=new int[n]; a=in.readArray(n);
     Stack<Integer> st=new Stack<>();
     for(int i=n;i>0;i--) st.push(i);
      for(int i=0;i<n;i++){
          if(st.peek()==a[i]) st.pop();
      }
      if(st.size()!=n) {
          out.println(st.size());
      }
      else out.println(-1);
    }    
	


	static void sort(int[] a) {
		ArrayList<Integer> l=new ArrayList<>();
		for (int i:a) l.add(i);
		Collections.sort(l);
		for (int i=0; i<a.length; i++) a[i]=l.get(i);
	}
	
	static class FastScanner {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer("");
		String next() {
			while (!st.hasMoreTokens())
				try {
					st=new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			return st.nextToken();
		}
		
		int nextInt() {
			return Integer.parseInt(next());
		}
		int[] readArray(int n) {
			int[] a=new int[n];
			for (int i=0; i<n; i++) a[i]=nextInt();
			return a;
		}
		long nextLong() {
			return Long.parseLong(next());
		}
	}

	
}
