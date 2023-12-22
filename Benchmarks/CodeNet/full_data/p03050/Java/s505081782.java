import java.util.*;

public class Main {
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
      long ans = 0;
      long right;
      
        for (long i=1; i < N; i++) {
          right = N % i;
			if(right != 0) {
            	ans = ans + check(N,i,right);
            }
        }
      
        System.out.println(ans);
    }
  
  private static long check(long N, long m, long right) {
    long fav;
      long left = N/m;
    if(left == right) {
    	return m;
    }else {return 0;}      
  }
}