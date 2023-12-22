import java.io.*;
import java.util.*;
import java.lang.*;
import java.awt.*;
import java.awt.geom.*;
import java.math.*;
import java.text.*;
import java.math.BigInteger.*;
import java.util.Arrays; 

public class   Main
{
  BufferedReader in;
  StringTokenizer as;
  double nums[][][],nums2[];
  ArrayList < Integer > [] ar;
  int a;
  public static void main (String[] args)
  {
    new Main  ();
  }
  
  public double solve(int aa, int bb, int cc)
  {
    if(nums[aa][bb][cc] != 0)
      return nums[aa][bb][cc];
    else if (aa == 0 && bb == 0 && cc == 0)
      return 0;
    double ans = 0;
    if(cc != 0)
      ans += cc * 1.0 /a * (solve(aa,bb+1,cc-1)+1);
    if(bb != 0)
      ans += bb * 1.0/a * (solve(aa+1,bb-1,cc)+1);
    if(aa != 0)
      ans += aa * 1.0 /a * (solve(aa-1,bb,cc)+1);
    double temp = (a-aa-bb-cc) * 1.0 /a;
    ans += temp;
    ans = ans/(1-temp);
    nums[aa][bb][cc] = ans;
    return ans;
    
  }
  public int GCD(int a, int b) {
    if (b==0) return a;
    return GCD(b,a%b);
  }
  
  public Main  ()
  {
    try
    {
      
      in = new BufferedReader (new InputStreamReader (System.in));
       a = nextInt();
      nums = new double [a+1][a+1][a+1];
      int aa = 0;
      int bb = 0;
      int cc = 0;
      for(int x =0;x<a;x++)
      {
        int c = nextInt();
        if(c == 3)
          cc++;
        else if (c == 2)
          bb++;
        else
          aa++;
      }
      System.out.println(solve(aa,bb,cc));
    }
    
    catch(IOException e)
    {
      
    }
  }
  
  
  
  
  
  
  
  String next () throws IOException
  {
    while (as == null || !as.hasMoreTokens ())
    {
      as = new StringTokenizer (in.readLine ().trim ());
    }
    
    
    return as.nextToken ();
  }
  
  
  
  long nextLong () throws IOException
  {
    return Long.parseLong (next ());
  }
  
  
  int nextInt () throws IOException
  {
    return Integer.parseInt (next ());
  }
  
  
  double nextDouble () throws IOException
  {
    return Double.parseDouble (next ());
  }
  
  
  String nextLine () throws IOException
  {
    return in.readLine ().trim ();
  }
}