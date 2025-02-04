import java.util.*;
import static java.lang.System.*;
import static java.lang.Integer.*;

class Main {
  public static final int MOD = 1000000007;
  public static final int INF = 1000000000;
  public static void main(String[] args) {
    Scanner sc = new Scanner(in);
    int N = parseInt(sc.next());
    int x[] = new int[N];
    int y[] = new int[N];
    int h[] = new int[N];
    for(int i=0; i<N; i++){
      x[i] = parseInt(sc.next());
      y[i] = parseInt(sc.next());
      h[i] = parseInt(sc.next());
    }
    boolean check = true;
    for(int i=0; i<=100; i++){
      for(int w=0; w<=100; w++){
        check = true;
        int tmp = 0;
        for(int k=0; k<N; k++){
          if(h[k] != 0) tmp = h[k] + Math.abs(x[k] - i) + Math.abs(y[k] - w);
        }
        for(int j=0; j<N; j++){
          if(h[j] != Math.max(tmp - Math.abs(x[j] - i) - Math.abs(y[j] - w), 0) ){
            check = false;
            break;
          }
        }
        if(check == true){
          out.println(i + " " + w + " " + tmp);
          break;
        }
      }
      if(check == true) break;
    }   
  }

  public static int gcd(int a, int b){
    if(b == 0) return a;
    return gcd(b, a%b);
  }
}