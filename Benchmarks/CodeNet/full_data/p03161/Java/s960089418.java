import java.io.*;
import java.util.*;
 
 
public class Main{
static int mod = (int)(Math.pow(10, 9) + 7);
   public static void main(String[] args) {
      MyScanner sc = new MyScanner();
      out = new PrintWriter(new BufferedOutputStream(System.out));
      int n  = sc.nextInt();
      int[] s = new int[n];
      int k = sc.nextInt();
      for (int i = 0; i< n; i++){
        s[i] = sc.nextInt();
      }
      
      int[] dp = new int[n];
      boolean[] t = new boolean[n];
      for (int i = 0; i < n; i++){
        for (int j = 1; j <= k; j++){
          if (i < n-j){
          if (!t[i+j]){
            t[i+j] = true;
            dp[i+j] = dp[i] + abs(s[i], s[i+j]);
          }
          else{
            dp[i+j] = Integer.min(dp[i] + abs(s[i],s[i+j]), dp[i+j]); 
          }
        }
        }
        
        
      }
      //for (int i = 0; i < n; i++) out.println(dp[i]);
      out.println(dp[n-1]);
      out.close();
   }
  static int abs(int a, int b){
    if (b>a ) return b-a;
    return a-b;
  }
   static long pow(long a, long N) {
	   if (N == 0) return 1;
	   else if (N == 1) return a;
	   else {
		   long R = pow(a,N/2);
		   if (N % 2 == 0) {
			   return R*R;
		   }
		   else {
			   return R*R*a;
		   }
	   }
   }
   
   static long powMod(long a, long N) {
	   if (N == 0) return 1;
	   else if (N == 1) return a % mod;
	   else {
		   long R = powMod(a,N/2) % mod;
		   R *= R % mod;
		   if (N % 2 == 0) {
			   R *= a % mod;
		   }
			   return R % mod;
	   }
   }
static void mergeSort(int[] A){ // low to hi sort, single array only
      int n = A.length;
      if (n < 2) return;
      int[] l = new int[n/2];
      int[] r = new int[n - n/2];
 
      for (int i = 0; i < n/2; i++){
        l[i] = A[i];
      }
 
      for (int j = n/2; j < n; j++){
        r[j-n/2] = A[j];
      }
 
      mergeSort(l);
      mergeSort(r);
      merge(l, r, A);
    }
 
    static void merge(int[] l, int[] r, int[] a){
      int i = 0, j = 0, k = 0;
      while (i < l.length && j < r.length && k < a.length){
        if (l[i] < r[j]){
          a[k] = l[i];
          i++;
        }
        else{
          a[k] = r[j];
          j++;
        }
        k++;
      }
      while (i < l.length){
        a[k] = l[i];
        i++;
        k++;
      }
 
      while (j < r.length){
        a[k] = r[j];
        j++;
        k++;
      }
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
   //--------------------------------------------------------
}





