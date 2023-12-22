import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int Q = sc.nextInt();
    Map<Integer, Integer> map = new HashMap<Integer, Integer>();
    int parent;
    for(int i = 0; i < N - 1; i++) {
      parent = sc.nextInt() - 1;
      map.put(sc.nextInt() - 1, parent);
    }
    int[] ans = new int[N];
    for(int i = 0; i < Q; i++)
      ans[sc.nextInt() - 1] += sc.nextInt();
    for(int i = 1; i < N; i++)
      ans[i] += ans[map.get(i)];
    System.out.println(Arrays.stream(ans).boxed().map(v -> String.valueOf(v)).collect(Collectors.joining(" ")));
  }
}
