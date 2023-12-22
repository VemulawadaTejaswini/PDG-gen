import java.util.*;

public class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    
    int N = sc.nextInt();
    int K = sc.nextInt();
    sc.close();

    boolean loop = true;
    int ans = 1;
    while (loop) {
      if ((N / K) != 0) {
        N = (N / K);
        ans++;
        continue;
      }
      loop = false;
    }
    System.out.printf("%d", ans) ;
  }
}