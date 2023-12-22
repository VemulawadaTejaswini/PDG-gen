import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int gu = 0;
    int ki = 0;
    for(int i = 0; i < n; i++) {
      int a = sc.nextInt();
      if(a % 2 == 0) {
        gu++;
      } else {
        ki++;
      }
    }
    long ans = (long)Math.pow(3, n) - (long)Math.pow(2, gu);
    System.out.println(ans);
  }
}