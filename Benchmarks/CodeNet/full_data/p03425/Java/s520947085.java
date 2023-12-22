import java.util.*;
import static java.lang.System.*;

class Main {
  public static final int MOD = 1000000007;
  public static final int INF = 1000000000;
  public static void main(String[] args) {
    Scanner sc = new Scanner(in);
    int N = sc.nextInt();
    String S[] = new String[N];
    Integer march[] = new Integer[5];
    Arrays.fill(march, 0);
    for(int i=0; i<N; i++){
      S[i] = sc.next();
      if(S[i].charAt(0) == 'M') march[0]++;
      if(S[i].charAt(0) == 'A') march[1]++;
      if(S[i].charAt(0) == 'R') march[2]++;
      if(S[i].charAt(0) == 'C') march[3]++;
      if(S[i].charAt(0) == 'H') march[4]++;
    }
    long ans = 0;
    for(int i=0; i<5; i++){
      for(int j=i+1; j<5; j++){
        for(int k=j+1; k<5; k++){
          ans += (long)march[i] * march[j] * march[k];
        }
      }
    }
    out.println(ans);
    
  }

  public static int gcd(int a, int b){
    if(b == 0) return a;
    return gcd(b, a%b);
  }
}