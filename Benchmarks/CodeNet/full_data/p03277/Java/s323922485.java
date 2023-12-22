import java.util.*;
import java.io.*;

public class Main{

	static int []S;
	public static long sort(int s,int e)
	{
		if(e<=s)
			return 0;
		int mid=(s+e)/2;
		long ans=0;
		ans+=sort(s,mid);
		ans+=sort(mid+1,e);
		int []l=new int [mid-s+1];
		for(int i=0;i<l.length;i++)
			l[i]=S[i+s];
		int[] r=new int [e-mid];
		for(int i=mid+1;i<=e;i++)
		{
			r[i-(mid+1)]=S[i];
		}
		int i=0;
		int j=0;
		
		for(int k=s;k<=e;k++)
		{
			if(i==l.length)
				S[k]=r[j++];
			else if(j==r.length)
				S[k]=l[i++];
			else if(l[i]<=r[j])
			{
				ans+=r.length-j;
				S[k]=l[i++];
				
			}
			else
			{
				S[k]=r[j++];
				
			}
		}
		return ans;
		
	}
	
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
		int lo=1;
		long min=(n*1L*(n-1)/2+n+1)/2;
		int ans=-1;
		// binary search on the greatest x such that the # of pairs(l,r) such that m(l,r) is >=x is>= (n*(n-1)/2)/2
		while(lo<=hi) 
		{
			int mid=(lo+hi)/2;
			
			
				
			S=new int [n+1];
			
			for(int i=1;i<=n;i++)
			{
				if(a[i-1]>=mid)
					S[i]=1;
				else
					S[i]=-1;
				S[i]+=S[i-1];
			}
			
			
			
			long inversions=sort(0,n);
			
			
			if(inversions>=min)
			{
				ans=mid;
				lo=mid+1;
			}
			else
				hi=mid-1;
					
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