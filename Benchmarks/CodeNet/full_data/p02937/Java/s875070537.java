import jav.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    String t = sc.next();
    int N = s.length();
    int M = t.length();
    int[] at = new int[26];
    Arrays.fill(at, N + 1);
    for(int i = N - 1; i >= 0; i--){
      at[s.charAt(i) - 'a'] = i + 1;
    }
    boolean[] isTurn = new boolean[M];
    for(int i = 0; i < M - 1; i++){
      if(at[t.charAt(i) - 'a'] == N + 1){
        System.out.println(-1);
        return;
      }
      if(at[t.charAt(i) - 'a'] >= at[t.cahrAt(i + 1) - 'a']){
        isTurn[i + 1] = true;
      }
    }
    if(at[t.charAt(M - 1) - 'a'] == N + 1){
      System.out.println(-1);
      return;
    }
    long ans = 0;
    ans += at[t.charAt(0) - 'a'];
    for(int i = 1; i < M; i++){
      if(!isTurn[i]){
        ans += at[t.charAt(i) - 'a'] - at[t.cahrAt(i - 1) - 'a'];
      } else {
        ans += N + at[t.cahrAt(i) - 'a'];
      }
    }
    System.out.println(ans);
  }
}
