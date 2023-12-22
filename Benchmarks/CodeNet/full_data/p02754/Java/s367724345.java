import java.util.*;

public class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    long N = sc.nextInt();
    long A = sc.nextInt();
    long B = sc.nextInt();
    long div = (N / (A + B)) * A;
    long mod = N % (A + B);

    if (mod < A) {
      div += mod;
    } else if (A != 0) {
      div += A;
    }
    System.out.printf("%d", div);
  }
}