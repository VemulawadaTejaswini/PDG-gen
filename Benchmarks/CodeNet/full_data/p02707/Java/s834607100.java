import java.io.*;
import java.util.*;
public class Main {
static PrintWriter pw =new PrintWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) {
	// write your code here
        MyScanner mc = new MyScanner();
        int N = mc.nextInt();
        int [] arr = new int[N+1];
        for (int i=0;i<N-1;i++)
            arr[mc.nextInt()]++;
        for (int i=1;i<=N;i++)
            pw.println(arr[i]);
        pw.flush();
    }

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
