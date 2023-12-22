import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long A = sc.nextLong();
    long B = sc.nextLong();
    long K = sc.nextLong();
    sc.close();

    long a = Long.max(0, A - K);
    long b = Long.max(0, B - Long.max(0, K - A));
    System.out.println(a + " " + b);
  }
}