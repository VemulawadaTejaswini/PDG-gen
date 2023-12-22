
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    // TODO 自動生成されたメソッド・スタブ

    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    int len = s.length();

    while (s.indexOf("10") != -1) {
      s = s.replaceAll("10", "");
    }

    while (s.indexOf("01") != -1) {
      s = s.replaceAll("01", "");
    }

    System.out.println(len - s.length());
  }
}
