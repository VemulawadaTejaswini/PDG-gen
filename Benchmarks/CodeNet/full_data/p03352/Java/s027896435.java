import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    int x = Integer.parseInt(in.readLine());
    int max = 0;
    for(int i=1; i<=x; i++) {
      if(Math.pow(i,2) <= x)
        max = (int)Math.pow(i,2);
    }
    System.out.println(max);
  }
}