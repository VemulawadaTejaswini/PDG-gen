import java.util.*;
import java.io.*;
public class Main
{   
    static int arr[]=new int[100008];
    static int dp[]=new int[100008];
    public static int getAns(int arr[],int index,int n)
      {
          if(index>=n)return 0;
          if(dp[index]!=-1)return dp[index];
          int a=Integer.MAX_VALUE,b=Integer.MAX_VALUE;
          if(index+1<=n)
             a=Math.abs(arr[index+1]-arr[index])+getAns(arr,index+1,n);
          if(index+2<=n)
            b=Math.abs(arr[index+2]-arr[index])+getAns(arr,index+2,n);
          return dp[index]=Math.min(a,b);
      }
	public static void main(String[] args)throws IOException {
		FastReader kb=new FastReader();
        int n=kb.nextInt();
        Arrays.fill(dp,-1);
        for(int i=1;i<=n;i++)
	     {
	         arr[i]=kb.nextInt();
	     }
	    System.out.println(getAns(arr,1,n));
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











