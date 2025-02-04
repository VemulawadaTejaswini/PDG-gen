import java.util.*;
import java.io.*;

public class Main{
  public static void main(String[] args) {
    try(BufferedReader in = new BufferedReader(new InputStreamReader(System.in))){
      int n = Integer.parseInt(in.readLine());
      int max = -1;
      int min = 1001;
      for(String s: in.readLine().split(" ")){
        int a = Integer.parseInt(s);
        if(a>max){
          max=a;
        }
        if(a<min){
          min=a;
        }
      }
      System.out.println(max-min);
    }catch(IOException e){
      e.printStackTrace();
    }
  }
}
