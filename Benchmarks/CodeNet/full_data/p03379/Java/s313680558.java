import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

  public static void main(String[] args) {
    new Main().run();
  }

  public void run() {

    try(BufferedReader in = new BufferedReader(new InputStreamReader(System.in))) {

      final int n = Integer.parseInt(in.readLine());

      String line = in.readLine();
      int[] seq = new int[n];
      int[] ref = new int[n];
      char regex = ' ';
      boolean isContinue = true;
      for(int i=0, offset=0,next=0; isContinue; i++, offset = ++next) {
        if((next = line.indexOf(regex,offset)) == -1) {
          next = line.length();
          isContinue = false;
        }
        ref[i] = seq[i] = Integer.parseInt(line.substring(offset,next));
      }

      Arrays.parallelSort(ref);

      final int d = n>>1;
      StringBuilder buf = new StringBuilder();
      for(int i: seq) {
        if(i < ref[d] ) buf.append(ref[d]).append('\n');
        else buf.append(ref[d-1]).append('\n');
      }

      System.out.print(buf);
    }
    catch(IOException e) {
      System.err.println(e);
    }
  }
}