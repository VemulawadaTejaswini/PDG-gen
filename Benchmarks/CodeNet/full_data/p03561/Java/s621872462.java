import java.util.Scanner;
import java.math.BigInteger;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int K = sc.nextInt();
    int N = sc.nextInt();
    BigInteger[] ways = new BigInteger[N + 1];
    ways[0] = BigInteger.ONE;
    BigInteger pw = BigInteger.ONE;
    BigInteger bk = new BigInteger(new Integer(K).toString());
    for (int i = 1; i <= N; i++) {
      pw = pw.multiply(bk);
      ways[i] = ways[i - 1].add(pw);
    }
    BigInteger kth = ways[N].shiftRight(1);
    int L = N;
    int[] ans = new int[N];
    int sz = 0;
    while (!kth.equals(BigInteger.ZERO)) {
      kth = kth.subtract(BigInteger.ONE);
      BigInteger x = kth.divide(ways[L - 1]);
      ans[sz++] = x.intValue();
      kth = kth.subtract(ways[L - 1].multiply(x));
      --L;
    }
    for (int i = 0; i < sz; i++) {
      System.out.print(ans[i] + 1);
      System.out.print(" ");
    }
    System.out.println("");
  }
}
