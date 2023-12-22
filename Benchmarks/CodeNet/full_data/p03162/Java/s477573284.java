import java.util.*;
import java.io.*;
public class Main
{   
    static int arr[][]=new int[100008][3];
    static int dp[][]=new int[100008][4];
    public static int getAns(int day,int lastday,int n)
    {
        if(day>=n)return 0;
        if(dp[day][lastday]!=-1)return dp[day][lastday];
        int ans=Integer.MIN_VALUE;
        if(lastday!=0)
        {
            ans=Math.max(ans,arr[day][0]+getAns(day+1,0,n));
        }
        if(lastday!=1)
        {
            ans=Math.max(ans,arr[day][1]+getAns(day+1,1,n));
        }
        if(lastday!=2)
        {
            ans=Math.max(ans,arr[day][2]+getAns(day+1,2,n));
        }
        return dp[day][lastday]=ans;
    }
	public static void main(String[] args)throws IOException {
		FastReader kb=new FastReader();
        int n=kb.nextInt();
        for(int i=0;i<dp.length;i++)Arrays.fill(dp[i],-1);
        for(int i=0;i<n;i++)
        {arr[i][0]=kb.nextInt();arr[i][1]=kb.nextInt();arr[i][2]=kb.nextInt();}
        System.out.println(getAns(0,3,n));
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











