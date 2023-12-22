import java.util.*;
public class Main {

  public static void main(String[] args) { 
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int k = sc.nextInt();
      int r = sc.nextInt();
      int s = sc.nextInt();
      int p = sc.nextInt();
      String t = sc.next();
      char[] chs = t.toCharArray();

      Map<Character, Long> freq = new HashMap<>();
      freq.put('r', 0L);
      freq.put('s', 0L);
      freq.put('p', 0L);
      for(int i = 0; i < chs.length; i++) {
        if(i >= k) {
          if(chs[i] == chs[i-k]) {
            chs[i] = '-';
            continue;
          }
        }
        freq.put(chs[i], freq.get(chs[i]) + 1);
      }
      System.out.println(p * freq.get('r') + r * freq.get('s') + s * freq.get('p'));
  }
}