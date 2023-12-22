import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int N = scan.nextInt();
    int K = scan.nextInt();
    boolean D[] = new boolean[10];
    for (int i = 0; i < K; i++) {
      D[scan.nextInt()] = true;
    }

    while (true) {
      boolean flug = true;
      for (int i = 0; i < 4; i++) {
        int num = N % (int)Math.pow(10, i + 1) / (int)Math.pow(10, i);
        if (D[num]) {
          flug = false;
          break;
        }
      }
      if (flug) break;
      N++;
    }
    System.out.println(N);
  }
}
