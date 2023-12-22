import java.util.*;

public class Main {
  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);

    long w = sc.nextLong();
    long h = sc.nextLong();
    long x = sc.nextLong();
    long y = sc.nextLong();

    long m1 = Math.min(w - x, x) * h;
    long m2 = Math.min(h - y, y) * w;
    
    System.out.println(Math.max(m1, m2) + " " + (m1 == m2 ? "1" : "0"));
  }
}
