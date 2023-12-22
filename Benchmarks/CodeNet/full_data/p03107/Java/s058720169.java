import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    // 入力
    try (Scanner sc = new Scanner(System.in);) {
      String line = sc.nextLine();

      int sum = 0;

      StringBuilder tmp = new StringBuilder(line);
      while (true) {
        int zeroone = tmp.indexOf("01");
        int onezero = tmp.indexOf("10");
        if (0 <= zeroone && (onezero < 0 || zeroone < onezero)) {
          tmp.delete(zeroone, zeroone+2);
          sum += 2;
          continue;
        }
        if (0 <= onezero && (zeroone < 0 || onezero < zeroone)) {
          tmp.delete(onezero, onezero+2);
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