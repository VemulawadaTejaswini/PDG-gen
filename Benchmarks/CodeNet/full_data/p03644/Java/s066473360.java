import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    int cnt = 0;
    int r = 2;
    while (r <= N) {
      cnt++;
      r *= 2;
    }
    System.out.println(cnt);
  }
}
