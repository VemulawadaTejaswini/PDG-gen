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
    int[] nums = new int[n];
    for(int i = 0; i < n; i++){
      nums[i] = sc.nextInt();
    } 

    Arrays.sort(nums);
    int ans = 0; 

    for(int i = 0; i < n-2; i++){
      for(int j = i + 1; j < n-1; j++){
        int a = nums[i];
        int b = nums[j];
        //nums[k] < a + b <= nums[k+1]となるkを二分探索で見つけたい
        //3つ目の辺として選べるのは上記を満たすkを使ってb+1,b+2,,,kということになる
        if(a + b <= nums[j+1]){
          continue;
        }else if(a + b > nums[n-1]){
          ans += n - j - 1;
          continue;
        }
        int left = j + 1;
        int right = n - 1;
        while(true){
          int center = (left + right) / 2;
          if(nums[center] < a + b && a + b <= nums[center + 1]){
            ans += center - j;
            break;
          }else if(nums[center] >= a + b){
            right = center;
          }else{
            left = center;
          }
        }
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