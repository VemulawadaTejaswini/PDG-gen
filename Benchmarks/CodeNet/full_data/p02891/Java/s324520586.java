import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    char[] C = S.toCharArray();
    long N = Long.parseLong(sc.next());
    int s = S.length();
    int count = 0;
    Set<Character> set = new HashSet<>();
    for(int i = 1; i < s; i++){
      set.add(C[i]);
      if(C[i-1] == C[i]){
        C[i] = '-';
        count++;
      }
    }
    set.add(C[0]);
    boolean f = false;
    if(C[0] == C[s-1]){
      count++;
      f = true;
    }
    long ans = 0;
    if(set.size() == 1 && s > 2){
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
