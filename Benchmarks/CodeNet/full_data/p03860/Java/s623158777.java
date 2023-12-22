import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // "Atcoder"は固定なので捨て
    scanner.next();

    // 二単語目の頭文字を取得
    char head = scanner.next().charAt(0);

    // "A" + head + "C" を出力
    System.out.println("A" + head + "C");
  }
}
