import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    String s = sc.next();
    String t = sc.next();
    String ss[] = s.split("");
    String tt[] = t.split("");
    Arrays.sort(ss);
    Arrays.sort(tt);
    s = String.join("",ss);
    t = String.join("",tt);
    int n = Math.min(s.length(),t.length());
    String ans = "No";
    int c = 0;
    for(int i = 1 ; i <= n ; ++i){
      if((int)s.charAt(0)<(int)t.charAt(t.length()-i)){
        ans = "Yes";
        break;
      }else if((int)s.charAt(0)==(int)t.charAt(t.length()-i)){
        c++;
      }
    }
    
    if(c==n && s.length()<t.length()) ans ="Yes";
    
    System.out.println(ans);

  }
}