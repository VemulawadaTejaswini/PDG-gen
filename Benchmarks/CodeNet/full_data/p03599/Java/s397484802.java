import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();
    int C = sc.nextInt();
    int D = sc.nextInt();
    int E = sc.nextInt();
    int F = sc.nextInt();
    int ans1 = 100 * A + C;
    int ans2 = C;
    for(int a = 0; a <= 30; a++) {
      for(int b = 0; b <= 30; b++) {
        for(int c = 0; c <= 30; c++) {
          for(int d = 0; d <= 30; d++) {
            if((a + b) > 0) {
              int water = 100 * (a * A + b * B);
              int sugar = c * C + d * D;
              if((E * (a * A + b * B)) >= sugar) {
                if((ans2 * (water + sugar)) < (ans1 * sugar)) {
                  ans1 = water + sugar; 
                  ans2 = sugar;
                }
              }
            }
          }
        }
      }
    }
    System.out.println(ans1 + " " + ans2);
  }
}