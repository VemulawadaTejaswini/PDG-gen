import java.util.Scanner;

public class Main {

  private static final String ZEROONE = "01";
  private static final String ONEZERO = "10";
  private static final String EMPTY = "";

  public static void main(String[] args) {
    // 入力
    try (Scanner sc = new Scanner(System.in);) {
      int sum = 0;
      String tmp = sc.nextLine();
      char before = 'p';
      for (int i = 0; i < tmp.length(); i++) {
        if (before == 'p') {
          before = tmp.charAt(i);
          continue;
        }
        if (before == '0' && tmp.charAt(i) == '1') {
          tmp = tmp.replaceFirst(ZEROONE, EMPTY);
          sum += 2;
          i = -1;
          before = 'p';
          continue;
        }
        if (before == '1' && tmp.charAt(i) == '0') {
          tmp = tmp.replaceFirst(ONEZERO, EMPTY);
          sum += 2;
          i = -1;
          before = 'p';
          continue;
        }
        before = tmp.charAt(i);
      }
      System.out.println(sum);
    }
  }
}