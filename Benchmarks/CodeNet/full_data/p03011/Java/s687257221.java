import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int P = sc.nextInt(), Q = sc.nextInt(), R = sc.nextInt();
    System.out.println(P + Q + R - Math.max(Math.max(P, Q), R));
  }
}