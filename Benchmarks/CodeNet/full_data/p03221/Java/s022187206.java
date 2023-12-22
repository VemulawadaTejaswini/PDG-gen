import java.util.*;

public class Main {

  public static class City {
    int P;
    int Y;
    int index;

    public City(int P, int Y, int index) {
      this.P = P;
      this.Y = Y;
      this.index = index;
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = Integer.parseInt(sc.next());
    int M = Integer.parseInt(sc.next());
    int[] P = new int[M];
    int[] Y = new int[M];
    long[] ID = new long[M];
    City[] city = new City[M];
    for (int i = 0; i < M; i++) {
      P[i] = Integer.parseInt(sc.next());
      Y[i] = Integer.parseInt(sc.next());
      city[i] = new City(P[i], Y[i], i);
    }
    Arrays.sort(city, (a, b) -> a.P == b.P ? a.Y - b.Y : a.P - b.P);
    int before = city[0].P;
    int order = 1;
    for (int i = 0; i < M; i++) {
      int now = city[i].P;
      if (before != now) {
        before = now;
        order = 1;
      }
      ID[city[i].index] = order;
      order++;
    }
    for (int i = 0; i < M; i++) {
      System.out.println(String.format("%06d", P[i]) + String.format("%06d", ID[i]));
    }
  }
}
