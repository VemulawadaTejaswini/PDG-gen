import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Map<Integer, Integer> map = new HashMap<>();
    int N = sc.nextInt();
    for (int i= 0; i < N; i++) {
      int D = sc.nextInt();
      map.put(D, map.getOrDefault(D, 0)+1);
    }
    
    boolean ans = true;
    int M = sc.nextInt();
    for (int i = 0; i < M; i++) {
      int T = sc.nextInt();
      if (map.getOrDefault(T, 0) == 0) {
        ans = false;
        break;
      }
      map.put(T, map.get(T)-1);
    }
    
    System.out.println(ans ? "YES" : "NO");
  }
}