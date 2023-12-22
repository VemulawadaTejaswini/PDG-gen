import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    int K = sc.nextInt();
    ArrayList<String> list = new ArrayList<>();
    for (int i = 0; i < s.length(); i++) {
      for (int j = i + 1; j <= Math.min(s.length(), i + K); j++) {
        String tmp = s.substring(i, j);
        if (!list.contains(tmp)) {
          list.add(tmp);
        }
      }
    }
    Collections.sort(list);
    System.out.println(list.get(K - 1));
  }
}