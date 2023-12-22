import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Main {

  public static void main(String[] args) {
    new Main().run();
  }

  public void run() {

    try(BufferedReader in = new BufferedReader(new InputStreamReader(System.in))) {

      String line = in.readLine();
      int k = Integer.parseInt(in.readLine());

      int n = line.length();
      Set<String> set = new TreeSet<>();

      for(int i=0; i <= n; i++) {
        for(int j=i+1; j<=n && j<=i+k; j++) {
            set.add(line.substring(i, j));
        }
      }

      Iterator<String> ite = set.iterator();
      String[] ans = new String[k];
      for(int i=0; i<k; i++)
        ans[i] = ite.next();

      System.out.println(ans[k-1]);
    }
    catch(IOException e) {
      System.err.println(e);
    }
  }
}