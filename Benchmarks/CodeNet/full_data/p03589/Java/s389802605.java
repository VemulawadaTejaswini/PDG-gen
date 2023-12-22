import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

  public static void main(String[] args) {
    new Main().run();
  }

  public void run() {

    try(BufferedReader in = new BufferedReader(new InputStreamReader(System.in))) {
      
      long n = Integer.parseInt(in.readLine());

      long p,q;
      for(long x=1; x<3501; x++) {
        for(long y=1; y<3501; y++) {

          if(p = ((x*y)<<2) - n*x - n*y < 1)
            continue;

          if((q = n*x*y) % p == 0) {
            System.out.println(x + " " + y + " " + q/p);
            return;
          }
        }
      }
    }
    catch(IOException e) {
      System.err.println(e);
    }
  }
}