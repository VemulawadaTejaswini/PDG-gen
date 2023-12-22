import java.util.*;
 
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    try {
      long h = sc.nextLong();
      long w = sc.nextLong();
      System.out.println(solve(h,w));
    } finally {
      sc.close();
    }
  }

  private static long solve(long h, long w) {
    if (h == 1 || w == 1) return 1;
    long s = h * w;
    if (s % 2 == 0) return s / 2;
    return (s + 1) / 2;
  }
}