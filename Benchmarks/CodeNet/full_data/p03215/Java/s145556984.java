import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Comparator;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    new Main().run();
  }

  public void run() {
    
    try(BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out)) {
          String[] s = in.readLine().split(" ");
          int n = Integer.parseInt(s[0]);
          int k = Integer.parseInt(s[1]);

          String line = in.readLine();
          int[] a = new int[n];
          char regex = ' ';
          boolean isContinue = true;
          for(int i=0, offset=0,next=0; isContinue; i++, offset = ++next) {
            if((next = line.indexOf(regex,offset)) == -1) {
              next = line.length();
              isContinue = false;
            }
            a[i] = Integer.parseInt(line.substring(offset,next));
          }

          int ps = 0;
          for(int i=n; i>0; i--)
            ps += i;
          long[] al = new long[ps];
          // List<Long> list = new LinkedList<>();
          for(int i=0, m=0; i<n; i++) {
            long sum = 0;
            for(int j=i; j<n; j++) {
              sum += (long)a[j];
              // list.add(sum);
              al[m++] = sum;
            }
          }

          long ans = 0;
          for(int i=62;i>=0;--i) {
            long b = 1L << i;
            int cnt = 0;
            for(long v: al) {
              if( (v&b) > 0 )
                ++cnt;
              if(cnt == k) {
                ans |= b;
                // list.removeIf(e -> (e&b) == 0);
                break;
              }
            }
          }

          System.out.println(ans);
      }
      catch(IOException e) {
        System.err.println(e);
      }
  }
}