import java.io.*;
import java.util.*;
 
public class Main{
   public static void main(String[] args) {
      MyScanner sc = new MyScanner();
      out = new PrintWriter(new BufferedOutputStream(System.out));
      
      //begin
      int n = sc.nextInt();
      int d = sc.nextInt();
      int[] coords = new int[n * 2];
      int match = 0;
      for(int i = 0; i < coords.length; i++)
        coords[i] = sc.nextInt();
      for(int i = 0; i < coords.length - 2; i += 2)
      {
          double dist = Math.sqrt(Math.pow(Math.abs(coords[i] - coords[i + 2]), 2) + Math.pow(Math.abs(coords[i + 1] - coords[i + 3]), 2));
          if(dist == (int) (dist))
            match++;
      }
      double dista = Math.sqrt(Math.pow(Math.abs(coords[coords.length - 2] - coords[0]), 2) + Math.pow(Math.abs(coords[coords.length - 1] - coords[1]), 2));
      if(dista == (int) (dista))
        match++;
      out.println(match);
      //end
   }
 
   public static PrintWriter out;
      
   public static class MyScanner {
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
 
      int nextInt() {
          return Integer.parseInt(next());
      }
      long nextLong() {
          return Long.parseLong(next());
      }
      double nextDouble() {
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