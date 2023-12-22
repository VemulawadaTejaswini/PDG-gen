import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {

  public static void main(String[] args) {
    
    new Main().run();
  }
  public void run() {

    try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

      int n = Integer.parseInt(br.readLine());

      String line = br.readLine();
      String next;
      Set<String> set = new HashSet<>();
      set.add(line);
      String ans = "Yes";
      for(int i=1; i<n; i++) {
        next = br.readLine();

        if(!set.add(next)){
          ans = "No";
          break;
        }

        if(next.startsWith(line.substring(line.length()-1))) {
          line = next;
          continue;
        }
        else {
          ans = "No";
          break;
        }
      }

      System.out.println(ans);
    }
    catch(IOException e) {
      System.err.println(e);
    }
  }
}