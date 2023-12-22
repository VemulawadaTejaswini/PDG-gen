import java.util.*;
import java.util.TreeMap;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long H = sc.nextLong();
    long W = sc.nextLong();
    long A = (H * W);
    if (A % 2 == 0) {
      System.out.println(A / 2);
    } else {
      System.out.println(A / 2 + 1);
    }
  }
}
