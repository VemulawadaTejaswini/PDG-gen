import java.util.*;
public class Main {
  public static void main(String...args) {
    final Scanner sc = new Scanner(System.in);
    final int N = sc.nextInt();
    final PriorityQueue<Integer> a = new PriorityQueue<>();
    for(int i = 0; i < N; i++)
      a.offer(sc.nextInt());
    final PriorityQueue<Integer> b = new PriorityQueue<>();
    for(int i = 0; i < N; i++)
      b.offer(sc.nextInt());
    for(int i = 0; !a.isEmpty() && i < 2 * N; i++)
      if(a.peek() <= b.peek()) {
        a.poll();
        b.poll();
      }else{
        if(a.size() > 1) {
          final int aa = a.poll();
          final int bb = b.poll();
          final int k = (a.peek() - aa) / 2 + 1;
          a.offer(aa + 2 * k);
          b.offer(bb + k);
        }
      }
    System.out.println(a.isEmpty() ? "Yes" : "No");
  }
}