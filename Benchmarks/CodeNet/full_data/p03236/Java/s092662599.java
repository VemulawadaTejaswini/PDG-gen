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

    int[][] field = new int[n][n];
    for(int i = 0; i < n; i++){
      String s = sc.nextStr();
      for(int j = 0; j < n; j++){
        if(s.charAt(j) == '#'){
          field[i][j] = 0;
        }else{
          field[i][j] = (int)s.charAt(j) - 48;
        }
      }
    }

    long answer = 0;

    for(int startx = 0; startx < n; startx++){
      for(int starty = 0; starty < n; starty++){
        if(startx + starty == 0){continue;}
        if(field[startx][starty] == 0){continue;}

        boolean[][] check = new boolean[n+1][n+1];
        for(int i = 0; i <= n; i++){
          for(int j = 0; j <= n; j++){
            if(i <= startx && j <= starty){
              check[i][j] = true;
            }else{
              check[i][j] = false;
            }
          }
        }

        for(int kyori = 0; kyori <= Math.min(startx, starty); kyori++){
          int nowx = startx - kyori;
          int nowy = starty - kyori;

          if(kyori > 0){
            if(field[nowx][nowy] > 0 && (check[nowx+1][nowy] || check[nowx][nowy+1])){
              answer += field[nowx][nowy] * field[startx][starty];
            }else{
              check[nowx][nowy] = false;
            }
          }

          //タテチェック
          for(int i = 1; nowy - i >= 0; i++){
            if(field[nowx][nowy-i] > 0 && (check[nowx][nowy-i+1] || check[nowx+1][nowy-i])){
              answer += field[nowx][nowy-i] * field[startx][starty];
            }else{
              check[nowx][nowy-i] = false;              
            }
          }

          nowx = startx - kyori;
          nowy = starty - kyori;
          //ヨコチェック
          for(int i = 1; nowx - i >= 0; i++){
            if(field[nowx-i][nowy] > 0 && (check[nowx-i+1][nowy] || check[nowx-i][nowy+1])){
              answer += field[nowx-i][nowy] * field[startx][starty];
            }else{
              check[nowx-i][nowy] = false;              
            }
          }

        }


      }
    }


    System.out.println(answer);
 
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