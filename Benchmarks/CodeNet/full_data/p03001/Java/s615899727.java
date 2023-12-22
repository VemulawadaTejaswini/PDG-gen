import java.util.Scanner;

public class Main {
  public static void main (String[] args) {
    Scanner in = new Scanner(System.in);

    while (in.hasNext()) {
      long W = in.nextLong();
      long H = in.nextLong();
      long x = in.nextLong();
      long y = in.nextLong();
      
      long min1 = Math.min(W * (H - y), W * y);
      long min2 = Math.min(H * (W - x), H * x);
      long maxMin = Math.max(min1, min2);
      
      System.out.printf("%d %d\n", maxMin, min1 == min2 ? 1 :0);
    }
  }
}