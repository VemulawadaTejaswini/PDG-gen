import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
    int n = Integer.parseInt(br.readLine());
    String s = br.readLine();
    String[] sa = s.split(" ");
    List<Integer> na =  Arrays.stream(sa).map(Integer::valueOf).collect(Collectors.toList());
    na.sort(Comparator.reverseOrder());
    int a = 0;
    int b = 0;
    for (int i = 0; i < n; i++) {
      if (i % 2 == 0) {
        a += na.get(i);
      } else {
        b += na.get(i);
      }
    }
    out.println(a - b);
    out.close();
  }
}