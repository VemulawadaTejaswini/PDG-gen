import java.util.*;

public class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    
    int N = sc.nextInt();
    int R = sc.nextInt();
    int ans = R;
    if ( N < 10 ) {
      ans += 100 * (10 - N);
    }
    System.out.printf("%d", ans) ;
    sc.close();
  }
}