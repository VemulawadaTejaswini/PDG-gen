import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int ans = 0;
    for(int i = 1; i <= n; i++) {
      int p = 0;
      for(int j = 1; j <= i; j++) {
        if((i % j) == 0) p++;
      }
      if((p == 8) && ((i % 2) == 1)) ans++;
    }
    System.out.println(ans);
  }
}