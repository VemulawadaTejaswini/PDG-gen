import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = Integer.parseInt(sc.next());
    int q = Integer.parseInt(sc.next());
    String str = sc.next();
    char[] ch = new char[n];
    int[] dp = new int[n];
    for(int i = 0; i < n; i++) {
      dp[i] = 0;
      ch[i] = str.charAt(i);
    }
    for(int i = 0; i < n - 1; i++) {
      if(ch[i] == 'A' && ch[i+1] == 'C') dp[i] = 1;
    }
    int l , r, ans;
    for(int i = 0; i < q; i++) {
      ans = 0;
      l = Integer.parseInt(sc.next());
      r = Integer.parseInt(sc.next());
      for(int j = l - 1; j < r - 1; j++) {
        ans += dp[j];
      }
      System.out.println(ans);
    }
  }
}
