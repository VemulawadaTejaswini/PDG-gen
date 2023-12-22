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
    String s = sc.nextStr();

    int[] nums = new int[n];
    int bb = 0;

    for(int i = 0; i < n; i++){
      if(s.charAt(i) == '#'){//#が黒、#=黒=1とする
        nums[i] = 1;
        bb++;
      }else{
        nums[i] = 0;
      }
    }

    int mincolor = Math.min(bb, n - bb);
 
    int min = 1000000000;

    int[] blackcount = new int[n];//i以下にblackが何個あるか
    if(nums[0] == 1){
      blackcount[0] = 1;
    }else{
      blackcount[0] = 0;
    }
    for(int i = 1; i < n; i++){
      if(nums[i] == 1){
        blackcount[i] = blackcount[i - 1] + 1;
      }else{
        blackcount[i] = blackcount[i - 1];
      }
    }

    int[] whitecount = new int[n];//i以上にwhiteが何個あるか
    if(nums[n - 1] == 0){
      whitecount[n-1] = 1;
    }else{
      whitecount[n-1] = 0;
    }

    for(int i = n - 2; i >= 0; i--){
      if(nums[i] == 0){
        whitecount[i] = whitecount[i + 1] + 1;
      }else{
        whitecount[i] = whitecount[i + 1];
      }
    }

    int ans = 1000000000;

    for(int i = 0; i < n-1; i++){
      if(blackcount[i] + whitecount[i+1] < ans){
        ans = blackcount[i] + whitecount[i+1];
      }
    }

    if(ans == 1000000000){
      System.out.println(0);
    }else{
      System.out.println(Math.min(ans, mincolor));
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