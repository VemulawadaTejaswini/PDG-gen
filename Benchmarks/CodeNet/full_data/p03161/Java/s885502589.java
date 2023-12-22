import java.util.*;
import java.io.*;
public class Main
{   
    static int arr[]=new int[100008];
    static int dp[]=new int[100008];
    public static int getAns(int arr[],int index,int n,int k)
      {
          if(index>=n)return 0;
          if(dp[index]!=-1)return dp[index];
          int ans=Integer.MAX_VALUE;
          for(int i=1;i<=k;i++)
           if((index+i)<=n)
            ans=Math.min(ans,Math.abs(arr[index+i]-arr[index])+getAns(arr,index+i,n,k));
          return dp[index]=ans;
      }
	public static void main(String[] args)throws IOException {
		FastReader kb=new FastReader();
        int n=kb.nextInt();
        int k=kb.nextInt();
        Arrays.fill(dp,-1);
        for(int i=1;i<=n;i++)
	     {
	         arr[i]=kb.nextInt();
	     }
	    System.out.println(getAns(arr,1,n,k));
	}
	static class FastReader 
    { 
        BufferedReader br; 
        StringTokenizer st; 
  
        public FastReader() 
        { 
            br = new BufferedReader(new
                     InputStreamReader(System.in)); 
        } 
  
        String next() 
        { 
            while (st == null || !st.hasMoreElements()) 
            { 
                try
                { 
                    st = new StringTokenizer(br.readLine()); 
                } 
                catch (IOException  e) 
                { 
                    e.printStackTrace(); 
                } 
            } 
            return st.nextToken(); 
        } 
  
        int nextInt() 
        { 
            return Integer.parseInt(next()); 
        } 
  
        long nextLong() 
        { 
            return Long.parseLong(next()); 
        } 
  
        double nextDouble() 
        { 
            return Double.parseDouble(next()); 
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











