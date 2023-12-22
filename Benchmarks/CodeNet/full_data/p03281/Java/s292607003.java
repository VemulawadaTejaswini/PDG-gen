import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int N = scanner.nextInt();
    int nfound = 0;

    for (int i = 1; i <= N; i += 2) {
      int n = 0;
      for (int j = 1; j <= i; j += 2) {
        if (i % j == 0) {
          n++;
        }
      }
      if (n == 8) {
        nfound++;
      }
    }
    System.out.println(nfound);
  }
}
