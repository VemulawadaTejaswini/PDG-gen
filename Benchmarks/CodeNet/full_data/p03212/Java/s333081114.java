import java.util.Scanner;

public class Main {

  static int upLimit;
  static int count = 0;

  static void counter(String number, String add) {
    number += add;
    if (Long.parseLong(number) > upLimit) {
      return;
    }
    if (is753(number)) {
      count++;
    }
    counter(number, "3");
    counter(number, "5");
    counter(number, "7");
  }

  static boolean is753(String number) {
    boolean is7 = false, is5 = false, is3 = false;
    for (int i = 1; i < number.length(); i++) {
      if (number.charAt(i) == '7') {
        is7 = true;
      } else if (number.charAt(i) == '5') {
        is5 = true;
      } else if (number.charAt(i) == '3') {
        is3 = true;
      }
    }
    if (is7 && is5 && is3) {
      return true;
    } else {
      return false;
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    upLimit = sc.nextInt();
    counter("0", "3");
    counter("0", "5");
    counter("0", "7");
    System.out.println(count);
  }

}
