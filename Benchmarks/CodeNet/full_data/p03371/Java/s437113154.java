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
      int[] params = new int[lines.length];
      int k=0;
      for (String s : lines) {
        params[k++] = Integer.parseInt(s);
      }

      int ans = Integer.MAX_VALUE;
      int max = params[3] + params[4];
      for(int i=0; i<max; i++) {
        int t = 2 * params[2] * i
          + Math.max(params[3] - i, 0) * params[0]
          + Math.max(params[4] - i, 0) * params[1];
        ans = Math.min(ans, t);
      }

      System.out.println(ans);

    }
    catch(IOException e) {
      System.err.println(e);
    }
  }
}