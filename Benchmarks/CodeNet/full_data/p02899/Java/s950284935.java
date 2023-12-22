import java.util.Scanner;
import java.util.HashMap;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long N = sc.nextLong();
    HashMap<Integer, Long> list = new HashMap<Integer, Long>();
    for (long i = 0; i < N; i++) {
      list.put(sc.nextInt(), i + 1);
    }
    Object[] mapkey = list.keySet().toArray();
    Arrays.sort(mapkey);
    StringBuilder ans = new StringBuilder();
    for (Integer key : list.keySet()) {
      ans.append(list.get(key));
      ans.append(" ");

    }
    System.out.println(ans);
  }
}
