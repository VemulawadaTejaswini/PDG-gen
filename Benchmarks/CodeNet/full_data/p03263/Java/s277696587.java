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
 
    int h= sc.nextInt(); //h
    int w = sc.nextInt(); //w

    int[][] table = new int[h][w];
    for(int i = 0; i < h; i++){
        for(int j = 0; j < w; j++){
            table[i][j] = sc.nextInt();
        }
    }

    int count = 0;
    String[] anss = new String[h*w];

    for(int sum = 0; sum < h + w - 1; sum++){
        for(int i = 0; i < h; i++){
            for(int j = 0; j < w; j++){
                if(i + j != sum){continue;}

                if(table[i][j] % 2 == 1){
                    count++;
                    if(i < h - 1 && table[i+1][j] % 2 == 1){
                        table[i+1][j]++;
                        anss[count-1] = String.valueOf(i+1)+" "+String.valueOf(j+1)+" "+String.valueOf(i+2)+" "+String.valueOf(j+1);
                    }else if(j < w - 1 && table[i][j+1] % 2 == 1){
                        table[i][j+1]++;
                        anss[count-1] = String.valueOf(i+1)+" "+String.valueOf(j+1)+" "+String.valueOf(i+1)+" "+String.valueOf(j+2);                        
                    }else if(i < h - 1){
                        table[i+1][j]++;
                        anss[count-1] = String.valueOf(i+1)+" "+String.valueOf(j+1)+" "+String.valueOf(i+2)+" "+String.valueOf(j+1);
                    }else if(j < w - 1){
                        table[i][j+1]++;
                        anss[count-1] = String.valueOf(i+1)+" "+String.valueOf(j+1)+" "+String.valueOf(i+1)+" "+String.valueOf(j+2);                        
                    }else{
                        count--;
                    }
                }
            }
        }
    }
/*
    int count = 0;
    String[] anss = new String[n*m];

    anss[count-1] = String.valueOf(j)+" "+String.valueOf(i-j)+" "+String.valueOf(j+1)+" "+String.valueOf(i-j);                           
    */
    System.out.println(count);
    for(int i = 0; i < count; i++){
        System.out.println(anss[i]);
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