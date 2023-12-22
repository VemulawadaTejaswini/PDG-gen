import java.util.*;
public class Main {
  
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    long W = sc.nextLong();
    long H = sc.nextLong();
    long x = sc.nextLong();
    long y = sc.nextLong();

    if (W*y == H*x || W*y + H*x == H*W) {
      int flag = 2*x == W && 2*y == H ? 1 : 0;
      System.out.println((double)W*H/2 + " " + flag);
      return;
    }

    long xH = 2*x <= W ? x * H : (W-x) * H;
    long yW = 2*y <= H ? y * W : (H-y) * W;
    int flag = xH == yW ? 1 : 0;

    System.out.println((double)(Math.max(xH, yW)) + " " + flag);
  }
}
