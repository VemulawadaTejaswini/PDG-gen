import java.util.*;

public class Main {

  public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);
    long N = sc.nextLong();
    sc.close();

    Deque<Long> v = divisor(N);

    int l = v.size();
    if (l % 2 == 0) {
      System.out.println(v.pollLast() + v.pollLast() - 2);
    } else {
      System.out.println(v.pollLast() * 2 - 2);
    }

  }

  static Deque<Long> divisor (long N) {
    Deque<Long> res = new ArrayDeque<>();
    for (long i = 1; i * i <= N; i++) {
      if (N % i == 0) {
        res.add(i);
        if (i != N / i) {
          res.add(N / i);
        }
      }
    }
    return res;
  }

}