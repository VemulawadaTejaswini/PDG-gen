import java.util.*;

public class Main {
  public static void main(String... args) {
    Scanner scan = new Scanner(System.in);
    int N = scan.nextInt();
    int K = scan.nextInt();
    
    int ans = 0;
    for(int i=0; i<N; i++) {
      if(scan.nextInt() >= K) ans++;
    }
    System.out.println(ans);
  }
}