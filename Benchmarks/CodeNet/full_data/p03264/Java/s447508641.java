import java.util.*;

public class Main {
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int K = sc.nextInt();
    
    int ans = 0;
    for (int i = 1; i <= K-1; i++) {
      boolean even = i % 2 == 0;
      for (int j = i + 1; j <= K; j++) {
        if (even && j % 2 == 1 || !even && j % 2 == 0) {
            ans++;
        }
      }
    }
    
    System.out.println(ans);
  }
}