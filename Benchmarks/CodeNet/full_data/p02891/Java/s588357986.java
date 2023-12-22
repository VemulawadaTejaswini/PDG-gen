import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    char[] C = S.toCharArray();
    long N = Long.parseLong(sc.next());
    int s = S.length();
    Set<Character> set = new HashSet<>();
    long ans = 0;
    if(s == 1){
      ans = N/2;
    }else if(s == 2){
      if(S.charAt(0) == S.charAt(1)){
        ans = N;
      }
    }else{
      int count = 0;
      boolean flag = false;
      set.add(C[0]);
      for(int i = 1; i < s; i++){
        set.add(C[i]);
        if(C[i-1] == C[i]){
          C[i] = '-';
          flag = true;
          count++;
        }
      }
      if(set.size() == 1 && s%2 == 1){
        if(N%2 == 0){
          ans = s * (N/2);
        }else{
          ans = ((s/2)+1)*(N/2)+(s/2)*((N/2)+1);
        }
      }else{
        if(C[0] == C[s-1]){
          ans = (count+1)*N-1;
        }else{
          ans = count*N;
        }
      }
    }
    System.out.println(ans);
  }
}
