import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();
    int C = sc.nextInt();
    int D = sc.nextInt();
    int t = 0;
    for (double d = A + 0.5; d < B; d += 1.0) {
      if (C < d && d < D) t++;
    }
    System.out.println(t);
  }
}
