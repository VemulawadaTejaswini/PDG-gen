import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.TreeMap;

public class Main {

  public static void main(String[] args) {
    new Main().run();
  }

  public void run() {

    try(BufferedReader in = new BufferedReader(new InputStreamReader(System.in))) {

      int n = Integer.parseInt(in.readLine());

      String[] lines;
      int[] max = {0, 0};
      // int[] min = {1_100_000_000, 0};
      int a,b;
      TreeMap<Integer,Integer> map = new TreeMap<>();
      for(int i=0; i<n; i++) {
        lines = in.readLine().split(" ");
        a = Integer.parseInt(lines[0]);
        b = Integer.parseInt(lines[1]);
        if(a > max[0]) {
          max[0] = a;
          max[1] = b;
        }
        // else if(a < min[0]) {
        //   min[0] = a;
        //   min[1] = b;
        // }
      }

      int ans = max[0] + max[1];

      System.out.println(ans);
    }
    catch(IOException e) {
      System.err.println(e);
    }
  }
}