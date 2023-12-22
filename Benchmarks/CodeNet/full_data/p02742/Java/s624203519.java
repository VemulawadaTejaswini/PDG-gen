import java.util.*;
import java.math.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long H = sc.nextLong();
    long W = sc.nextLong();
    sc.close();

    long ans = (H * W + 1) / 2;
    System.out.println(ans);
  }
}
