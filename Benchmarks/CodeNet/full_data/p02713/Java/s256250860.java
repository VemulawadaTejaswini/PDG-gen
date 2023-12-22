import java.io.*;

public class Main {

  static long k, ans;

  public static long gcd(long a, long b){
    if(b > a) return gcd(b, a);
    if(b == 0L) return a;

    return gcd(b, a % b);
  }

  public static long gcd(long a, long b, long c){
    return gcd(a, gcd(b, c));
  }

  public static void main(String[] args) throws Exception {
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    String[] in = br.readLine().split(" ");
    k = Long.parseLong(in[0]);

    br.close();

    ans = 0;

    for(long i = 1; i <= k; i++){
      for(long j = 1; j <= k; j++){
        for(long l = 1; l <= k; l++){
          ans += gcd(i, j, l);
        }
      }
    }

    System.out.println(ans);

  }
}