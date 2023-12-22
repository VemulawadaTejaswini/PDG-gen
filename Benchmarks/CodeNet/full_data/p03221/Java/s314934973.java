import java.io.*;
import java.util.*;


public class Main {


  class ID implements Comparable<ID> {
    int index;
    int prefecture;
    int year;
    String id;

    public ID(int index, int prefecture, int year) {
      this.index = index;
      this.prefecture = prefecture;
      this.year = year;
    }

    @Override
    public boolean equals(Object o) {
      if (this == o) return true;
      if (o == null || getClass() != o.getClass()) return false;
      ID id1 = (ID) o;
      return index == id1.index &&
              prefecture == id1.prefecture &&
              year == id1.year &&
              Objects.equals(id, id1.id);
    }

    @Override
    public int hashCode() {
      return Objects.hash(index, prefecture, year, id);
    }

    @Override
    public int compareTo(ID o) {
      return this.year - o.year;
    }
  }

  private void solve(InputReader in, PrintWriter out) {
    int n = in.nextInt();
    int m = in.nextInt();
    ArrayList<ID> list = new ArrayList<>();
    int arr[] = new int[n + 1];
    for (int i = 0; i < m; i++) {
      int index = in.nextInt();
      list.add(new ID(i, index, in.nextInt()));
      arr[index]++;
    }
    int[] tmp = new int[n + 1];
    if (n + 1 >= 0) System.arraycopy(arr, 0, tmp, 0, n + 1);
    Collections.sort(list);
    for (int i = 0; i < m; i++) {
      list.get(i).id = String.valueOf(arr[list.get(i).prefecture] + 1 - tmp[list.get(i).prefecture]--);
    }
    list.sort(Comparator.comparingInt(a -> a.index));
    for (int i = 0; i < m; i++) {
      StringBuilder val = new StringBuilder(String.valueOf(list.get(i).prefecture));
      StringBuilder val2 = new StringBuilder(String.valueOf(list.get(i).id));
      int len = val.length();
      int len2 = val2.length();
      if (val.length() < 6) {
        for (int j = 0; j < 6 - len; j++) {
          val.insert(0, "0");
        }
      }
      if (val2.length() < 6) {
        for (int j = 0; j < 6 - len2; j++) {
          val2.insert(0, "0");
        }
      }
      out.println(val.toString() + val2.toString());
    }


  }


  public static void main(String[] args) throws FileNotFoundException {
    new Main().run();
  }

  private void run() throws FileNotFoundException {

    //new FileInputStream(new File("input.txt"))
    //
    try (InputReader in = new InputReader(System.in);
         PrintWriter out = new PrintWriter(System.out)) {
      solve(in, out);
    }
  }


  static class InputReader implements AutoCloseable {
    private BufferedReader reader;
    private StringTokenizer tokenizer;

    InputReader(InputStream stream) {
      reader = new BufferedReader(new InputStreamReader(stream), 32768);
      tokenizer = null;
    }

    String next() {
      while (tokenizer == null || !tokenizer.hasMoreTokens()) {
        try {
          tokenizer = new StringTokenizer(reader.readLine());
        } catch (IOException e) {
          throw new RuntimeException(e);
        }
      }
      return tokenizer.nextToken();
    }

    public int nextInt() {
      return Integer.parseInt(next());
    }

    public long nextLong() {
      return Long.parseLong(next());
    }

    public double nextDouble() {
      return Double.parseDouble(next());
    }

    @Override
    public void close() {
    }
  }

}
