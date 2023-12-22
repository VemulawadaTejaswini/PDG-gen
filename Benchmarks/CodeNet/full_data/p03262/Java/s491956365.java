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
      int n = Integer.parseInt(lines[0]);
      int z = Integer.parseInt(lines[1]);

      long[][] mat = new long[n+1][n+1];
      String seq = z + " " + br.readLine();
      n++;

      final Pattern delim = Pattern.compile(" ");
      long[] ax = delim
        .splitAsStream(seq)
        .mapToLong(Long::parseLong)
        .toArray();

      for(int i=0; i<n; i++) {
        for(int j=0; j<n; j++) {
          mat[i][j] = ax[i] - ax[j];
        }
      }

      long min = Long.MAX_VALUE;
      for (long[] am : mat) {
        for (long l : am) {
          long al =  Math.abs(l);
          if( al < min && al != 0)
            min = al;
        }
      }

      System.out.println(min);
    }
    catch(IOException e) {
      System.err.println(e);
    }
  }
}