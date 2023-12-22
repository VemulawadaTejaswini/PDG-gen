import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
  public static void main(String[] args) {
    new Main().run();
  }

  public void run() {
    
    try(BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out)) {

          int n = Integer.parseInt(in.readLine());

          int a[] = new int[n];
          String line = in.readLine();
          char regex = ' ';
          boolean isContinue = true;
          for(int i=0,m=0, offset=0,next=0; isContinue; i++, offset = ++next) {
            if((next = line.indexOf(regex,offset)) == -1) {
              next = line.length();
              isContinue = false;
            }
            a[i] = Integer.parseInt(line.substring(offset,next));
          }

          int sum=0;
          for(int i=0; i<n; i++) {
            sum += a[i];
          }

          double ave = sum / (double)n;

          int ans=0;
          double d=0.0, min = 100000.0;
          for(int i=0; i<n; i++) {
            d = Math.abs(ave - a[i]);
            if(min > d) {
              min = d;
              ans = i;
            }
          }
          System.out.println(ans);
      }
      catch(IOException e) {
        System.err.println(e);
      }
  }
}