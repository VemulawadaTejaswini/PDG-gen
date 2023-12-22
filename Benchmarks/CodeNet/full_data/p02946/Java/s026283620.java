import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int K = scanner.nextInt();
    int X = scanner.nextInt();
    int left = Math.max(-1000000, X - K + 1);
    StringBuilder sb = new StringBuilder();
    for (int i = left; i < X + K && i <= 1000000; i++) sb.append(i).append(' ');
    sb.setLength(sb.length() - 1);
    System.out.println(sb.toString());
  }
}
