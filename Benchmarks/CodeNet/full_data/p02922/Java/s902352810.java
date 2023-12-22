
import java.util.*;

public class Main {
  public static void main(String[] args) {
    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();
    int ans = 0;
    int cnt = 1;
    
    while (cnt < B) {
      cnt = cnt + (A - 1);
      ans++;
    }
    System.out.println(ans);
  }
}
