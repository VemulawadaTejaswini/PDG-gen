import java.util.*;

public class Main{
  public static void main(String[] args){
    
    Scanner sn = new Scanner(System.in);
    
    String a = sn.next();
    String b = sn.next();
    String c = sn.next();
    
    String ans = a.substring(0,1) + b.substring(0,1) + c.substring(0,1);
    
    System.out.println(ans);
    
  }
}