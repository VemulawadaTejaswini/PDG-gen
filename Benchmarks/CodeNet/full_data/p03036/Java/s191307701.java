import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] str = br.readLine().split(" ");
    int r = Integer.parseInt(str[0]);
    int D = Integer.parseInt(str[1]);
    int x = Integer.parseInt(str[2]);
    
    for (int i = 0; i < 10; i++) {
      x = r * x - D;
      System.out.println(x);
    }
  }
}