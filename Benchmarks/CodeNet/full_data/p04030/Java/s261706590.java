import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String S = sc.next();

    char[] array = S.toCharArray();
    System.out.println(resolve(array));
  }

  private static String resolve(char[] array) {
    StringBuilder sb = new StringBuilder();
    for (char c : array) {
      if (c != 'B') {
        sb.append(c);
      } else if (sb.length() != 0) {
        sb.deleteCharAt(sb.length() - 1);
      }
    }

    return sb.toString();
  }
}
