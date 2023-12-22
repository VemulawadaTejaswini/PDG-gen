import java.util.*;
import java.util.stream.Collectors;
import java.util.ArrayDeque;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long N = sc.nextLong();
    ArrayDeque<Long> list = new ArrayDeque<Long>();
    if (N % 2 != 0) {
      for (long i = 1; i <= N; i++) {
        if (i % 2 != 0) {
          list.addFirst(sc.nextLong());
        } else {
          list.addLast(sc.nextLong());
        }
      }
    } else {
      for (long i = 1; i <= N; i++) {
        if (i % 2 != 0) {
          list.addLast(sc.nextLong());
        } else {
          list.addFirst(sc.nextLong());
        }
      }
    }
    System.out.println(list);
  }
}
