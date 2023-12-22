import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int k = sc.nextInt();
    int p = 0;
    int ans = 0;
    for(int i = 1; i <= Math.min(a, b); i++) {
      if((a % i == 0) && (b % i == 0)) {
        p++;
        if(p == k) {
          ans = i;
        }
      }
    }
    System.out.println(ans);
  }
}