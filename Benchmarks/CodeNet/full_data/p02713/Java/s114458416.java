import java.util.*;
public class Main {

  public static void main(String[] args) { 
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      long sum = 0;
      for(int i = 1; i <= n; i++) {
        for(int j = 1; j <= n; j++) {
          int ij = gcd(i, j);
          for(int k = 1; k <= n; k++) {
            sum += gcd(ij, k);
          }
        }
      }
      System.out.println(sum);
  }
  private static int gcd(int a, int b) {
    if(b == 0)  return a;
    return gcd(b, a % b);
  }
}
