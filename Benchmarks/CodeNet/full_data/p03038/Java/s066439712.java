import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) {
    new Main().run();
  }

  private void run() {
    try(BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out)) {

        String[] lines = in.readLine().split(" ");
        int n = Integer.parseInt(lines[0]);
        int m = Integer.parseInt(lines[1]);

        TreeMap<Long,Long> map = new TreeMap<>();

        lines = in.readLine().split(" ");
        Long b = 0L;
        for (int i = 0; i < n; i++) {
          b = Long.parseLong(lines[i]);
          if(map.containsKey(b)) map.put(b, map.get(b) + 1);
          else  map.put(b, 1L);
        }

        Long c = 0L;
        for (int i = 0; i < m; i++) {
          lines = in.readLine().split(" ");
          b = Long.parseLong(lines[0]);
          c = Long.parseLong(lines[1]);
          if(map.containsKey(c)) map.put(c, map.get(c) + b);
          else map.put(c, b);
        }

        Long N = new Long(n);
        Long ans = 0L;
        Long k, v;
        Iterator<Long> ite = map.descendingKeySet().iterator();
        for(Long cnt = 0L; cnt < N; cnt += v) {
          k = ite.next();
          v = map.get(k);
          if(cnt + v < N) ans += k * v;
          else ans += k * (n - cnt);
        }

        out.println(ans);
        out.flush();
    }
    catch(IOException e) {
      System.err.println(e);
    }
  }
}