import java.io.*;
import java.util.*;

 
public class Main{
   public static void main(String[] args) {
      MyScanner sc = new MyScanner();
      out = new PrintWriter(new BufferedOutputStream(System.out));
      int N=sc.nextInt();
      int K=sc.nextInt();
      int p[]=new int[N];

      for(int i=0;i<N;i++){
          p[i]=sc.nextInt();
      }
      int csum=0;
      for(int i=0;i<K;i++){
          csum+=p[i];
      }
      int maxsum=csum;
      for(int i=1;i+K<=N;i++){
          csum-=p[i-1];
          csum+=p[i+K-1];
          maxsum=Math.max(maxsum, csum);
      }
      out.println(String.format("%.10f", (maxsum+K)/2.0));
      out.close();
   }

   //-----------PrintWriter for faster output---------------------------------
   public static PrintWriter out;
      
   //-----------MyScanner class for faster input----------
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