import java.util.*;
// import java.util.stream.IntStream;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    try {
      int a = scanner.nextInt();
      int b = scanner.nextInt();
      int ans = solve(a,b);
      System.out.println(ans);
    } finally {
      scanner.close();
    }
  }
  
  private static int solve(int a, int b) {
    // 隣の塔との高さの差b-aを考える
    // 1番目と2番目の差は2、998番目と999番目の差は999なので
    // n-1番目とn番目の差はn
    // これがb-aになる
    int n = b - a;

    // 塔bの高さは、1 + 2 + ... + n
    int h = n * (n + 1) / 2;

    // 積雪の深さは、塔bの本当の高さから、雪の上に出ている高さを引いたもの
    return h - b;
  }
}
