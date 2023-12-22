import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    String s = sc.next();
    int gap = Integer.MAX_VALUE;

    for (int i = 0; i < (s.length() - 2); i++) {
      String t = s.substring(i, i + 3);
      int a = Integer.parseInt(t);
      if (Math.abs(753 - a) < gap) {
        gap = Math.abs(753 - a);
      }
    }

    System.out.println(gap);

  }
}