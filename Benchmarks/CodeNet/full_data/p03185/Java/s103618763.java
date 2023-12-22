import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    long C = scanner.nextLong();
    long[] h = new long[N];
    for (int i = 0; i < N; i++) h[i] = scanner.nextInt();

    long[] dp = new long[N + 1];
    MyDeque<Line> deque = new MyDeque<>();

    for (int i = 1; i <= N; i++) {
      long hi = h[i - 1];
      while (deque.size() > 1 && deque.getLast(1).y(hi) < deque.getLast().y(hi)) {
        deque.removeLast();
      }
      if (!deque.isEmpty()) dp[i] = deque.getLast().y(hi) + hi * hi + C;
      Line line = new Line(-2 * hi, hi * hi + dp[i]);
      while (deque.size() > 1
          && (deque.getFirst().a - deque.getFirst(1).a) * (line.b - deque.getFirst().b)
          > (line.a - deque.getFirst().a) * (deque.getFirst().b - deque.getFirst(1).b)) {
        deque.removeFirst();
      }
      deque.addFirst(line);
    }

    System.out.println(dp[N]);
  }

  private static class MyDeque<T> {
    private Deque<T> deque = new LinkedList<>();

    public void addFirst(T t) {
      deque.addFirst(t);
    }

    public void addLast(T t) {
      deque.addLast(t);
    }

    public T removeFirst() {
      return deque.removeFirst();
    }

    public T removeLast() {
      return deque.removeLast();
    }

    public T getFirst() {
      return deque.getFirst();
    }

    public T getLast() {
      return deque.getLast();
    }

    public T getFirst(int i) {
      Iterator<T> iter = deque.iterator();
      T ret = null;
      while (i >= 0) {
        if (!iter.hasNext()) throw new NoSuchElementException("No element at " + i + ", size=" + deque.size());
        ret = iter.next();
        i--;
      }
      return ret;
    }

    public T getLast(int i) {
      Iterator<T> iter = deque.descendingIterator();
      T ret = null;
      while (i >= 0) {
        if (!iter.hasNext()) throw new NoSuchElementException("No element at " + i + ", size=" + deque.size());
        ret = iter.next();
        i--;
      }
      return ret;
    }

    public int size() {
      return deque.size();
    }

    public boolean isEmpty() {
      return deque.isEmpty();
    }
  }

  private static class Line {
    public final long a;
    public final long b;

    private Line(long a, long b) {
      this.a = a;
      this.b = b;
    }

    public long y(long x) {
      return x * a + b;
    }
  }
}
