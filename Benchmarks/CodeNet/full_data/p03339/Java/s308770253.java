import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    String S = sc.next();
    
    int ans = Integer.MAX_VALUE;
    int wcount = 0;
    for (int i = 0; i < N; i++) {
      int count = 0;
      if (S.charAt(i) == 'W') {
        wcount++;
        count--;
      }
      int ecount = 0;
      for (int j = i + 1; j < N; j++) {
        if (S.charAt(j) == 'E') {
          ecount++;
        }
      }
      count += wcount + ecount;
      ans = Math.min(count, ans);
    }
    System.out.println(ans);
  }
}