import java.util.*;
import java.io.*;
import java.math.*;
import java.awt.geom.*;
public class Main{
    public static void main(String[] args) {
      MyScanner sc=new MyScanner();
      char a[]={'a','b','c'};
      char b[]=(sc.next()).toCharArray();
      Arrays.sort(b);
      if(Arrays..equals(a,b)) System.out.println("Yes");
      else System.out.println("No");
  }
    private static class MyScanner {
      BufferedReader br;
      StringTokenizer st;

      public MyScanner() {
         br = new BufferedReader(new InputStreamReader(System.in));
      }

      String next() {
          while (st == null || !st.hasMoreElements()) {
              try {
                  st = new StringTokenizer(br.readLine());
              } catch (IOException e) {
                  e.printStackTrace();
              }
          }
          return st.nextToken();
      }

      int ni() {
          return Integer.parseInt(next());
      }
      float nf() {
        return Float.parseFloat(next());
      }
      long nl() {
          return Long.parseLong(next());
      }

      double nd() {
          return Double.parseDouble(next());
      }

      String nextLine(){
          String str = "";
    try {
       str = br.readLine();
    } catch (IOException e) {
       e.printStackTrace();
    }
    return str;
      }
   }
}