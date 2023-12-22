import java.util.*;
import java.util.stream.Collectors;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int K = sc.nextInt();
    int min = Integer.MAX_VALUE;
    ArrayList<Integer> list = new ArrayList();
    for (int i = 0; i < N; i++) {
      list.add(sc.nextInt());
    }
    Collections.sort(list);
    for (int i = 0; i <= N - K; i++) {
      int minTree = list.get(i);
      int maxTree = list.get(i + K - 1);
      min = Math.abs(minTree - maxTree);
    }
    System.out.println(min);
  }
}
