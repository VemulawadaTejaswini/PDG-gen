import java.io.*;
import java.util.Arrays;
import java.util.stream.IntStream;

public class Main {
  public static void main(String[] args) {
    new Main().run();
  }

  private void run() {
    try(BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out)) {

      final int MAX = 100000;
      int n = Integer.parseInt(in.readLine());

      int[] table = new int[MAX+1];
      in.lines()
        .limit(n)
        .map(s -> s.split(" "))
        .map(a -> Arrays.stream(a).mapToInt(Integer::parseInt).toArray())
        .forEach(a -> IntStream.rangeClosed(a[0],a[1])
          .parallel()
          .forEach(i -> table[i] = 1)
        );

      final int ans = Arrays.stream(table).sum();
      System.out.println(ans);
    }
    catch(IOException e) {
      System.err.println(e);
    }
  }
}