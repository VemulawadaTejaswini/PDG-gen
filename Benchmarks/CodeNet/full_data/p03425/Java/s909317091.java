import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    Map<Character, Integer> map = new HashMap<>();
    for (int i = 0; i < N; i++) {
      String s = sc.next();
      char c = s.charAt(0);
      if (c == 'M' || c == 'A' || c == 'R' || c == 'C' || c == 'H') {
        map.put(c, map.getOrDefault(c, 0)+1);
      }
    }

    int n = map.size();
    if (n < 3) {
      System.out.println(0);
      return;
    }
    
    int[] count = new int[n];
    int idx = 0;
    for (int value : map.values()) {
      count[idx++] = value;
    }
    
    long ans = 0;
    int p = 1 << n;
    for (int i = 0; i < p; i++) {
      ans += calc(count, i);
    }
    
    System.out.println(ans);
  }
  
  private static long calc(int[] count, int i) {
    long mul = 1;
    int shift = 0;
    int bit = 0;
    while (i != 0) {
      if (i % 2 == 1) {
        bit++;
        mul *= count[shift];
      }
      i /= 2;
      shift++;
    }
    return bit == 3 ? mul : 0;
  }
}