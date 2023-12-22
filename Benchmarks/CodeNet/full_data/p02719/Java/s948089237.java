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
    if (n < k){
      System.out.println(k);
    } else if (n == 0){
      System.out.println(n);
    }
    else {
      long mod = n % k;
      if(mod == 0){
        System.out.println(0);
      }else {
        long result = k - mod;
        System.out.println(result);
      }
    }
  }
}
