
import java.util.*;
import java.io.*;

public class Main{
	public static void main(String[] args)  throws IOException,NumberFormatException{
		try {
		FastScanner sc=new FastScanner();
		int x=sc.nextInt(),y=sc.nextInt();
		int a [] = {0 , 1 , 3 , 1 , 2 , 1 , 2 , 1 , 1 , 2 , 1 , 2 , 1};
		
		
		System.out.println(a[x]==a[y]?"Yes":"No");
		
		}
		catch(Exception e) {
			return ;
		}
		
	}
	static final Random random=new Random();
	
	static void ruffleSort(int[] a) {
		int n=a.length;
		for(int i=0;i<n;i++) {
			int oi=random.nextInt(n),temp=a[oi];
			a[oi]=a[i]; a[i]=temp;
		}
		Arrays.sort(a);
	}
	
	public static class FastScanner {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer("");
		String next() {
			while (!st.hasMoreTokens())
				try { 
                                      st=new StringTokenizer(br.readLine());				               
                              } catch (IOException e) {}
			return st.nextToken();
		}
		
		int nextInt() {
			return Integer.parseInt(next());
		}
		
		long nextLong() {
			return Long.parseLong(next());
		}
		
		int[] readArray(int n) {
			int[] a=new int[n];
			for (int i=0; i<n; i++) a[i]=nextInt();
			return a;
		}
		
		long[] readLongArray(int n) {
			long[] a=new long[n];
			for(int i=0; i<n ; i++) a[i]=nextLong();
			return a;
		}
		
		String nextLine() 
        { 
            String str = ""; 
            try
            { 
                str = br.readLine(); 
            } 
            catch (IOException e) 
            { 
                e.printStackTrace(); 
            } 
            return str; 
        } 
	}

}
