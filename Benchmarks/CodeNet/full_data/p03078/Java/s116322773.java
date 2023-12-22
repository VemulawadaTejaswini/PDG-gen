import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) throws IOException {
    new Main().execute(System.in);
//    ByteArrayOutputStream os = new ByteArrayOutputStream();
//    os.write(("3 3 3 5\n" +
//        "1 10 100\n" +
//        "2 20 200\n" +
//        "1 10 100").getBytes());
//    InputStream is = new ByteArrayInputStream(os.toByteArray());
//    new Main().execute(is);
  }

  public void execute(InputStream in) {
    Scanner sc = new Scanner(in);
    int x = sc.nextInt();
    int y = sc.nextInt();
    int z = sc.nextInt();
    int k = sc.nextInt();

    Value[] as = new Value[x];
    for (int i = 0; i < x; i++) as[i] = new Value('a', sc.nextLong());
    Arrays.sort(as, Comparator.reverseOrder());

    Value[] bs = new Value[y];
    for (int i = 0; i < y; i++) bs[i] = new Value('b', sc.nextLong());
    Arrays.sort(bs, Comparator.reverseOrder());

    Value[] cs = new Value[z];
    for (int i = 0; i < z; i++) cs[i] = new Value('c', sc.nextLong());
    Arrays.sort(cs, Comparator.reverseOrder());

    Value[] values = new Value[x + y + z];
    System.arraycopy(as, 0, values, 0, as.length);
    System.arraycopy(bs, 0, values, x, bs.length);
    System.arraycopy(cs, 0, values, x + y, cs.length);
    Arrays.sort(values, Comparator.naturalOrder());

    Long[] ys = new Long[as.length * bs.length * cs.length];
    int l = 0;
    for (int ai = 0; ai < as.length; ai++) {
      for (int bi = 0; bi < bs.length; bi++) {
        for (int ci = 0; ci < cs.length; ci++) {
          ys[l++] = as[ai].yamy + bs[bi].yamy + cs[ci].yamy;
        }
      }
    }

    Arrays.sort(ys, Comparator.reverseOrder());
    for (int j = 0; j < k; j++) {
      System.out.println(ys[j]);
    }
  }

  static class Value implements Comparable<Value> {
    private final char cake;
    private final long yamy;
    Value(char cake, long yamy) {
      this.cake = cake;
      this.yamy = yamy;
    }

    @Override
    public int compareTo(Value o) {
      return Long.compare(yamy, o.yamy);
    }
  }
}
