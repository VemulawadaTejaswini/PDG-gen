import java.util.*;
import static java.lang.System.*;

class Main {
  public static final int MOD = 1000000007;
  public static final int INF = 1000000000;
  public static void main(String[] args) {
    Scanner sc = new Scanner(in);
    int N = sc.nextInt();
    int Y = sc.nextInt();
    int x,y,z;
    int tmp;
    String ans = "-1 -1 -1";
    boolean check = true;
    for(x=0; x<=N; x++){
      if(check == false) break;
      for(y=0; y<=N-x; y++){
        z = N-x-y;
        tmp = 10000*x + 5000*y + 1000*z;
        if(tmp == Y){
          ans = x + " " + y + " " + z;
          check = false;
          break;
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