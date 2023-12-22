import java.util.Scanner;
import java.util.HashMap;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long N = sc.nextLong();
    HashMap<Long, Long> list = new HashMap<Long, Long>();
    for (long i = 0; i < N; i++) {
      list.put(sc.nextLong(), i + 1);
    }
    Object[] mapkey = list.keySet().toArray();
    Arrays.sort(mapkey);
    StringBuilder ans = new StringBuilder();
    for (long key : list.keySet()) {
      ans.append(list.get(key));
      ans.append(" ");

    }
    System.out.println(ans);
  }
}
