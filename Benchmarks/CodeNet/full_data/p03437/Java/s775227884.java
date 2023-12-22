import java.util.*;
import java.io.*;
import java.math.*;
 class Main{
    public static void main(String[] args) {
        MyScanner sc=new MyScanner();
        int x=sc.nextInt();
        int y=sc.nextInt();
        if(y>x){
          System.out.println(x);
          System.exit(0);
        }
        else if(x%y==0){
          System.out.println(-1);
          System.exit(0);
        }
        for(int i=x;;i+=x){
          if(i%y!=0){
            System.out.println(i);
            System.exit(0);
          }
        }

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