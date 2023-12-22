import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String a = sc.next();
    if (a.equals("SUT")) {
      System.out.println(1);
    } else if (a.equals("FRI")) {
      System.out.println(2);
    } else if (a.equals("THU")) {
      System.out.println(3);
    } else if (a.equals("WED")) {
      System.out.println(4);
    } else if (a.equals("TUE")) {
      System.out.println(5);
    } else if (a.equals("MON")) {
      System.out.println(6);
    } else {
      System.out.println(7);
    }
  }
}
