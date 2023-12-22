import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    String ans = "Yes";
    if(s.equals("AAA")||s.equals("BBB")){
      ans = "No";
    }
    System.out.println(ans);
  }
}