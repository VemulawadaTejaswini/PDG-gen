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
 
  public void run() {
    in = new BufferedReader(new InputStreamReader(System.in));
    out = new PrintWriter(System.out, false);
 
    try
    {
      // in = new BufferedReader(new FileReader("class_treasurer.txt"));
      // out = new PrintWriter("output.txt");

      int t,x1,n,i;
      String str;
      String[] token;

      str=in.readLine().trim();
      token=str.split(" ");
      n=Integer.parseInt(token[0]);

      out.println((n-1)/2);

      out.flush();
      out.close();
    }
    catch(Exception e) {
      e.printStackTrace();
    }
  }
}
