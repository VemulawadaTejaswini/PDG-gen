import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int h = sc.nextInt();
    int w = sc.nextInt();

    int hNum;

    // 1列あたりの移動可能マス数
    if (h % 2 == 0) {
      hNum = h / 2;
      System.out.println(hNum * w);
    } else if (h == 1) {
      hNum = 1;
      System.out.println(hNum * w);
    } else {
      hNum = (h - 1) / 2 + 1;
      int wNum = w - 1;
      System.out.println((hNum * wNum / 2) + ((hNum - 1) * wNum / 2) + hNum);
    }
  }
}
