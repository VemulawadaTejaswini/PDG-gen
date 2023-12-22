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
 
  public static void main(String[] args) {
      new Thread(null, new Main(), "whatever", 1<<29).start();
  }

  public int getMoves(int a, int b) {
    int left=Math.min(a,b);
    int right=Math.max(a,b);
    int cnt=0;

    int firstSetOfMoves=left-1;
    left-=firstSetOfMoves;
    right-=firstSetOfMoves;
    cnt+=firstSetOfMoves;

    if(right==left+1) {
      cnt+=1;
      right-=1;
    }
    else {
      cnt+=1;
      right-=1;
      cnt+=((right-left)/2);
    }

    return cnt;
  }
 
  public void run() {
    in = new BufferedReader(new InputStreamReader(System.in));
    out = new PrintWriter(System.out, false);
 
    try
    {
      // in = new BufferedReader(new FileReader("class_treasurer.txt"));
      // out = new PrintWriter("output.txt");

      int t,x1,n,a,b;
      String str;
      String[] token;

      str=in.readLine().trim();
      token=str.split(" ");
      n=Integer.parseInt(token[0]);
      a=Integer.parseInt(token[1]);
      b=Integer.parseInt(token[2]);

      if(Math.abs(a-b)%2==0) {
        out.println(Math.abs(a-b)/2);
      }
      else {
        out.println(Math.min(getMoves(a, b), getMoves(n-a, n-b)));
      }

      out.flush();
      out.close();
    }
    catch(Exception e) {
      e.printStackTrace();
    }
  }
}
