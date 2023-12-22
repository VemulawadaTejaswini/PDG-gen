import java.util.*;

class Main {
	  static long mod=1_000_000_007;
  public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
      long A = sc.nextLong();
      long B = sc.nextLong();
      long ans = 0;
      long cnt = 1;
      
      for (ans=0;B>cnt;ans++) {
    	cnt=cnt+A-1;  
      }

      
	  System.out.println(ans);
  }
  
 
}
