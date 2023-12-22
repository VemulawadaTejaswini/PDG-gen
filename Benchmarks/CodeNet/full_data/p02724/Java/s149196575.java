import java.io.*;

public class Main {
  
  static long n;

  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String[] in;
    in = br.readLine().split(" ");
    n = Long.parseLong(in[0]);

    br.close();

    long ans = 0;
    ans += (n / 500) * 1000;
    n -= n / 500 * 500;

    ans += n / 5 * 5;
    
    System.out.println(ans);
  }
}