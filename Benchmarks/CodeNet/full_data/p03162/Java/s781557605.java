import java.util.*;
import java.io.*;
//267630EY
public class Main
{
  static PrintWriter out=new PrintWriter(System.out);
  static int[] a;
  static int[] b;
  static int[] c;
  static int[][] dp;
 

  public static void main(String[] args) throws IOException
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    a=new int[n];
    b=new int[n];
    c=new int[n];
    dp=new int[n][4];
    for(int i=0;i<n;i++)
    {
      Arrays.fill(dp[i],-1);
    }
    for(int i=0;i<n;i++)
    {
      a[i]=sc.nextInt();
      b[i]=sc.nextInt();
      c[i]=sc.nextInt();
    }
    int ans=solve(0,0);
    out.println(ans);
    out.flush();
             
    
  }
  private static int solve(int n,int prev)
  {
    if(n==a.length) return 0;
    else if(dp[n][prev]!=-1) return dp[n][prev];
    {
      if(prev==0)
      {
        dp[n][prev]=Math.max(a[n]+solve(n+1,1),Math.max(b[n]+solve(n+1,2),c[n]+solve(n+1,3)));
      }
      else if(prev==1)
      {
        dp[n][prev]=Math.max(b[n]+solve(n+1,2),c[n]+solve(n+1,3));
      }
      else if(prev==2)
      {
        dp[n][prev]=Math.max(c[n]+solve(n+1,3),a[n]+solve(n+1,1));
      }
      else
      {
        dp[n][prev]=Math.max(a[n]+solve(n+1,1),b[n]+solve(n+1,2));
      }
      return dp[n][prev];
    }
  }
      
      
  
  static class Scanner
  {
    BufferedReader br;
    StringTokenizer tk=new StringTokenizer("");
    public Scanner(InputStream is) 
    {
      br=new BufferedReader(new InputStreamReader(is));
    }
    
    public boolean hasNext()
    {
      

      boolean result=false;
      
      try 
      {
        result = br.ready();
      } 
      catch (IOException e)
      {
        System.err.println(e);
      }
      return result;
    }
    
    public int nextInt() throws IOException
    {
      if(tk.hasMoreTokens())
        return Integer.parseInt(tk.nextToken());
      tk=new StringTokenizer(br.readLine());
      return nextInt();
    }
    public long nextLong() throws IOException
    {
      if(tk.hasMoreTokens())
        return Long.parseLong(tk.nextToken());
      tk=new StringTokenizer(br.readLine());
      return nextLong();
    }
    public String next() throws IOException
    {
      if(tk.hasMoreTokens())
        return (tk.nextToken());
      tk=new StringTokenizer(br.readLine());
      return next();
    }
    public String nextLine() throws IOException
    {
      tk=new StringTokenizer("");
      return br.readLine();
    }
    public double nextDouble() throws IOException
    {
      if(tk.hasMoreTokens())
        return Double.parseDouble(tk.nextToken());
      tk=new StringTokenizer(br.readLine());
      return nextDouble();
    }
    public char nextChar() throws IOException
    {
      if(tk.hasMoreTokens())
        return (tk.nextToken().charAt(0));
      tk=new StringTokenizer(br.readLine());
      return nextChar();
    }
    public int[] nextIntArray(int n) throws IOException
    {
      int a[]=new int[n];
      for(int i=0;i<n;i++)
        a[i]=nextInt();
      return a;
    }
    public long[] nextLongArray(int n) throws IOException
    {
      long a[]=new long[n];
      for(int i=0;i<n;i++)
        a[i]=nextLong();
      return a;
    }
    public int[] nextIntArrayOneBased(int n) throws IOException
    {
      int a[]=new int[n+1];
      for(int i=1;i<=n;i++)
        a[i]=nextInt();
      return a;
    }
    public long[] nextLongArrayOneBased(int n) throws IOException
    {
      long a[]=new long[n+1];
      for(int i=1;i<=n;i++)
        a[i]=nextLong();
      return a;
    }
  }
}

