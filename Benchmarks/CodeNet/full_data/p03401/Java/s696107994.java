import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

  public static void main(String[] args) {
    new Main().run();
  }

  public void run() {

    try(BufferedReader in = new BufferedReader(new InputStreamReader(System.in))) {

      int n = Integer.parseInt(in.readLine());
      int[] seq = new int[n+1];
      seq[0] = 0;

      String line = in.readLine();
      char regex = ' ';
      boolean isContinue = true;
      for(int i=1, offset=0,next=0; isContinue; offset = ++next) {
        if((next = line.indexOf(regex,offset)) == -1) {
          next = line.length();
          isContinue = false;
        }
        seq[i++] = Integer.parseInt(line.substring(offset,next));
      }

      int sum=0;
      StringBuilder buf = new StringBuilder();
      for(int i=0; i<n; i++) {
        sum += Math.abs(seq[i+1] - seq[i]);
      }
      sum += Math.abs(seq[n]);

      int d=0;
      for(int i=1; i<n; i++) {
        d = 0;
        d -= Math.abs(seq[i] - seq[i-1]);
        d -= Math.abs(seq[i+1] - seq[i]);
        d += Math.abs(seq[i+1] - seq[i-1]);
        buf.append(sum + d).append('\n');
      }

      {
        d = 0;
        d -= Math.abs(seq[n] - seq[n-1]);
        d -= Math.abs(seq[0] - seq[n]);
        d += Math.abs(seq[0] - seq[n-1]);
        buf.append(sum + d).append('\n');
      }

      System.out.print(buf);
    }
    catch(IOException e) {
      System.err.println(e);
    }
  }
}