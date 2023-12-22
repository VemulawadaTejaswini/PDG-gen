import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int A = sc.nextInt();
    int B = sc.nextInt();
    int a = 0;
    int b = 0;
    int c = 0;
    for (int i = 0; i < N; i++) {
      int p = sc.nextInt();
      if (p <= A) {
        a++;
      } else if (p <= B) {
        b++;
      } else {
        c++;
      }
    }
    System.out.println(Math.min(Math.min(a, b), c));
  }
}