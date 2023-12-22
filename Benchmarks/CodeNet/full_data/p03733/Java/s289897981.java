import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int t = sc.nextInt();
    
    int stack;
    int ans = sc.nextInt() + t;
    
    
    for(int i = 1; i < n; i++) {
      stack = sc.nextInt();
      if(stack < ans) ans = stack + t;
      else ans += t;
    }
    
    System.out.println(ans);
  }
}
