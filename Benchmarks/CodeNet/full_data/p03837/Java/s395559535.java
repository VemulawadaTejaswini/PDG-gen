import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.TreeSet;
 
 
 
public class Main {
  public static void main(String[] args) {
    InputReader sc = new InputReader(System.in);
 
    int n = sc.nextInt();
    int m = sc.nextInt();

    int[][] graph = new int[n][n];
    for(int i = 0; i< n; i++){
      for(int j = 0; j < n; j++){
        if(i == j){
          graph[i][j] = 0;
        }else{
          graph[i][j] = 1000001;
        }
      }
    }

    for(int i = 0; i < m; i++){
      int a = sc.nextInt() - 1;
      int b = sc.nextInt() - 1;
      int c = sc.nextInt();
      graph[a][b] = c;
      graph[b][a] = c;
    }

    int[][] shortest = new int[n][n];
    for(int i = 0; i < n; i++){
      for(int j = 0; j < n; j++){
        shortest[i][j] = graph[i][j];
      }
    }

    //わーしゃるふろいど
    for(int i = 0; i < n; i++){
      for(int j = 0; j < n; j++){
        for(int k = 0; k < n; k++){
          if(shortest[j][k] > shortest[j][i] + shortest[i][k]){
            shortest[j][k] = shortest[j][i] + shortest[i][k];
            shortest[k][j] = shortest[j][i] + shortest[i][k];
          }
        }
      }
    }

    int count = 0;
    for(int i = 0; i < n; i++){
      for(int j = i + 1; j < n; j++){
        if(graph[i][j] > shortest[i][j] && graph[i][j] <= 1000){
          count++;
          // System.out.print(i);
          // System.out.print(" ");
          // System.out.println(j);

        }
      }
    }

    System.out.println(count);
 
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