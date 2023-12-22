import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int N = scanner.nextInt();
    int count = 0;
    for (int i = 0; i * 2 + 1 <= N; i++) {
      int n = i * 2 + 1;
      int num = 0;
      while (n > 0) {
        int a = find(n);
        if (a == n) break;
        num++;
        n /= a;
      }
      if (num == 3) count++;
    }
    System.out.println(count);
  }

  private static int find(int a){
    for (int j = 3; j < a; j += 2) {
      if (a % j == 0) {
        return j;
      }
    }
    return a;
  }
}
