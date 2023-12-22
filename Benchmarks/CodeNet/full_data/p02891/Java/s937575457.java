import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    char[] C = S.toCharArray();
    long N = Long.parseLong(sc.next());
    int s = S.length();
    int count = 0;
    for(int i = 1; i < s; i++){
      if(C[i-1] == C[i]){
        C[i] = '-';
        count++;
      }
    }
    boolean f = false;
    if(C[0] == C[s-1]){
      count++;
      f = true;
    }
    long ans = 0;
    if(count == s-1){
      if(N%2==0){
        ans = count*(N/2) + (count-1)*(N/2);
      }else{
        ans = count*(N/2) + (count-1)*((N/2)+1);
      }
    }else{
      ans = count * N;
      if(f){
        ans--;
      }
    }
    
    
    if(s == 1){
      ans = N/2;
    }
    System.out.println(ans);
  }
}
