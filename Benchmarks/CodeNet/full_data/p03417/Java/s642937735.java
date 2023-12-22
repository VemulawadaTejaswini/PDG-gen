import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

  public static void main(String[] args) {
    new Main().run();
  }

  public void run() {

    try(BufferedReader in = new BufferedReader(new InputStreamReader(System.in))) {

      String[] lns = in.readLine().split(" ");
      long n = Integer.parseInt(lns[0]);
      long m = Integer.parseInt(lns[1]);
      long ans = Math.abs(n * m -(n-1)*2 -(m-1)*2);
      System.out.println(ans);

    }
    catch(IOException e) {
      System.err.println(e);
    }
  }
}