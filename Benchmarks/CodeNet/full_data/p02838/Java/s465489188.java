import java.util.*;
import java.util.function.*;
public class Main {
  public static void main(String[] args) {
    long mod = (long)Math.pow(10,9) + 7;
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    long[] A = new long[N];
    for (int i = 0; i < N; i++) {
      A[i] = sc.nextLong();
    }
    long ans = 0;
    for (int i = 0; i < 60; i++) {
        long cnt = 0;
        for (int j = 0; j < N; j++){
            if (((A[j] >>> i) & 1) == 1){
                cnt++; // 1の物をカウント
            }
        }
        long a = (cnt * (N - cnt)) % mod; //0の数*1の数=合計カウント数
        for (int j = 0; j < i; j++){
            a = (a << 1) % mod; //桁を繰り上げて元に戻す
        }
        ans += a;
        ans %= mod;
    }
    System.out.println(ans);
  }
}