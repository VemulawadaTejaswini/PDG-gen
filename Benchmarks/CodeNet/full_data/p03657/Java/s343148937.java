import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String s = br.readLine();
    StringTokenizer st = new StringTokenizer(s);
    
    if (((Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken())) % 3) == 0) {
      System.out.println("Possible");
    } else {
      System.out.println("Impossible");
    }
  }

}
