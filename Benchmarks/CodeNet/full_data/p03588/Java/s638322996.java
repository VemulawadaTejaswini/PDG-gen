import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

  public static void main(String[] args) {
    new Main().run();
  }

  public void run() {

    try(BufferedReader in = new BufferedReader(new InputStreamReader(System.in))) {

      int n = Integer.parseInt(in.readLine());

      String[] lines;
      int maxK=0,maxV=0;
      int a,b;
      for(int i=0; i<n; i++) {
        lines = in.readLine().split(" ");
        a = Integer.parseInt(lines[0]);
        b = Integer.parseInt(lines[1]);
        if(a > maxK) {
          maxK = a;
          maxV = b;
        }
      }

      int ans = maxK + maxV;

      System.out.println(ans);
    }
    catch(IOException e) {
      System.err.println(e);
    }
  }
}