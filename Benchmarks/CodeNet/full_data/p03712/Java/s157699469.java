
import java.util.*;
import java.io.*;

public class Main{
	public static void main(String[] args)  throws IOException,NumberFormatException{
		try {
		FastScanner sc=new FastScanner();
		int n=sc.nextInt(),m=sc.nextInt();
		char a[][]=new char[n][m];
		for(int i=0;i<m+2;i++) {
			System.out.print("#");
		}
		System.out.println();
		for(int i=0;i<n;i++) {
			char s[]=sc.next().toCharArray();
			for(int j=0;j<m;j++) {
				a[i][j]=s[j];
			}
		}
		for(int i=0;i<n;i++) {
			System.out.print("#");
			for(int j=0;j<m;j++) {
				System.out.print(a[i][j]);
			}
			System.out.println("#");
		}
		for(int i=0;i<m+2;i++) {
			System.out.print("#");
		}
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
