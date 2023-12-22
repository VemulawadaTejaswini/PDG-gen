
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    // TODO 自動生成されたメソッド・スタブ
    Scanner scanner = new Scanner(System.in);
    long remainOfTakahashisCookie = scanner.nextLong();
    long remainOfAokisCookie = scanner.nextLong();
    long iterator = scanner.nextLong();
    if (iterator >= remainOfTakahashisCookie) {
      iterator = iterator - remainOfTakahashisCookie;

      remainOfTakahashisCookie = 0;
      remainOfAokisCookie -= iterator;
    } else {
      remainOfTakahashisCookie -= iterator;
    }

    System.out.println(remainOfTakahashisCookie + " " + remainOfAokisCookie);
  }

}
