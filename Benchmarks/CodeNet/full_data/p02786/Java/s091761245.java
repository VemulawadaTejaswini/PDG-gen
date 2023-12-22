import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    long h = Long.parseLong(in.readLine());
    h = calc(h);
    System.out.println(h);
  }
  
  public static long calc(long h) {
    long res = 1;
    if(h>1)
      res = 1 + 2 * calc(h/2);
    return res;
  }
}