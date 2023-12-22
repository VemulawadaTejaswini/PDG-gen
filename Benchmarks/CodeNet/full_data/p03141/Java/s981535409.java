import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    Pair[] pairs1 = new Pair[n];
    Pair[] pairs2 = new Pair[n];
    Map<Pair, Integer> map = new HashMap<>();
    for (int i = 0; i < n; i++) {
      int a = sc.nextInt();
      int b = sc.nextInt();
      Pair p = new Pair(a, b);
      pairs1[i] = p;
      pairs2[i] = p;
      int current = map.getOrDefault(p, 0);
      map.put(p, current + 1);
    }
    Arrays.sort(pairs1, (o1, o2) -> o2.c - o1.c);
    Arrays.sort(pairs2, (o1, o2) -> o2.c - o1.c);
    int pairs1Index = 0;
    int pairs2Index = 0;
    long total1 = 0;
    long total2 = 0;
    boolean isTurnList1 = true;
    for (int i = 0; i < n; i++) {
      if (isTurnList1) {
        for (;;) {
          Pair pair = pairs1[pairs1Index];
          pairs1Index += 1;
          int current = map.get(pair);
          if (current <= 0) continue;
          map.put(pair, current - 1);
          total1 += (long) pair.a;
          break;
        }
      } else {
        for (;;) {
          Pair pair = pairs2[pairs2Index];
          pairs2Index += 1;
          int current = map.get(pair);
          if (current <= 0) continue;
          map.put(pair, current - 1);
          total2 += (long) pair.b;
          break;
        }
      }
      isTurnList1 = !isTurnList1;
    }
    System.out.println(total1 - total2);
  }

  private static class Pair {
    private final int a;
    private final int b;
    private final int c;

    private Pair(int a, int b) {
      this.a = a;
      this.b = b;
      this.c = a + b;
    }

    @Override
    public boolean equals(Object o) {
      if (this == o) return true;
      if (o == null || getClass() != o.getClass()) return false;
      Pair pair = (Pair) o;
      return a == pair.a &&
              b == pair.b;
    }

    @Override
    public int hashCode() {
      return Objects.hash(a, b);
    }
  }
}