import java.util.*;

class Main {
  public static final long MOD = 1000000007;
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    String S = sc.next();
    char[] charS = S.toCharArray();
    Integer east[] = new Integer[N];
    Integer west[] = new Integer[N];
    int count = 0;
    for(int i=0; i<N; i++){
      if(charS[i] == 'W') count++;
      west[i] = count;
    }
    count = 0;
    for(int i=N-1; i>=0; i--){
      if(charS[i] == 'E') count++;
      east[i] = count;
    }
    int ans;
    ans = west[N-2];
    ans = Math.min(ans, east[1]);
    for(int i=1; i<N-1; i++){
      ans = Math.min(ans, west[i-1]+east[i+1]);
    }
    System.out.println(ans);
    
  }

  public static int gcd(int a, int b){
    if(b == 0) return a;
    return gcd(b, a%b);
  }
}