import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long H = sc.nextLong();
    long W = sc.nextLong();
    // パターン1
    long min1 = Long.MAX_VALUE;
    if (3 <= H) {
      if (H % 3 == 0) {
        min1 = 0;
      } else {
        min1 = W;
      }
    }
    // パターン2
    long min2 = Long.MAX_VALUE;
    if (3 <= W) {
      if (W % 3 == 0) {
        min2 = 0;
      } else {
        min2 = H;
      }
    }
    // パターン3
    long min3 = Long.MAX_VALUE;
    for (int i = 1; i < H; i++) {
      long s1 = i * W;
      long w1 = W / 2;
      long w2 = W - w1;
      long s2 = (H - i) * w1;
      long s3 = (H - i) * w2;
      long tmp = Math.max(Math.max(s1, s2), s3) - Math.min(Math.min(s1, s2), s3);
      if (tmp < min3) {
        min3 = tmp;
      }
    }
    // パターン4
    long min4 = Long.MAX_VALUE;
    for (int i = 1; i < W; i++) {
      long s1 = i * H;
      long h1 = H / 2;
      long h2 = H - h1;
      long s2 = (W - i) * h1;
      long s3 = (W - i) * h2;
      long tmp = Math.max(Math.max(s1, s2), s3) - Math.min(Math.min(s1, s2), s3);
      if (tmp < min4) {
        min4 = tmp;
      }
    }
    System.out.println(Math.min(Math.min(min1, min2), Math.min(min3, min4)));
  }
}