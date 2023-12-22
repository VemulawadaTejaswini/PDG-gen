import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    int K = sc.nextInt();
    HashSet<String> S = new HashSet<>();
    for (int i = 0; i < s.length(); i++) {
      for (int j = i + 1; j <= s.length(); j++) {
        S.add(s.substring(i, j));
      }
    }
    ArrayList<String> T = new ArrayList<>(S);
    Collections.sort(T);
    System.out.println(T.get(K - 1));
  }
}
