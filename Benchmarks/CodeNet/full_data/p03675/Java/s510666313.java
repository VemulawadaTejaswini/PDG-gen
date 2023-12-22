import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    Deque<Integer> dq = new Deque<Integer>();
    for(int i = 1; i <= n; i++) {
      int a = sc.nextInt();
      if((n - i) % 2 == 0) {
        dq.addFirst(a);
      } else {
        dq.addLast(a);
      }
    }
    for(int i = 0; i < n; i++) {
      System.out.println(dq.pollFirst());
    }
  }
}