import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    Set<Character> set = new HashSet<>();
    for (int i = 0; i < N; i++) {
      set.add(sc.next().charAt(0));
    }
    System.out.println(set.size() == 4 ? "Four" : "Three");
  }
}