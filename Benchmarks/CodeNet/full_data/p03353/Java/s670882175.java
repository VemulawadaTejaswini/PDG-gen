import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    int K = sc.nextInt();
    
    Set<String> set = new HashSet<>();
    for (int i = 0; i < s.length(); i++) {
      for (int j = i; j < s.length() && i - j + 1 <= K; j++) {
        set.add(s.substring(i, j+1));
      }
    }
    List<String> list = new ArrayList<>(set);
    Collections.sort(list);
    System.out.println(list.get(K-1));
  }
}