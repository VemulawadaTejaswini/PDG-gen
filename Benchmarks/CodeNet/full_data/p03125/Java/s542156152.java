import java.util.*;
import java.io.*;

public class Main{
  public static void main(String[] args) throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] s = br.readLine().split(" ");
    int a = Integer.parseInt(s[0]);
    int b = Integer.parseInt(s[1]);
    
    if(b % a == 0){
      System.out.println(a + b);
    }else{
      System.out.println(b - a);
    }
  }
}