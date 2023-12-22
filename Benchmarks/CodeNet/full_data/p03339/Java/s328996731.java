import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    String S = sc.next();

    int[] wcount = new int[N];
    int[] ecount = new int[N];
    for (int i = 0; i < N; i++) {
      wcount[i] = i == 0 ? 0 : wcount[i-1];
      if (S.charAt(i) == 'W') {
        wcount[i]++;
      }
    }
    for (int i = N-1; i >= 0; i--) {
      ecount[i] = i == N-1 ? 0 : ecount[i+1];      
      if (S.charAt(i) == 'E') {
        ecount[i]++;
      }
    }
    
    int ans = Integer.MAX_VALUE;
    for (int i = 0; i < N; i++) {
      int count = i < N-1 ? wcount[i] + ecount[i+1] : wcount[i];
      if (S.charAt(i) == 'W') {
        count--;
      }
      ans = Math.min(ans, count);
    }
    
    System.out.println(ans);
  }
}