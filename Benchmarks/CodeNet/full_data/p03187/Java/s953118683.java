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
 
 
    int len = sc.nextInt();
    int n = sc.nextInt();

    int[] nums = new int[n];
    boolean[] check = new boolean[n];
    for(int i = 0 ; i < n; i++){
      nums[i] = sc.nextInt();
      check[i] = true;
    }

    long ans0 = nums[0];
    int nowindex = 0;
    check[0] = false;

    // System.out.println("ans0");


    for(int count = 0; count < n - 1; count++){
      int largeindex = 0;
      int smallindex = 0;
      for(int i = nowindex + 1; i < 5000; i++){
        if(check[i % n]){
          largeindex = i % n;
          break;
        }
      }
      for(int i = nowindex + n * 2 - 1; i > 0; i--){
        if(check[i % n]){
          smallindex = i % n;
          break;
        }
      }

      int largelen = 0;
      int smalllen = 0;
      if(nums[nowindex] < nums[largeindex]){
        largelen = nums[largeindex] - nums[nowindex];
      }else{
        largelen = nums[largeindex] + len - nums[nowindex];
      }
      if(nums[nowindex] > nums[smallindex]){
        smalllen = nums[nowindex] - nums[smallindex];
      }else{
        smalllen = nums[nowindex] + len - nums[smallindex];
      }
      if(largelen > smalllen){
        check[largeindex] = false;
        nowindex = largeindex;
        ans0 += largelen;
      }else{
        check[smallindex] = false;
        nowindex = smallindex;
        ans0 += smalllen;
      }
      // System.out.print("go to ");
      // System.out.println(nowindex);
      // System.out.println(ans0);

    }


    // System.out.println("ansl");


    for(int i = 0 ; i < n; i++){
      check[i] = true;
    }

    long ansl = len - nums[n-1];
    nowindex = n - 1;
    check[n-1] = false;

    for(int count = 0; count < n - 1; count++){
      int largeindex = 0;
      int smallindex = 0;
      for(int i = nowindex + 1; i < 5000; i++){
        if(check[i % n]){
          largeindex = i % n;
          break;
        }
      }
      for(int i = nowindex + n * 2 - 1; i > 0; i--){
        if(check[i % n]){
          smallindex = i % n;
          break;
        }
      }

      int largelen = 0;
      int smalllen = 0;
      if(nums[nowindex] < nums[largeindex]){
        largelen = nums[largeindex] - nums[nowindex];
      }else{
        largelen = nums[largeindex] + len - nums[nowindex];
      }
      if(nums[nowindex] > nums[smallindex]){
        smalllen = nums[nowindex] - nums[smallindex];
      }else{
        smalllen = nums[nowindex] + len - nums[smallindex];
      }
      if(largelen > smalllen){
        check[largeindex] = false;
        nowindex = largeindex;
        ansl += largelen;
      }else{
        check[smallindex] = false;
        nowindex = smallindex;
        ansl += smalllen;
      }

      // System.out.print("go to ");
      // System.out.println(nowindex);
      // System.out.println(ansl);

    }
  
    if(ans0 > ansl){
      System.out.println(ans0);
    }else{
      System.out.println(ansl);
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