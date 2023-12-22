import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    int s = S.length();
    int ans = 0;
    if(s > 1){
      ans += 9*(s-1);
      ans += S.charAt(0)-'1';
    }else{
      ans += S.charAt(0)-'0';
    }
    System.out.println(ans);
  }
}