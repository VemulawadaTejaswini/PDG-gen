import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

  public static void main(String[] args) {
    new Main().run();
  }

  public void run() {
    
    try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

      String[] lines = br.readLine().split(" ");
      int  n = Integer.parseInt(lines[0]);
      long z = Long.parseLong(lines[1]);

      long[] ax = new long[n];
      lines = br.readLine().split(" ");
      int k=0;
      for (String s : lines) {
        ax[k++] = Math.abs( Long.parseLong(s) - z );
      }

      long d = ax[0];
      if(n>1) {
        d = gcd(ax[0],ax[1]);
        for(int i=2; i<n; i++)
          d = gcd(d,ax[i]);
      }
      
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