import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    // 入力
    try (Scanner sc = new Scanner(System.in);) {
      String line = sc.nextLine();



      int sum = 0;

      String tmp = line;
      while (true) {
        int zeroone = tmp.indexOf("01");
        int onezero = tmp.indexOf("10");
        if (0 <= zeroone && (onezero < 0 || zeroone < onezero)) {
          tmp = tmp.replaceFirst("01", "");
          sum += 2;
          continue;
        }
        if (0 <= onezero && (zeroone < 0 || onezero < zeroone)) {
          tmp = tmp.replaceFirst("10", "");
          sum += 2;
        }
        if(zeroone < 0 && onezero < 0) {
          break;
        }
      }
      System.out.println(sum);
    }
  }
}