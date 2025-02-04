import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.PriorityQueue;
 
class demand implements Comparable{
  int from;
  int to;
 
  public int compareTo(Object other){
    demand otherdemand = (demand)other;
    return to - otherdemand.to;
  }
}
 
public class Main {
  public static void main(String[] args) {
    InputReader sc = new InputReader(System.in);
 
    int n = sc.nextInt();
    int m = sc.nextInt();


    demand[] demands = new demand[m];

    for(int i = 0; i < m; i++){
      demand newdemand = new demand();
      newdemand.from = sc.nextInt();
      newdemand.to = sc.nextInt();
      demands[i] = newdemand;
    }

    Arrays.sort(demands);

    int ans = 0;
    int nowclear = 0;
    for(int i = 0; i < m; i++){
      int nowfrom = demands[i].from;
      int nowto = demands[i].to;
      if(nowclear < nowfrom){
        ans++;
        nowclear = nowto - 1;
      }
    }

    System.out.println(ans);
 
  }
 
 //ここからテンプレ
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