import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int t = sc.nextInt();
    
    int stack1 = 0;
    int stack2 = sc.nextInt();
    int ans = t;
    
    for(int i = 1; i < n; i++) {
      stack1 = sc.nextInt();
      if(stack1 < stack2 + t) ans += (stack1 -stack2);
      else ans += t;
      stack2 = stack1;
    }
    
    System.out.println(ans);
  }
}
