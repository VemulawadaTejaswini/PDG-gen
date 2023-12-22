import java.util.*;

public class Main{
  public static void main{
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    String t = sc.next();

    s += s;

    if(s.contains(t)){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
  }
}