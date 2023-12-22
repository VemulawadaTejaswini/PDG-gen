import java.io.*;

public class Main {

  static long n, k;

  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    String[] in = br.readLine().split(" ");
    n = Long.parseLong(in[0]);
    k = Long.parseLong(in[1]);

    br.close();

    long ans = Math.min(n, k - n);

    if(n >= k){
      ans = Math.min(n%k, k - n%k);
    }

    System.out.println(ans);
  }
}