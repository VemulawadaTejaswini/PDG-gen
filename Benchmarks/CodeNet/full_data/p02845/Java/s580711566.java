import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    long M = 1_000_000_007;
    int N = scanner.nextInt();
    int[] A = new int[N];
    for (int i = 0; i < N; i++) A[i] = scanner.nextInt();
    Map<Integer, Integer> freq = new HashMap<>();
    long res = 1;
    int countZeros = 0;
    for (int i = 0; i < N; i++) {
      if (A[i] != 0) {
        int p = freq.get(A[i] - 1);
        res *= p;
        res %= M;
        freq.put(A[i] - 1, p - 1);
      } else {
        countZeros++;
      }
      freq.put(A[i], freq.getOrDefault(A[i], 0) + 1);
    }
    if (countZeros > 1) {
      System.out.println(res * 6 % M);
    } else {
      System.out.println(res * 3 % M);
    }
  }
}
