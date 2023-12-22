import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;
 
import java.util.*;
import java.lang.*;
import java.io.*;

@SuppressWarnings("unchecked")
public class Main implements Runnable {

  static BufferedReader in;
  static PrintWriter out;

  public static long totalWays(int a, int b, int MOD) {
    long ans=1L;
    for(int j=1;j<=b;j++) {
      ans*=a;
      ans%=MOD;
    }
    return ans;
  }
 
  public static void main(String[] args) {
      new Thread(null, new Main(), "whatever", 1<<29).start();
  }
 
  public void run() {
    in = new BufferedReader(new InputStreamReader(System.in));
    out = new PrintWriter(System.out, false);
 
    try
    {
      // in = new BufferedReader(new FileReader("class_treasurer.txt"));
      // out = new PrintWriter("output.txt");

      int t,x1,n,i,MOD=998244353;
      String str;
      String[] token;

      str=in.readLine().trim();
      token=str.split(" ");
      n=Integer.parseInt(token[0]);

      int[] d=new int[n];
      int[] cnt=new int[n];

      int max=0;

      str=in.readLine().trim();
      token=str.split(" ");

      for(i=0;i<n;i++) {
        d[i]=Integer.parseInt(token[i]);
        cnt[d[i]]++;
        max=Math.max(max,d[i]);
      }

      boolean possible=true;
      long ways=1L;

      for(i=0;i<=max;i++) {
        if(i==0) {
          if(cnt[i]!=1) {
            possible=false;
            break;
          }
        }
        else {
          if(cnt[i]==0) {
            possible=false;
            break;
          }
          else {
            ways*=totalWays(i,cnt[i],MOD);
            ways%=MOD;
          }
        }
      }

      if(d[0]!=0)
        out.println(0);
      else if(!possible)
        out.println(0);
      else
        out.println(ways);

      out.flush();
      out.close();
    }
    catch(Exception e) {
      e.printStackTrace();
    }
  }
}
