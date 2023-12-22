/**
 * Created at 1:14 on 2019/03/06
 */

import java.util.*;

public class Main {

  static Scanner sc = new Scanner(System.in);

  static int N;

  public static void main(String[] args) {

    int n = sc.nextInt();
    N = n/2;

    ArrayList<Integer> a = new ArrayList(N);
    ArrayList<Integer> b = new ArrayList(N);

    for (int i=0; i<N; i++) {
      a.add(sc.nextInt());
      b.add(sc.nextInt());
    }

    ArrayList<Pair> rankingA = getRanking(a); //[0] 個数 [1] 数値
    ArrayList<Pair> rankingB = getRanking(b);

    if (rankingA.get(0).val != rankingB.get(0).val) {
      System.out.println(2 * N - rankingA.get(0).frequency - rankingB.get(0).frequency);
    } else {
      System.out.println(2 * N - Math.max(
              rankingA.get(0).frequency + rankingB.get(1).frequency,
              rankingA.get(1).frequency + rankingB.get(0).frequency
      ));
    }

  }

  static ArrayList<Pair> getRanking(ArrayList<Integer> list) {
    ArrayList<Pair> ranking = new ArrayList();

    list.sort(null);

    for (int i=0; i<N;) {
      for (int j=i+1; j<=N; j++) {
        if (j == N || list.get(j) != list.get(i)) {
          ranking.add(new Pair(j-i, list.get(i)));
          i = j;
          break;
        }
      }
    }

    ranking.sort((x, y) -> y.frequency-x.frequency);

    if (ranking.size() == 1) {
      ranking.add(new Pair(0, -1));
    }

    return ranking;
  }

  static class Pair {
    int frequency, val;
    Pair(int frequency, int val) {
      this.frequency = frequency;
      this.val = val;
    }
  }

}
