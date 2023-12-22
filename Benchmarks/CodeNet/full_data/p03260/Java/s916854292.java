import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

  public static void main(String[] args) {
    
    new Main().run();
  }
  public void run() {

    try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

      String[] lines = br.readLine().split(" ");
      int a = Integer.parseInt(lines[0]);
      int b = Integer.parseInt(lines[1]);

      String ans = "No";
      if((a & 1) == 1 && (b & 1) == 1)
        ans = "Yes";

      System.out.println(ans);
    }
    catch(IOException e) {
      System.err.println(e);
    }
  }
}