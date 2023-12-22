import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in);) {
      String input = sc.next();

      int max = 0;
      int count = 0;
      for (int i = 0; i < input.length(); i++) {
        if ('A' == input.charAt(i) || 'T' == input.charAt(i) || 'G' == input.charAt(i) || 'C' == input.charAt(i)) {
          count++;
          max = Math.max(max, count);
        }else {
          count = 0;
        }
      }

      System.out.println(max);
    }
  }
}