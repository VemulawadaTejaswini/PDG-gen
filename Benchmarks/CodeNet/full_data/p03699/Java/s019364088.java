import java.util.*;
import java.io.*;

public class Main{
	public static void main(String[] args)  throws IOException,NumberFormatException{
		try {
		FastScanner sc=new FastScanner();
		int n=sc.nextInt();
		int a[]=sc.readArray(n);
		ruffleSort(a);
		int countf=0,countt=0;
		for(int i=0;i<n;i++) {
			if(a[i]%10==0) {
				countt++;
			}
		}
		int ans=0;
		if(countt==n) {
			System.out.println(0);
		}
		else {
			int lastAdd=0;
			for(int i=n-1;i>=0;i--) {
				if(a[i]%10!=0) {
				ans+=a[i];
				lastAdd=a[i];
				}
			}
			if(ans%10==0) {
				ans-=lastAdd;
			}
			for(int i=n-1;i>=0;i--) {
				if(a[i]%10==0) {
					ans+=a[i];
				}
			}
			System.out.println(ans);
			
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
