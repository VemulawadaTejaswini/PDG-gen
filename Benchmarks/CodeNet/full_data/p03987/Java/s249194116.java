import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.TreeSet;
public class Main {
  public static void main(String[] args) {
    Main m = new Main();
    m.run();
  }
  private void run() {
    int n = 0;
    int[] a = new int[0];
    try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));) {
      n = Integer.parseInt(br.readLine());
      a = Arrays.stream(br.readLine().split("\\s+"))
        .mapToInt(Integer::parseInt).toArray();
    } catch (IOException e) {
      e.printStackTrace();
    }
    TreeSet<Integer> s = new TreeSet<>();
    s.add(0);
    s.add(n+1);
    int[] b = new int[n];
    for (int i=0;i<n;i++) b[a[i]-1] = i+1;
    long m = 0L;
    for (int i=0;i<n;i++) {
      s.add(b[i]);
      m += (long)(i+1)*(long)(b[i]-s.lower(b[i]))*(long)(s.higher(b[i])-b[i]);
    }
    System.out.println(m);
  }
}