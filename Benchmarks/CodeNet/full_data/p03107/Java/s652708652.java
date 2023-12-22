import java.io.*;
import java.util.*;

public class Main{
  public static void main(String[] args){
    try {
      Scanner sc = new Scanner(System.in);
      String s;
      s=sc.next();
      int a=0, b=0;

      for(int i=0; i<s.length(); i++){
        if(s.charAt(i)=='0'){
          a++;
        }else{
          b++;
        }
      }

      System.out.println(Math.min(a, b)*2);
    
      }catch (Exception e) {
      System.out.println("out");
    }
  }
}
