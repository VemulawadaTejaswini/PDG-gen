import java.util.*;
class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    
    String a = sc.next();
    String b = sc.next();
    
    String a1 = a.substring(0,1);
    String a2 = a.substring(1,2);
    String a3 = a.substring(2,3);
    
    String b1 = b.substring(0,1);
    String b2 = b.substring(1,2);
    String b3 = b.substring(2,3);
    
    int count = 0;
    
    if(a1.equals(b1)){
      count++;
    }
    if(a2.equals(b2)){
      count++;
    }
    if(a3.equals(b3)){
      count++;
    }
    System.out.println(count);
  }
}