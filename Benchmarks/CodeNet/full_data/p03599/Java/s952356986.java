import java.util.*;
import static java.lang.System.*;

class Main {
  public static final int MOD = 1000000007;
  public static final int INF = 1000000000;
  public static void main(String[] args) {
    Scanner sc = new Scanner(in);
    int A = sc.nextInt();
    int B = sc.nextInt();
    int C = sc.nextInt();
    int D = sc.nextInt();
    int E = sc.nextInt();
    int F = sc.nextInt();
    Set<Integer> setWater = new HashSet<Integer>();
    Set<Integer> setSuger = new HashSet<Integer>();
    for(int i=0; i<=F; i++){
      for(int j=0; j<=F; j++){
        int tmp = 100 * i * A + 100 * j * B;
        if(tmp <= F) setWater.add(tmp);
      }
    }
    for(int i=0; i<=F; i++){
      for(int j=0; j<=F; j++){
        int tmp = i * C + j * D;
        if(tmp <= F) setSuger.add(tmp);
      }
    }
    double max = 0;
    int ans = 0;
    int ansSuger = 0;
    for(int water : setWater){
      for(int suger : setSuger){
        if((double)water / 100 * E < suger) continue; 
        int tmp = water + suger;
        if(tmp > F) continue;
        double con = (double)suger / tmp;
        if(con > max){
          max = con;
          ans = tmp;
          ansSuger = suger;
        }
      }
    }
    out.println(ans + " " + ansSuger);
  }

  public static int gcd(int a, int b){
    if(b == 0) return a;
    return gcd(b, a%b);
  }
}