import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main {
  public static void main(String[] args) {
    new Main().run();
  }

  public void run() {
    
    try(BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out)) {

          int n = Integer.parseInt(in.readLine());
          int sum = 0;

          int a[] = new int[n];
          String line = in.readLine();
          char regex = ' ';
          boolean isContinue = true;
          for(int i=0,m=0, offset=0,next=0; isContinue; i++, offset = ++next) {
            if((next = line.indexOf(regex,offset)) == -1) {
              next = line.length();
              isContinue = false;
            }
            sum += a[m++] = Integer.parseInt(line.substring(offset,next));
          }

          int ans=0;
          int d=0, min = 10000000;
          for(int i=0; i<n; i++) {
            d = Math.abs(sum - a[i]*n);
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