import java.util.Arrays;
import java.util.*;
public class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
      String s = sc.next();
      String ans = "No";
      if(s.charAt(2)==s.charAt(3)&&s.charAt(4)==s.charAt(5)){
        ans = "Yes";
      }
      System.out.println(ans);
      
    }
}
