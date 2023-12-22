import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    int left = 0;
    int right = N - 1;
    System.out.println(0);
    char t1 = scanner.next().charAt(0);
    if (t1 == 'V') return;
    System.out.println(N - 1);
    char t2 = scanner.next().charAt(0);
    if (t2 == 'V') return;
    while (right - left > 2) {
      int mid = (right + left) / 2;
      System.out.println(mid);
      char r = scanner.next().charAt(0);
      if (r == 'V') return;
      if ((mid % 2 == 0 && r == t1) || (mid % 2 == 1 && r == t2)) {
        left = mid;
      } else {
        right = mid;
      }
    }
  }
}
