import java.io.*;
import java.util.*;

 
public class Main{
   public static void main(String[] args) {
      MyScanner sc = new MyScanner();
      out = new PrintWriter(new BufferedOutputStream(System.out));
      int N=sc.nextInt();
      int K=sc.nextInt();
      int R=sc.nextInt();
      int S=sc.nextInt();
      int P=sc.nextInt();
      String t=sc.next();
      String s="";
      int ans=0;

      for(int i=0;i<K;i++){
          s+="?";
      }
      t=s+t;

      for(int i=K;i<N+K;i++){
          char op=t.charAt(i);
          char cand='0';
          switch (op) {
              case 'r':
                  cand='p';
                  break;
              case 's':
                  cand='r';
                  break;
              case 'p':
                  cand='s';
                  break;
          }

          if(s.charAt(i-K)==cand){
              s=s+"?";
          }else{
              s=s+cand;
              switch (cand) {
                  case 'r':
                      ans+=R;
                      break;
                  case 's':
                      ans+=S;
                      break;
                  case 'p':
                      ans+=P;
                      break;
              }
          }
      }

      out.println(ans);
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