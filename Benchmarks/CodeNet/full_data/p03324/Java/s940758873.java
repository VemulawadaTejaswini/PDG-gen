import java.util.*;
// import java.util.stream.IntStream;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    try {
      int d = scanner.nextInt();
      int n = scanner.nextInt();
      int ans = solve(d, n);
      System.out.println(ans);
    } finally {
      scanner.close();
    }
  }
  
  private static int solve(int d, int n) {
    // n = 100がコーナーケース（罠）
    // d = 0の時を考える。ちょうど0回割り切れる＝割り切れないだが、
    // 100で割り切れない100番目に小さい数は101
    if (n == 100) n++;
    for (int i = 0; i < d; i++) n *= 100;
    return n;
  }
}
