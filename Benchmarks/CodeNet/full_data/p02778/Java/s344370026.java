import java.util.*;
import java.lang.Math;
 
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    String S = sc.next();
    
    String a = "";
    
    for (int i = 0; i < S.length(); i ++) {
      a += "x";
    }
    System.out.println(a);
  }
}