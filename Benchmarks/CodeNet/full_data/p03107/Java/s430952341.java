import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    // 入力
    try (Scanner sc = new Scanner(System.in);) {
      int sum = 0;
      String line = sc.nextLine();
      StringBuilder tmp = new StringBuilder(line);
      char before = 'p';
      for (int i = 0; i < tmp.length(); i++) {
        if (before == 'p') {
          before = tmp.charAt(i);
          continue;
        }
        if (before == '0' && tmp.charAt(i) == '1') {
          tmp.delete(i-1, i+1);
          sum += 2;
          i = -1;
          before = 'p';
          continue;
        }
        if (before == '1' && tmp.charAt(i) == '0') {
          tmp.delete(i-1, i+1);
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