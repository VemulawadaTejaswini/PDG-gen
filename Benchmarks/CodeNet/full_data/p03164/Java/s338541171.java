import java.io.PrintWriter;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.TreeSet;
import java.io.InputStream;
import java.io.IOException;


public class Main {
  public static void main(String[] args) {
    InputReader sc = new InputReader(System.in);

    int N = sc.nextInt();
    int W = sc.nextInt();
    int[] weights = new int[N + 1];
    int[] values  = new int[N + 1];
    weights[0] = 0;
    values[0] = 0;
    int total = 0;
    for (int i = 1; i <= N; i++) {
        weights[i] = sc.nextInt();
        values[i]  = sc.nextInt();
        total += values[i];
    }
    long[] dp = new long[total + 1];
    Arrays.fill(dp, Integer.MAX_VALUE);
    dp[0] = 0;

    for (int i = 1; i <= N; i++) {
        for (int j = total - values[i]; j >= 0 ; j--) {
          dp[j + values[i]] = Math.min(dp[j + values[i]], weights[i] + dp[j]);
        }
    }
   long result = 0;
   for (int i = 1; i <= total; i++) {
       if (dp[i] <= W) {
           result = Math.max(result, i);
       }
   }
   System.out.println(result);
  }
  static class InputReader {
      private InputStream stream;
      private byte[] buf = new byte[1024];
      private int curChar;
      private int numChars;
      private SpaceCharFilter filter;

      public InputReader(InputStream stream) {
          this.stream = stream;
      }

      public int next() {
          if (numChars == -1)
              throw new InputMismatchException();
          if (curChar >= numChars) {
              curChar = 0;
              try {
                  numChars = stream.read(buf);
              } catch (IOException e) {
                  throw new InputMismatchException();
              }
              if (numChars <= 0)
                  return -1;
          }
          return buf[curChar++];
      }

      public String nextStr() {
        int c = next();
        while(isSpaceChar(c)){c = next();}
        StringBuffer str = new StringBuffer();
        do{
          str.append((char)c);
          c = next();
        }while(!isSpaceChar(c));
        return str.toString();
      }

      public char nextChar() {
        int c = next();
        while(isSpaceChar(c)){c = next();}
        char ret;
        do{
          ret = (char)c;
          c = next();
        }while(!isSpaceChar(c));
        return ret;
      }

      public int nextInt() {
          int c = next();
          while (isSpaceChar(c))
              c = next();
          int sgn = 1;
          if (c == '-') {
              sgn = -1;
              c = next();
          }
          int res = 0;
          do {
              if (c < '0' || c > '9')
                  throw new InputMismatchException();
              res *= 10;
              res += c - '0';
              c = next();
          } while (!isSpaceChar(c));
          return res * sgn;
      }

      public boolean isSpaceChar(int c) {
          if (filter != null)
              return filter.isSpaceChar(c);
          return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
      }

      public interface SpaceCharFilter {
          public boolean isSpaceChar(int ch);
      }
  }
}