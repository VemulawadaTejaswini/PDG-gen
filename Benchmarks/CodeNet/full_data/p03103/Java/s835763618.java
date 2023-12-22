import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
  static class Data {
    public final long price;
    public final int count;

    public Data(long price, int count) {
      this.price = price;
      this.count = count;
    }
  }

  public static void main(String... args) {

    try (Scanner sc = new Scanner(System.in)) {
      int N = sc.nextInt();
      int M = sc.nextInt();
      List<Data> list = new ArrayList<>();
      for (int i = 0; i < N; ++i) {
        list.add(new Data(sc.nextLong(), sc.nextInt()));
      }
      list.sort(Comparator.comparingLong(o -> o.price));

      long total = 0;
      for (Data d : list) {
        if (d.count < M) {
          total += d.price * d.count;
          M -= d.count;
        } else {
          total += d.price * M;
          break;
        }
      }
      System.out.println(total);
    }
  }

}