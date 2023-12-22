import java.util.Arrays;
import java.util.Scanner;

class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    Data[] data = new Data[N];
    for (int i = 0; i < N; i++) {
      data[i] = new Data(Long.parseLong(sc.next()), i);
    }
    sc.close();
    Arrays.parallelSort(data);
    long midMin = data[(N - 1) / 2].getX();
    long midMax = data[N / 2].getX();
    long[] ans = new long[N];
    for (int i = 0; i < N; i++) {
      if (data[i].getX() >= midMax) {
        ans[data[i].getIdx()] = midMin;
      } else {
        ans[data[i].getIdx()] = midMax;
      }
    }
    for (int i = 0; i < N; i++) {
      System.out.println(ans[i]);
    }
  }

  public static class Data implements Comparable<Data> {
    private long X;
    private int idx;

    public Data(long X, int idx) {
      this.setX(X);
      this.setIdx(idx);
    }

    public long getX() {
      return this.X;
    }

    public void setX(long x) {
      this.X = x;
    }

    public int getIdx() {
      return this.idx;
    }

    public void setIdx(int idx) {
      this.idx = idx;
    }

    @Override
    public int compareTo(Data data) {
      return (int) (this.getX() - data.getX());
    }

  }

}
