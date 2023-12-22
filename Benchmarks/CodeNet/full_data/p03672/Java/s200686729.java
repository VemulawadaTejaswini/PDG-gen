import java.util.Scanner;


public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String input = sc.next();

    input = input.substring(0, input.length() - 1);
    while (!isEvenStr(input)) {
      input = input.substring(0, input.length() - 1);
    }
    System.out.println(input.length());
  }

  static boolean isEvenStr(String target) {

    if (target.length() % 2 != 0) {
      return false;
    }
    return target.substring(0, target.length() / 2)
        .equals(target.substring(target.length() / 2));
  }
}
