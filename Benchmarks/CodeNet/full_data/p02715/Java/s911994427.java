import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    final long MOD = 1000000007;
    int nums[] = new int[k+1]; // 最大公約数がちょうどindexである個数
    long res = 0;
    for (int i = k; i >= 1; i--) {
      int num = (int)Math.pow(k/i, n); // 最大公約数がiの倍数である個数num
      for (int j = 2; j <= k/i; j++) { // 最大公約数がちょうど2i,3i,...である個数を除く
        num -= nums[i*j];
      }
      res += (long)i*(long)num;
      nums[i] = num;
    }
    res %= MOD;
    System.out.println(res);
    sc.close();
  }
}