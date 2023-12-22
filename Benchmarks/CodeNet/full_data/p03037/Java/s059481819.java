import java.io.*;

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

        int l = 1;
        int r = n;
        int lc, rc;
        for (int i = 0; i < m; i++) {
          lines = in.readLine().split(" ");
          lc = Integer.parseInt(lines[0]);
          rc = Integer.parseInt(lines[1]);
          if(l < lc) l = lc;
          if(rc < r) r = rc;
        }

        int ans = Math.max(1 + r - l, 0);
        out.println(ans);
        out.flush();
    }
    catch(IOException e) {
      System.err.println(e);
    }
  }
}