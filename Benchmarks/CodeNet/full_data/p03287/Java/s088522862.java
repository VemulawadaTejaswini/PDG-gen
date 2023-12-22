import java.util.*;

public class Main {
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();
    Map<Integer, Integer> map = new HashMap<>();
    int prevSumMod = 0;
    for (int i = 1; i <= N; i++) {
      int A = sc.nextInt();
      int sumMod = (A+prevSumMod)%M;
      map.put(sumMod, map.getOrDefault(sumMod, 0)+1);
      prevSumMod = sumMod;
    }
    
    long ans = 0;
    for (Map.Entry<Integer, Integer> ent : map.entrySet()) {
      int k = ent.getKey();
      int v = ent.getValue();
      if (k == 0 || v > 1) {
        ans += (long)v*(v+1)/2 - (k != 0 ? v : 0);
      }
    }
    
    System.out.println(ans);
  }
}
