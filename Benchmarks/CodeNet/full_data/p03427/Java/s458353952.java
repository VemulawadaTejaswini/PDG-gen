import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    int s = S.length();
    
    String T = "";
    for(int i = 0; i < s; i++){
      if(i == 0){
        T = T+String.valueOf(S.charAt(0));
      }else{
        T = T + "9";
      }
    }
    
    long a = Long.parseLong(S);
    long b = Long.parseLong(T);
    int ans = 0;
    if(a > b){
      ans += 9*(s-1);
      ans += S.charAt(0)-'1';
    }else{
      ans += 9*(s-1);
      ans += S.charAt(0)-'0';
    }
    System.out.println(ans);
  }
}