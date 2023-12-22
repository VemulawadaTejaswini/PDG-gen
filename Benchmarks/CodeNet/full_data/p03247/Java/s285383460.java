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

    int[][] points = new int[n][2];
    int[] abss = new int[n];
    for(int i = 0; i < n; i++){
      points[i][0] = sc.nextInt();
      points[i][1] = sc.nextInt();
      abss[i] = points[i][0] + points[i][1];
    }

    boolean possible_check = true;
    for(int i = 0; i < n - 1; i++){
      if(Math.abs(abss[i]) % 2 != Math.abs(abss[i+1]) % 2){
        possible_check = false;
      }
    }

    if(possible_check){
      if(abss[0] % 2 == 0){
        System.out.println("20");

        for(int k = 0; k < 19; k++){
          System.out.print("1 ");
        }
        System.out.println("1");

        for(int j = 0; j < n; j++){
          char tate;
          char yoko;
          if(points[j][1] > 0){
            tate = 'U';
          }else{
            tate = 'D';
          }
          if(points[j][0] > 0){
            yoko = 'R';
          }else{
            yoko = 'L';
          }

          for(int i = 0; i < Math.abs(points[j][0]); i++){
            System.out.print(yoko);
          }
          for(int i = 0; i < Math.abs(points[j][1]); i++){
            System.out.print(tate);
          }
          for(int i = 0; i < (20 - Math.abs(points[j][1]) - Math.abs(points[j][0])) / 2; i++){
            System.out.print("UD");
          } 

          System.out.println("");
        }

      }else{
        System.out.println("21");

        for(int k = 0; k < 20; k++){
          System.out.print("1 ");
        }
        System.out.println("1");

        for(int j = 0; j < n; j++){
          char tate;
          char yoko;
          if(points[j][1] > 0){
            tate = 'U';
          }else{
            tate = 'D';
          }
          if(points[j][0] > 0){
            yoko = 'R';
          }else{
            yoko = 'L';
          }

          for(int i = 0; i < Math.abs(points[j][0]); i++){
            System.out.print(yoko);
          }
          for(int i = 0; i < Math.abs(points[j][1]); i++){
            System.out.print(tate);
          }
          for(int i = 0; i < (21 - Math.abs(points[j][1]) - Math.abs(points[j][0])) / 2; i++){
            System.out.print("UD");
          } 

          System.out.println("");
        }

      }
    }else{
      System.out.println("-1");
    }

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