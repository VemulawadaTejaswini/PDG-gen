import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    char[] s = scanner.next().toCharArray();
    long[] M = {999_999_937, 1_000_000_007};
    long B = 9973;
    int left = 0;
    int right = N / 2 + 1;
    while (right - left > 1) {
      int mid = (left + right) / 2;
      if (possible(s, mid, N, B, M)) left = mid;
      else right = mid;
    }
    System.out.println(left);
  }

  private static boolean possible(char[] s, int K, int N, long B, long[] M) {
    long[] bn = new long[M.length];
    for (int i = 0; i < M.length; i++) {
      bn[i] = 1;
      for (int j = 0; j < K - 1; j++) {
        bn[i] *= B;
        bn[i] %= M[i];
      }
    }

    HashMap<Tuple, Integer> occurrences = new HashMap<>();
    long[] hash = new long[M.length];
    for (int i = 0; i < M.length; i++) {
      hash[i] = hash(s, K, B, M[i]);
    }
    occurrences.put(new Tuple(hash), 0);
    for (int i = 1; i <= N - K; i++) {
      for (int j = 0; j < M.length; j++) {
        hash[j] -= s[i - 1] * bn[j] % M[j];
        if (hash[j] < 0) hash[j] += M[j];
        hash[j] *= B;
        hash[j] %= M[j];
        hash[j] += s[i + K - 1];
        if (hash[j] >= M[j]) hash[j] -= M[j];
      }
      Tuple key = new Tuple(hash);
      if (occurrences.containsKey(key)) {
        if (occurrences.get(key) + K <= i) return true;
      }
      else occurrences.put(key, i);
    }
    return false;
  }

  private static long hash(char[] s, int len, long B, long M) {
    if (s.length < len) throw new IllegalArgumentException("len must be equal to or more than s.length: len=" + len + ", s.length=" + s.length);
    long hash = 0;
    for (int i = 0; i < len; i++) {
      hash *= B;
      hash %= M;
      hash += s[i];
      if (hash >= M) hash -= M;
    }
    return hash;
  }

  private static class Tuple {
    private final long[] elements;

    private Tuple(long[] elements) {
      this.elements = Arrays.copyOf(elements, elements.length);
    }

    @Override public boolean equals(Object o) {
      if (this == o) return true;
      if (o == null || getClass() != o.getClass()) return false;
      Tuple tuple = (Tuple) o;
      return Arrays.equals(elements, tuple.elements);
    }

    @Override public int hashCode() {
      return Arrays.hashCode(elements);
    }
  }
}
