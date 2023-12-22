import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    int ans = 0;
    ans += 9*(S.length()-1);
    ans += S.charAt(0)-'1';
    System.out.println(ans);
  }
}