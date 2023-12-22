import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    int[] ac = new int[n];
    int[] wa = new int[n];
    for(int i = 0; i < m; i++) {
      int p = sc.nextInt() - 1;
      String s = sc.next();
      if(s.equals("AC")) {
        ac[p] = 1;
      } else {
        if(ac[p] == 0) wa[p]++;
      }
    }
    int ans1 = 0;
    int ans2 = 0;
    for(int i = 0; i < n; i++) {
      if(ac[i] == 1) {
        ans1++;
        ans2 += wa[i];
      }
    }
    System.out.println(ans1 + " " + ans2);
  }
}
