import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int N = scan.nextInt();
    int M = scan.nextInt();
    int min = scan.nextInt();
    int max = scan.nextInt();
    for (int i = 1; i < M; i++) {
      int l = scan.nextInt();
      int r = scan.nextInt();
      if (l > min) {
        min = l;
      }
      if (r < max) {
        max = r;
      }
    }
    int result = max - min + 1;
    System.out.println(result > 0 ? result : 0);
  }
}
