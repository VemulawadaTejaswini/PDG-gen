import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    // TODO 自動生成されたメソッド・スタブ
    Scanner scanner = new Scanner(System.in);
    int w = scanner.nextInt();
    int h = scanner.nextInt();
    int x = scanner.nextInt();
    int y = scanner.nextInt();

    // xで割るとき
    // h * xと、h*w-x
    // h*x
    double o1 = h * x;
    double o2 = h * (w - x);

    double min_1 = o1;
    if (o2 < o1) {
      min_1 = o2;
    }

    // yで割るとき
    // w * xと w-y * x
    double p1 = w * y;
    double p2 = w * (h - y);

    double min_2 = p1;
    if (p2 < p1) {
      min_2 = p2;
    }

    if (min_1 == min_2) {
      System.out.println(min_1 + " 1");
    } else if (min_1 < min_2) {
      System.out.println(min_2 + " 0");
    } else {
      System.out.println(min_1 + " 0");
    }


  }

}