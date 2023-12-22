import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    // 入力
    try (Scanner sc = new Scanner(System.in);) {
      String line = sc.nextLine();
      String tmp = line;
      int zero = 0;
      int one = 0;
      for (int i = 0; i < tmp.length(); i++) {
        if(tmp.charAt(i) == '0') {
          zero++;
        }
        if(tmp.charAt(i) == '1') {
          one++;
        }
      }
      System.out.println(2 * Math.min(zero, one));
    }
  }
}