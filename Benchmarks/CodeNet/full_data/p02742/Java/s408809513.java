import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    long h = sc.nextLong();
    long w = sc.nextLong();

    long hNum;
    long ret;

    if (h % 2 == 0) {
      hNum = h / 2;
      ret = hNum * w;
      System.out.println(ret);
    } else if (h == 1) {
      if (w == 1) {
        System.out.println(1);
      } else if (w % 2 == 0) {
        System.out.println(w / 2);
      } else {
        System.out.println((w - 1) / 2 + 1);
      }
    } else {
      hNum = (h - 1) / 2 + 1;
      long wNum = w - 1;
      ret = (hNum * wNum / 2) + ((hNum - 1) * wNum / 2) + hNum;
      System.out.println(ret);
    }
  }
}
