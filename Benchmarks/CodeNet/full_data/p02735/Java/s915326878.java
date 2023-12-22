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

  static int minInversionsNeeded;
 
  public static void main(String[] args) {
      new Thread(null, new Main(), "whatever", 1<<29).start();
  }

  public void computeWays(boolean[][] isOpenCell, int n, int m, int i, int j, int inversionsNeeded) {
    if(i==n-1 && j==m-1) {
      minInversionsNeeded=Math.min(minInversionsNeeded, inversionsNeeded);
      return;
    }
    if(i+1<n) {
      int newInversionsNeeded=inversionsNeeded;
      
      if(isOpenCell[i][j] && !isOpenCell[i+1][j]) {
        newInversionsNeeded++;
      }
      computeWays(isOpenCell, n, m, i+1, j, newInversionsNeeded);
    }
    if(j+1<m) {
      int newInversionsNeeded=inversionsNeeded;

      if(isOpenCell[i][j] && !isOpenCell[i][j+1]) {
        newInversionsNeeded++;
      }
      computeWays(isOpenCell, n, m, i, j+1, newInversionsNeeded);
    }
  }
 
  public void run() {
    in = new BufferedReader(new InputStreamReader(System.in));
    out = new PrintWriter(System.out, false);
 
    try
    {
      // in = new BufferedReader(new FileReader("class_treasurer.txt"));
      // out = new PrintWriter("output.txt");

      int t,x1,n,m,i,j;
      String str;
      String[] token;

      str=in.readLine().trim();
      token=str.split(" ");

      n=Integer.parseInt(token[0]);
      m=Integer.parseInt(token[1]);

      boolean[][] isOpenCell = new boolean[n][m];

      for(i=0;i<n;i++) {
        str=in.readLine().trim();
        for(j=0;j<m;j++) {
          if(str.charAt(j)=='#') {
            isOpenCell[i][j]=false;
          }
          else {
            isOpenCell[i][j]=true;
          }
        }
      }

      minInversionsNeeded=n*m;

      int inversionsNeeded=0;
      if(!isOpenCell[0][0]) {
        inversionsNeeded++;
      }
      computeWays(isOpenCell, n, m, 0, 0, inversionsNeeded);

      out.println(minInversionsNeeded);

      out.flush();
      out.close();
    }
    catch(Exception e) {
      e.printStackTrace();
    }
  }
}
