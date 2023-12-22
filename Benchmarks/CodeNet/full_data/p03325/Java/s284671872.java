import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();    
    int ans = 0;
    for (int i = 0; i < N; i++) {
      int a = sc.nextInt();
      ans += powNum(a);
    }
    
    System.out.println(ans);
  }
  
  private static int powNum(int a) {
    if (a % 2 == 1) {
      return 0;
    }
    return 1 + powNum(a/2);
  }
}