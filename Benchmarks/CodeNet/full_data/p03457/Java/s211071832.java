import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String args[]) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    int N = Integer.parseInt(br.readLine());
    boolean ok = true;
    for (int i = 0; i < N; ++i) {
      String[] vals = br.readLine().split(" ");
      int t = Integer.parseInt(vals[0]);
      int x = Integer.parseInt(vals[1]);
      int y = Integer.parseInt(vals[2]);
      
      if (t < (x + y) || (t % 2 != (x+y) % 2)) {
        ok = false;
        break;
      }
    }
    
    if (ok) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }
}
