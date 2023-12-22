import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    int s = S.length();
    String T = sc.next();
    int t = T.length();
    char c = T.charAt(0);
    int count = 0;
    String ans = "UNRESTORABLE";
    for(int i = s-1; i >= 0; i--){
      char d = S.charAt(i);
      if((d == c && count+1 == t) || (d == '?' && count+1 == t)){
        ans = S.substring(0,i) + T;
        ans = ans.replace("?", "a");
        break;
      }
      if(d == '?'){
        count++;
      }else{
        count = 0;
      }
    }
    System.out.println(ans);
  }
}