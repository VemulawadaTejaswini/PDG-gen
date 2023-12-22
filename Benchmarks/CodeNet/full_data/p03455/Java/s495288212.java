import java.util.*;
import java.io.*;

public class Main{
  public static void main(String args[]) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String str = br.readLine();
    String[] list = str.split(" ", 0);
    int c = Integer.parseInt(list[0]) * Integer.parseInt(list[1]);
    if(c%2==0){
      System.out.print("Even");
    }else{
      System.out.print("Odd");
    }
  }
}