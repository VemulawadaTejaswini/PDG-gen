import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    int L = scanner.nextInt();
    int m;
    if (L >= 0) m = L;
    else if (L + N <= 0) m = L + N - 1;
    else m = 0;
    System.out.println((L + L + N - 1) * N / 2 - m);
  }
}
