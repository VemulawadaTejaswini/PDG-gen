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
    for(int i = 0; i < n; i++){
      if(s.charAt(i) == '#'){//#が黒、#=黒=1とする
        nums[i] = 1;
      }else{
        nums[i] = 0;
      }
    }

    int ans = 0;
 
    for(int i = 0; i < n-1; i++){
      if(nums[i] == 1 && nums[i + 1] == 0){
        int blackcount = 0;
        int whitecount = 0;
        for(int j = i; j >= 0; j--){
          if(nums[j] == 1){
            blackcount++;
          }else{
            break;
          }
        }
        for(int j = i+1; j < n; j++){
          if(nums[j] == 0){
            whitecount++;
          }else{
            break;
          }
        }

        if(blackcount < whitecount){
          ans += blackcount;
          for(int j = i; j >= 0; j--){
            if(nums[i] == 1){
              nums[i] = 0;
            }else{
              break;
            }
          }
        }else{
          ans += whitecount;
          for(int j = i+1; j < n; j++){
            if(nums[i] == 0){
              nums[i] = 1;
            }else{
              break;
            }
          }
        }

      }
    }

    System.out.println(ans);

 
  }
 
 //ここからテンプレ


  //110000001100000

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