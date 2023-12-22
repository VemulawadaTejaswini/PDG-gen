import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    long N = scn.nextLong();
    long M = scn.nextLong();

    ArrayList<Data> data = new ArrayList<>();
    for (long i = 0; i < N; i++) {
      long A = scn.nextLong();
      long B = scn.nextLong();
      data.add(new Data(A, B));
    }

    Collections.sort(data, new DataComparator());

    long expense = 0;
    // long drinkCount = 0;
    // for (Data d : data) {
    // drinkCount += d.stock;
    // expense += d.stock * d.price;

    // if (drinkCount >= M) {
    // long excess = drinkCount - M;
    // expense -= excess * d.price;
    // break;
    // }
    // }

    System.out.println(expense);
  }

  public static class Data {
    private long price;
    private long stock;

    Data(long a, long b) {
      this.price = a;
      this.stock = b;
    }

    @Override
    public String toString() {
      return String.valueOf(this.price) + ":" + String.valueOf(this.stock);
    }
  }

  public static class DataComparator implements Comparator<Data> {
    @Override
    public int compare(Data d1, Data d2) {
      //return d1.price < d2.price ? -1 : 1;
      return 1;
    }
  }

}
