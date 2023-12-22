import java.io.*;

public class Main {
  public static void main(String[] args) {
    new Main().run();
  }

  private void run() {
    try(BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out)) {

        String[] lines = in.readLine().split(" ");
        int a = Integer.parseInt(lines[0]);
        int b = Integer.parseInt(lines[1]);

        int ans = 0;
        if(0 <= a && a < 6) ans = 0;
        else if(a <13) ans = b / 2;
        else ans = b;

        System.out.println(ans);
    }
    catch(IOException e) {
      System.err.println(e);
    }
  }
}