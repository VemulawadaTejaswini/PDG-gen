import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new java.util.Scanner(System.in);
    int N = Integer.parseInt(sc.nextLine());
    String[] sn = sc.nextLine().split(" ");
    Map<Integer, Integer> n = new HashMap<>();
    for (int i = 0; i < sn.length; i++) {
      n.put(Integer.parseInt(sn[i]), i);
    }
    if (n.size() == N) {
      System.out.println("YES");
    } else {
      System.out.println("NO");
    }
  }
}
