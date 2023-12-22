import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    String word = scanner.next();

    // wordの","を" "に置き換えた文字列を出力する
    System.out.println(word.replaceAll(",", " "));
  }
}