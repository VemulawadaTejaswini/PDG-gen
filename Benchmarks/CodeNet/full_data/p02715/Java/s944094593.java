import java.util.Scanner;

public class Main {

  static final long MOD = 1_000_000_007;

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    long answer = 0;
    long[] array = new long[k + 1];
    for (int i = k; i >= 1; i--) {
      array[i] = myPow((long) k / i, n);
      for(int i2 = i * 2; i2 <= k; i2 += i){
        array[i] = (array[i] - array[i2]) % MOD;
      }
    }
    for (int i = 1; i <= k; i++) {
      long add = (array[i] * (long) i ) % MOD;
      answer = (answer + add) % MOD;
    }
    System.out.println(answer);
  }

  static long myPow(long x, int n) {
    long answer = 1l;
    while (n > 0) {
      if ((n & 1) == 1) {
        answer = answer * x % MOD;
      }
      x = x * x % MOD;
      n >>= 1;
    }
    return answer;
  }
}