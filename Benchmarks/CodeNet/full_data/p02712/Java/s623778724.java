import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
    	MyScanner sc = new MyScanner();
   		int num=Integer.parseInt(sc.nextLine());
		long te = 0;
      	for(int i = 0;i<=num;i++){
          if(!(i%3==0) && !(i%5==0)){
             te += i;
          }
        }
      	System.out.println(te);
    }
}

class MyScanner {
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