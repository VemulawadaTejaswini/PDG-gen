import java.util.*;
 
class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    
    String s = sc.next();
    
    int sLength = s.length();
    String s1 = s.substring(0, 1);
    String s2 = s.substring(sLength - 1, sLength);
    
    String num = String.valueOf(sLength - 2);
    
    String ans = s1 + num + s2;
    
    System.out.println(ans);
    
  }
}