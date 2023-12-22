import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long h = sc.nextLong();
    long w = sc.nextLong();
    long num;
    if (h % 2 != 0 && w % 2 != 0) {
      num = h * w / 2 + 1;
    } else {
      num = h * w / 2;
    }
    System.out.println(num);
  }
}
