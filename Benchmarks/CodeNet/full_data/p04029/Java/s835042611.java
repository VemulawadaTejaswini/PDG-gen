import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.io.*;

class ChildrenCandies{
  public static void main(String args[]){
    try{
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      String str = br.readLine();
      int N = Integer.parseInt(str);
      int h = 0;
      while(N > 0){
        h = h + N;
        N--;
      }
      System.out.println(h);
    }catch(IOException e){
      System.out.println(e);
    }
  }
}
