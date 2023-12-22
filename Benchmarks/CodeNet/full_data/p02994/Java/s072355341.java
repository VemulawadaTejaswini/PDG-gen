import java.util.*;

class Main {
	  static int mod=1_000_000_007;
  public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
      long cnt =0;
      int flg=0;
      long N = sc.nextInt();
      long L = sc.nextInt();
      
      for(int i=0;i<N;i++) {
    	  cnt=cnt+L+i;
    	  if(L+i==0) {
    		  flg = 1;
    	  }
      }
      if (flg==0) {
    	  if(L<0) {
    		  cnt = cnt -(L+N-1);
    	  } else {
    		  cnt = cnt - (L);
    	  }
      }
      
      System.out.println(cnt);    	  
  }
 
}