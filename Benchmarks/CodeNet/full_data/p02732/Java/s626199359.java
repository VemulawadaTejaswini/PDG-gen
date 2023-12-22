import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] A = new int[N];
    HashMap<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < N; i++) {
      A[i] = sc.nextInt();
      map.put(A[i], map.getOrDefault(A[i], 0) + 1);
    }
    for (int i = 0; i < N; i++) {
      long sum = 0;
      for (Map.Entry<Integer, Integer> e : map.entrySet()) {
        int key = e.getKey(), val = e.getValue();
        if (key == A[i]) {
          val--;
        }
        if (val >= 1) {
          sum += val * (val - 1) / 2;
        }
      }
      System.out.println(sum);
    }
  }
}
