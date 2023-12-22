
import java.util.*;

class Main {
	  static long mod=1_000_000_007;
  public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
      long N = sc.nextLong();
      long M = sc.nextLong();
      long ans = 1;
      long[] f = new long[(int)N+100];
      long[] g = new long[(int)N+100];
      long[] a = new long[(int)M];
      long[] s = new long[(int)M+1];
      for (int i=0 ; i<M; i++) {
          a[i] = sc.nextLong();
      }
      f[1]=1;f[2]=2;
      g[1]=1;g[2]=1;
      for (int i=3 ; i<N+1; i++) {
          f[i] = f[i-2] + f[i-1];
          g[i] = g[i-2] + g[i-1];
      }
      for (int i=0 ; i<M; i++) {
    	  if(i==0) {
              s[i] = f[(int)a[i]-1];
              if(s[i]==0) {
            	  s[i]=1;
              }
    	  } else {
              s[i] = g[(int) ((int)a[i]-a[i-1] - 1)];    		  
    	  }
      }
      if(M==0) {
    	  s[(int)M] = f[(int)N];
      } else {
    	  s[(int)M]=f[(int) ((int) N-1-a[(int)M-1])];
    	  if(s[(int)M]==0) {
    		  s[(int)M]=1;
    	  }
      }
      for(int i=0 ; i<M+1; i++) {
    	  ans=ans*s[i]%mod;
      }
      
      
      
	  System.out.println(ans);
  }
  
 
}