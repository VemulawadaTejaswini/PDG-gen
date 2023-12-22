import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();
    int T = sc.nextInt();
    int ans = 0;
    for (int i = A; i <= 20; i+=A) {
       if (i > T) {
         System.out.println(ans);
         break;
       }
       ans += B;
    }
  }
}