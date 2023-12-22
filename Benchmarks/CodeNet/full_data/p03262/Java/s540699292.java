import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Pattern;
import java.util.stream.Stream;;

public class Main {

  public static void main(String[] args) {
    new Main().run();
  }

  public void run() {
    
    try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

      String[] lines = br.readLine().split(" ");
      int  n = Integer.parseInt(lines[0]);
      long z = Long.parseLong(lines[1]);

      final Pattern delim = Pattern.compile(" ");
      long d = delim
        .splitAsStream(br.readLine())
        .parallel()
        .mapToLong(Long::parseLong)
        .map(l -> Math.abs(l-z))
        .reduce((e1,e2) -> gcd(e1, e2))
        .getAsLong();
      
      System.out.println(d);
    }
    catch(IOException e) {
      System.err.println(e);
    }
  }
  
  public long gcd(long x, long y) {
    if( x<y ) {
      long tmp = x; x = y; y = tmp;
    }
    if( (x%y) == 0 ) return y;
    else return gcd(y,x%y);
  }
}