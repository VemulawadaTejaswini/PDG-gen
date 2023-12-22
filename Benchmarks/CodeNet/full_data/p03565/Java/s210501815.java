import java.util.*;
import static java.lang.System.*;

class Main {
  public static final int MOD = 1000000007;
  public static final int INF = 1000000000;
  public static void main(String[] args) {
    Scanner sc = new Scanner(in);
    String S = sc.next();
    String T = sc.next();
    char[] S2 = S.toCharArray();
    char[] T2 = T.toCharArray();
    boolean check2 = false;
    for(int i=S2.length-1; i>=0; i--){
      int k = i;
      int j = T2.length-1;
      boolean check = false;
      if(check2 == true){
        if(S2[i] == '?') S2[i] = 'a';
        continue;
      }
      while(j >= 0 && k >= 0 && (S2[k] == T2[j] || S2[k] == '?')){
        if(j == 0){
          check = true;
          check2 = true;
          j = T2.length-1;
          while(j >= 0){
            S2[i] = T2[j];
            j--;
            i--;
          }
          i++;
        }
        j--;
        k--;
      }
      if(check == false){
        if(S2[i] == '?') S2[i] = 'a';
      }
    }
    if(check2 == true) out.println(S2);
    else out.println("UNRESTORABLE");
    
      
       
  }

  public static int gcd(int a, int b){
    if(b == 0) return a;
    return gcd(b, a%b);
  }
}