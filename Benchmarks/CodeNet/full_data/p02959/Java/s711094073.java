
import java.util.*;

class Main {
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int N = sc.nextInt();
      long[] A = new long[N+2];
      long[] B = new long[N+1];

      long cnt = 0;
      long wk = 0;
      long wk2 = 0;
      for(int i=0;i<N+1;i++) {
          A[i] = sc.nextInt();
      }
      for(int i=0;i<N;i++) {
          B[i] = sc.nextInt();
      }
      
      for(int i=0;i<N;i++) {
   	   wk = B[i] - A[i];
   	   if(wk<=0) {
   		   cnt = cnt + B[i];
   	   } else {
   		   cnt = cnt + A[i];
   		   wk2 = A[i+1] - wk;
   		   if(wk2<=0) {
   			   cnt = cnt + A[i+1];
   			   A[i+1] = 0;
   		   } else {
   			   A[i+1] = wk2;
   			   cnt = cnt + wk;
   		   }
   	   }
   	   
   	   
   	   
   	   
      }
      System.out.print(cnt);

  }
}