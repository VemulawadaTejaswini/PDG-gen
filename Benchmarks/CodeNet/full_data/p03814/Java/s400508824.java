import java.util.*;
class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    
    String s = sc.next();
    
    int a = s.indexOf("A");
    int z = s.lastIndexOf("Z");
    
    System.out.println(z-a+1);
  }
}