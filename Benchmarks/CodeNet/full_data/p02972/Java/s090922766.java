import java.util.*;
import java.util.stream.*;

public class Main {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int N = in.nextInt();
    int[] A = new int[N];
    for (int i = 0; i < N; i++) {
      A[i] = in.nextInt();
    }
    boolean[] box = new boolean[N];
    for (int i = N; i > 0; i--) {
      int cnt = 0, val = i * 2;
      while(val <= N) {
        if(box[val - 1]) {
          cnt++;
        }
        val += i;
      }
      if(val % 2 != A[i - 1]) {
        box[i - 1] = true;
      }
    }
    List<Integer> list = IntStream.range(0, N)
      .filter(val -> box[val])
      .mapToObj(val -> val + 1)
      .collect(Collectors.toList());
    System.out.println(list.size());
    if(list.size() > 0) {
      System.out.println(list.stream().map(String::valueOf).collect(Collectors.joining(" ")));
    }
  }
}