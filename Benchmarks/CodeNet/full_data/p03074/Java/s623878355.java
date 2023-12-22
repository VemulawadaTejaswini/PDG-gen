import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Queue;
public class Main {
  public static void main(String[] args) {
    Main m = new Main();
    m.run();
  }
  private void run() {
    int n = 0;
    int k = 0;
    String s = "";
    try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));) {
      String[] p = br.readLine().split("\\s+");
      n = Integer.parseInt(p[0]);
      k = Integer.parseInt(p[1]);
      s = br.readLine();
    } catch (IOException e) {
      e.printStackTrace();
    }
    int t = 1;
    int j = 1;
    Queue<Integer> q = new ArrayDeque<>();
    for (int i=1;i<n;i++) {
      if (s.charAt(i) != s.charAt(i-1) && s.charAt(i) == '0' && k == 0) {
        q.add(i-1);
        j = i;
        break;
      }
      if (s.charAt(i) != s.charAt(i-1)) {
        q.add(i-1);
        k--;
      }
      t++;
    }
    int m = t;
    for (int i=j;i<n;i++) {
      if (s.charAt(i) != s.charAt(i-1) && s.charAt(i) == '0') {
        q.add(i-1);
        int p = q.poll();
        if (s.charAt(p) == '1') p = q.poll();
        t = i-p;
        continue;
      }
      if (s.charAt(i) != s.charAt(i-1)) q.add(i-1);
      t++;
      if (m < t) m = t;
    }
    System.out.println(m);
  }
}