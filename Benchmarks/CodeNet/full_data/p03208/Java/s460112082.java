import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int N = scn.nextInt();
    int K = scn.nextInt();

    ArrayList<Integer> h = new ArrayList<>();
    for (int i = 0; i < N; i++) {
      h.add(scn.nextInt());
    }

    Collections.sort(h, new Comparator<Integer>() {
      public int compare(Integer d1, Integer d2) {
        return (d1 - d2 < 0) ? 1 : -1;
      }
    });

    int minDiff = Integer.MAX_VALUE;
    for (int i = 0; i < N - K + 1; i++) {
      minDiff = Math.min(minDiff, h.get(i) - h.get(i + K - 1));

    }

    System.out.println(minDiff);

  }

}
