import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int N   = sc.nextInt();
    int ans = 0;
    
    for (int i = 0; i < N; i++) {
      int a_i = sc.nextInt();
      
      while (a_i % 2 == 0) {
        a_i = a_i >> 1;
        ans++;
      }
    }
    
    System.out.println(ans);
  }
}