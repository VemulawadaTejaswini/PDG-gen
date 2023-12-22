import java.util.*;
import java.io.*;

public class Main{
  public static void main(String[] args) throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] s = br.readLine().split("/");
    
    if(Integer.parseInt(s[1]) <= 4){
      System.out.println("Heisei");
    }else{
      System.out.println("TBD");
    }
  }
}