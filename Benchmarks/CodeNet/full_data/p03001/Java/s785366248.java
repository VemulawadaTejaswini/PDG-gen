import java.util.*;

class Main {
	  static int mod=1_000_000_007;
  public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
      long cnt =0;
      double wk =0;
      double S =0;
      int flg=0;
      double W = sc.nextLong();
      double H = sc.nextLong();
      double x = sc.nextLong();
      double y = sc.nextLong();
      
      if(W/2==x || H/2==y) {
    	  flg = 1;
      }
      
      if(W<H) {
    	  if(W-x<W/2) {
        	  wk = W - x;    		  
    	  } else {
    		  wk = x;
    	  }
    	  S=H*wk;
      } else {
    	  if(y<H/2) {
        	  wk = y;    		  
    	  } else {
    		  wk = H-y;
    	  }
    	  S=W*wk;    	  
      }
      
      
	  System.out.println(S);
  }
  
 
}