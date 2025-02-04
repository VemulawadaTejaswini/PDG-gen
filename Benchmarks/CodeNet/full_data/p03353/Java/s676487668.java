import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    int K = sc.nextInt();
    TreeSet<String> words = new TreeSet<String>();
    for (int i = 0; i < s.length(); i++) {
      for (int j = 1; i + j <= s.length(); j++) {
        words.add(s.substring(i, i + j));
      }
    }
    String[] ans = new String[words.size()];
    int i = 0;
    for (String word : words) {
      if (i > K - 1) break;
      ans[i] = word;
       i++;
    }
    System.out.println(ans[K - 1]);
  }
}