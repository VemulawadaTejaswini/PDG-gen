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
    int[] nums = new int[n+1];

    int notzerocount = 0;

    for(int i = n; i >= 0; i--){
      int inp = sc.nextInt();
      if(inp > 0){
        nums[notzerocount] = inp;
      }else if(inp < 0){
        nums[notzerocount] = inp * -1;
      }
      notzerocount++;
    }

    int allgcd = nums[0];
    for(int i = 1; i < notzerocount; i++){
      allgcd = gcd(allgcd, nums[i]);
    }


    boolean rootcheck = false;
    //素数で割れるかチェック
    for(int i = 2; i * i <= allgcd; i++){
      if(allgcd % i == 0){
        rootcheck = true;
      }
    }

    if(rootcheck){//普通に素数でわれた場合
      int modsum = 0;
      for(int i = 0; i < notzerocount; i++){
        modsum += (nums[i] / allgcd) % 2;
      }
      if(modsum % 2 == 0 || allgcd % 2 == 0){
        System.out.println(2);
      }

      int ind = (int)Math.sqrt(allgcd + 2);
      boolean[] furui = new boolean[ind];
      for(int i = 0; i < ind; i++){
        furui[i] = true;
      }
      furui[0] = false;
      furui[1] = false;

      for(int i = 2; i < ind; i++){
        if(furui[i]){
          for(int j = 2; i * j < ind; j++){
            furui[i * j] = false;
          }
        }
      }

      for(int i = 3; i < ind; i++){
        if(furui[i] && allgcd % i == 0){
          System.out.println(i);
        }
      }

    }else{//最大公約数が素数なら、それのみだ
      if(allgcd > 1){
        System.out.println(allgcd);
      }
    }

  }

 
  private static int gcd(int m, int n) {
    if(m < n) return gcd(n, m);
    if(n == 0) return m;
    return gcd(n, m % n);
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