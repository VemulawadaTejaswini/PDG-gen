import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();
    int C = sc.nextInt();
    int X = sc.nextInt();
    int Y = sc.nextInt();
    int sum1 = 0;
    int sum2 = 0;
    int sum3 = 0;
    sum1 = A * X + B * Y;
    sum2 = C * ((int) Math.max(X, Y) * 2);
    if (X > Y) {
      sum3 = C * (Y * 2) + (X - Y) * A;
    } else {
      sum3 = C * (X * 2) + (Y - X) * B;
    }
    int ans = Math.min(sum3, Math.min(sum1, sum2));
    System.out.println(ans);
  }
}