import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int N = Integer.parseInt(sc.nextLine());
    String S = sc.next();
    boolean[] b = new boolean[26];
    
    int ans = 0;
    for(int i = 1; i <= N; i++){
      String s1 = new String(S.substring(0, i));
      String s2 = new String(S.substring(i, N));
      for(int j = 0; j < s1.length(); j++){
        char c = s1.charAt(j);
        b[c-'a'] = true;
      }
      
      int count = 0;
      for(int j = 0; j < s2.length(); j++){
        char c = s2.charAt(j);
        if(b[c-'a']){
          count++;
          b[c-'a'] = false;
        }
      }
      ans = ans < count ? count : ans;
    }    
    System.out.println(ans);
  }
}