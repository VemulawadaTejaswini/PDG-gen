import java.util.Scanner;

public class Main {
  static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    int N = sc.nextInt();
    int count = 0;
    for (int i = 0; i < N; i++) {
      count += sc.nextInt() % 2;
    }
    System.out.println(count % 2 == 0 ? "YES" : "NO");
  }

}
