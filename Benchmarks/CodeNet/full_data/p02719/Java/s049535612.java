import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    String in = reader.readLine();
    String[] params = in.split(" ");
    long n = Long.parseLong(params[0]);
    long k = Long.parseLong(params[1]);
    if (n < k) {System.out.println(n);}
    else {
      float mod = n % k;
      if(Math.abs(mod - 0.0) < .001){
        System.out.println(0);
      }else {
        float result = k - mod;
        System.out.println((int)result);
      }
    }
  }
}
