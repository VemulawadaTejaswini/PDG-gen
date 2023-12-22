import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int p = 1;
    for(int i = 0; i < n; i++) {
      int a = sc.nextInt();
      if(a == p) {
        p++;
      }
    }
    if(p > 1) System.out.println(n - p + 1);
    if(p == 1) System.out.println(-1);
  }
}