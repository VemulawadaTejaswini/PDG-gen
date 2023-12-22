import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();
    int[] P = new int[M];
    int[] Y = new int[M];
    HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
    for (int i = 0; i < M; i++) {
      P[i] = sc.nextInt();
      Y[i] = sc.nextInt();
      if (map.get(P[i]) == null) {
        map.put(P[i], new ArrayList<>());
      }
      map.get(P[i]).add(Y[i]);
    }
    for (int i = 0; i < M; i++) {
      Collections.sort(map.get(P[i])); // 昇順にソート
      System.out.println(String.format("%06d", P[i]) + String.format("%06d", map.get(P[i]).indexOf(Y[i]) + 1));
    }
  }
}