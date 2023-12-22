import java.util.*;

public class Main {
  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int n = sc.nextInt();
    int l = 0;
    int r = 0;
    int ans = 0;

    for (int i = 0; i < n; i++) {
      l = sc.nextInt();
      r = sc.nextInt();
      ans += (r - l + 1);
    }
    
    System.out.println(ans);
  }
}