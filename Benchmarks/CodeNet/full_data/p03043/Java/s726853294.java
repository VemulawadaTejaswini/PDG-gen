import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

  public static void main(String[] args) {

    new Main().run();
  }
  public void run() {

    try(BufferedReader in = new BufferedReader(new InputStreamReader(System.in))) {
      String[] lines = in.readLine().split(" ");
      int n = Integer.parseInt(lines[0]);
      int k = Integer.parseInt(lines[1]);

      double dn = n;
      double ans = 0.0;
      if(k == 1) ans = 1;
      else {
        for (int i = 1; i <= n; i++) {
          int cnt = 0;
          for (int j = i; j < k; j*=2) {
            cnt++;
          }
          
          ans += 1 / dn * Math.pow(0.5, cnt);
        }
      }

      System.out.println(ans);
    }
    catch(IOException e) {

      System.err.println(e);
    }
  }
}