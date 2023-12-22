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
  static boolean[][] isOpenCell;
  static int[][] ways;
 
  public static void main(String[] args) {
      new Thread(null, new Main(), "whatever", 1<<29).start();
  }

  public void computeWays(int i, int j) {
    if(i-1>=0) {
      int newInversionsNeeded=ways[i-1][j];
      if(isOpenCell[i-1][j] && !isOpenCell[i][j]) {
        newInversionsNeeded++;
      }
      ways[i][j]=Math.min(ways[i][j], newInversionsNeeded);
    }
    if(j-1>=0) {
      int newInversionsNeeded=ways[i][j-1];
      if(isOpenCell[i][j-1] && !isOpenCell[i][j]) {
        newInversionsNeeded++;
      }
      ways[i][j]=Math.min(ways[i][j], newInversionsNeeded);
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

      isOpenCell = new boolean[n][m];
      ways = new int[n][m];

      for(i=0;i<n;i++) {
        str=in.readLine().trim();
        for(j=0;j<m;j++) {
          if(str.charAt(j)=='#') {
            isOpenCell[i][j]=false;
          }
          else {
            isOpenCell[i][j]=true;
          }
          ways[i][j]=n*m;
        }
      }

      minInversionsNeeded=n*m;

      int inversionsNeeded=0;
      if(!isOpenCell[0][0]) {
        inversionsNeeded++;
      }

      ways[0][0]=inversionsNeeded;

      for(i=0;i<n;i++) {
        for(j=0;j<m;j++) {
          computeWays(i, j);
        }
      }

      out.println(ways[n-1][m-1]);

      out.flush();
      out.close();
    }
    catch(Exception e) {
      e.printStackTrace();
    }
  }
}
