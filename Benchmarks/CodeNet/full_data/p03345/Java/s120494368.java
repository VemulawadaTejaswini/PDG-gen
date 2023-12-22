import java.util.*;
import java.io.*;

public class Main{
  public static void main(String[] args) {
    try {
      Scanner sc = new Scanner(System.in);
      long a, b, c, k;

      a=Long.parseLong(sc.next());
      b=Long.parseLong(sc.next());
      c=Long.parseLong(sc.next());
      k=Long.parseLong(sc.next());

      long res=a-b;

      if(k/2==0){
        System.out.println(res);
      }else if(k/2==1){
        System.out.println(-res);
      }
    }
    catch (Exception e) {
      System.out.println("Unfair");
    }
  }
}
