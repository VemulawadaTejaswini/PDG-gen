import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    int[] s = new int[m];
    char[] c = new char[m];
    for(int i = 0; i < m; i++) {
      s[i] = sc.nextInt() - 1;
      c[i] = (sc.next()).charAt(0);
    }
    int ans = -1;
    for(int i = (int)Math.pow(10, n - 1); i < (int)Math.pow(10, n); i++) {
      String d = String.valueOf(i);
      int p = 0;
      for(int j = 0; j < m; j++) {
        if(d.charAt(s[j]) != c[j]) p++;
      }
      if(p == 0) {
        ans = i;
        break;
      }
    }
    if(n == 1) {
      String d = String.valueOf(0);
      for(int j = 0; j < m; j++) {
        if(d.charAt(s[j]) != c[j]) p++;
      }
      if(p == 0) ans = 0;
    }
    System.out.println(ans);
  }
}
