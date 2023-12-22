import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int N = scn.nextInt();
    int M = scn.nextInt();

    ArrayList<Integer> X = new ArrayList<>();
    for (int i = 0; i < M; i++) {
      X.add(scn.nextInt());
    }

    if (N >= M) {
      System.out.println(0);
    } else {

      Collections.sort(X);
      PriorityQueue<Integer> diffX = new PriorityQueue<>(new Comparator<Integer>() {
        public int compare(Integer n1, Integer n2) {
          return (n1 - n2 > 0) ? -1 : 1;
        }
      });

      for (int i = 0; i < M - 1; i++) {
        diffX.add(X.get(i + 1) - X.get(i));
      }
      int ans = X.get(X.size() - 1) - X.get(0);
      for (int i = 0; i < N - 1; i++) {
        ans -= diffX.poll();
      }

      System.out.println(ans);

    }
  }

}
