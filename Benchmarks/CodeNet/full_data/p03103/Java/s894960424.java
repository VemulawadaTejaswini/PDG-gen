import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    Map<Long,Long> map = new TreeMap<>();
    for (int i = 0; i < n; i++) {
      map.put(sc.nextLong(), sc.nextLong());
    }
    long ans = 0;
    int p = m;
    for(Map.Entry<Long, Long> entry : map.entrySet()) {
      p -= entry.getValue();
      if (p < 0) {
        ans += entry.getKey() * (entry.getValue() - (p * -1));
        break;
      }
      ans += entry.getKey() * entry.getValue();
    }
    System.out.println(ans);
  }
}