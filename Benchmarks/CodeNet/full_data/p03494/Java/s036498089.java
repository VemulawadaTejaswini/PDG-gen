import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.stream.Stream;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
    int n = Integer.parseInt(br.readLine());
    String[] s = br.readLine().split(" ");
    int[] an  = Stream.of(s).mapToInt(Integer::parseInt).toArray();
    int res = 0;
    while (true) {
      boolean exist_odd = false;
      for (int i = 0; i < n; i++) {
        if (an[i] % 2 != 0) exist_odd = true;
      }
      if (exist_odd) break;
      for (int i = 0; i < n; i++) {
        an[i] /= 2;
      }
      res++;
    }
    out.println(res);
    out.close();
  }
}