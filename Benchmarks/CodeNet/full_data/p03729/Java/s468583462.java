import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    String a = sc.next();
    String b = sc.next();
    String c = sc.next();
    
    aLast = a.substring(a.length() - 1);
    bFirst = b.substring(0, 1);
    bLast = b.substring(b.length() - 1);
    cFirst = c.substring(0, 1);
    
    if (aLast.equals(bFirst) && bLast.equals(cFirst)) {
      System.out.println("YES");
    } else {
      System.out.println("NO");
    }
  }
}