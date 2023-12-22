import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    final Scanner scanner = new Scanner(System.in);
    final int n = scanner.nextInt();
    int c = 0;
    int[] pos = new int[2];
    for (int i = 0; i < n; i++) {
      int t = scanner.nextInt();
      int[] next = new int[2];
      next[0] = scanner.nextInt();
      next[1] = scanner.nextInt();
      int m = Math.abs(pos[0] - next[0]) + Math.abs(pos[1] - next[1]);
      int d = t - c;
      if (m > d || (d - m) % 2 == 1) {
        System.out.println("No");
        return;
      }
      c = t;
      pos = next;
    }
    System.out.println("Yes");
  }
}
