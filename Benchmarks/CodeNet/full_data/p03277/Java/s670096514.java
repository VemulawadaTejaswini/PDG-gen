import java.util.*;
import java.io.*;

public class Main{

	
	
	public static void main(String[] args) throws IOException {
		Scanner sc=new Scanner(System.in);
		PrintWriter  out=new PrintWriter(System.out);
		int n=sc.nextInt();
		int []a=new int [n];
		int hi=0;
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
			hi=Math.max(hi,a[i]);
		}
		int lo=0;
		long min=(n*1L*(n-1)/2+1)/2;
		int ans=-1;
		// binary search on the greatest x such that the # of pairs(l,r) such that m(l,r) is >=x is>= (n*(n-1)/2)/2
		while(lo<=hi) 
		{
			int mid=(lo+hi)/2;
			long pairs=0;
			for(int l=0;l<n;l++) 
			{
				
				for(int r=l;r<n;r++)
				{
					int cnt=0;
					for(int k=l;k<=r;k++)
						if(a[k]>=mid)
							cnt++;
						else
							cnt--;
					if(cnt>=0)
						pairs++;
					
				}
			}
			if(pairs>=min) 
			{
				ans=mid;
				lo=mid+1;
			}
			else 
				hi=mid-1;
			
				
			/*int []s=new int [n+1];
			for(int i=1;i<=n;i++)
			{
				if(a[i-1]>=mid)
					s[i]=1;
				else
					s[i]=-1;
				s[i]+=s[i-1];
			}
			long inversions=0;*/
			
					
		}
		out.println(ans);
		out.close();
	}
	
	
	static class Scanner {
        StringTokenizer st;
        BufferedReader br;
 
        public Scanner(InputStream s) {
            br = new BufferedReader(new InputStreamReader(s));
        }
 
        public Scanner(FileReader s) {
            br = new BufferedReader(s);
        }
 
        public String next() throws IOException {
            while (st == null || !st.hasMoreTokens())
                st = new StringTokenizer(br.readLine());
            return st.nextToken();
        }
 
        public int nextInt() throws IOException {
            return Integer.parseInt(next());
        }
 
        public long nextLong() throws IOException {
            return Long.parseLong(next());
        }
 
        public String nextLine() throws IOException {
            return br.readLine();
        }
        public boolean ready() throws IOException {return br.ready();}
        public double nextDouble() throws IOException {return Double.parseDouble(next());}
       
    }

}