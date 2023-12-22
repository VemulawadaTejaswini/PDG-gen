import java.io.*;
import java.util.*;

public class Main{
  public static void main(String[] args){
    try {
      Scanner sc = new Scanner(System.in);
      int x, y;
      x=Integer.parseInt(sc.next());
      y=Integer.parseInt(sc.next());

      System.out.println(x+y/2);
      
      }catch (Exception e) {
      System.out.println("out");
    }
  }
}
