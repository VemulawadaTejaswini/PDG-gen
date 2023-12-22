import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] pos = new int[n];
    for(int i = 0; i < n; i++) {
      int p = sc.nextInt();
      pos[p - 1] = i;
    }
    int m = 1;
    int t = 1;
    for(int i = 1; i < n; i++) {
      if(pos[i] > pos[i - 1]) {
        t++;
      } else {
        m = Math.max(m, t);
        t = 1;
      }
      if(t == n) m = n;
    }
    System.out.println(n - m);
  }
}