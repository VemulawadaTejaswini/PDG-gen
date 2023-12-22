import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    char[] S = scanner.next().toCharArray();
    int c0 = 0;
    int c1 = 0;
    for (char c : S) {
      if (c == '0') c0++;
      else c1++;
    }
    System.out.println(Math.min(c0, c1) * 2);
  }
}
