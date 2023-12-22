import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    String s = sc.next();
    ArrayList<Integer> list = new ArrayList<Integer>();
    list.add(0);
    for(int i = 1; i < s.length(); i++) {
      if(s.charAt(i) != s.charAt(i - 1)) list.add(i);
    }
    int p = list.size();
    for(int i = 0; i < 2 * k + 1; i++) {
      list.add(n);
    }
    Collections.sort(list);
    int ans = 0;
    for(int i = 0; i < p; i++) {
      if(s.charAt(i) == '0') {
        ans = Math.max(ans, list.get(i + 2 * k) - list.get(i));
      } else {
        ans = Math.max(ans, list.get(i + 2 * k + 1) - list.get(i));
      }
    }
    System.out.println(ans);
  }
}