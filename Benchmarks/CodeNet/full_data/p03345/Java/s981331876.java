import java.util.*;
import java.math.BigInteger;
import static java.math.BigInteger.*;

public class Main {

  public static void main(String args[]) {
    (new Main()).solve();
  }

  void solve() {

    Scanner cin = new Scanner(System.in);
    
    long a = cin.nextLong();
    long b = cin.nextLong();
    long c = cin.nextLong();
    
    long k = cin.nextLong();
    
    long ans = 0;
    if( k % 2 == 0 ) {
    	ans = a - b;
    }
    else {
    	ans = b - a;
    }
    
    if( Math.abs(ans) > 1000L * 1000L * 1000L * 1000L * 1000L * 1000L ) {
    	System.out.println("Unfair");
    }
    else {
    	System.out.println(ans);
    }

    cin.close();

  }
  
  

}
