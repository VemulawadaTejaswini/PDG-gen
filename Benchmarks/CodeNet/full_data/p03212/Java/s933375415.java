import java.util.*;
import static java.lang.System.*;

class Guidebook implements Comparable<Guidebook>{
  public String city;
  public int score;
  public int number;
  
  public int compareTo(Guidebook obj){
    if(this.city.equals(obj.city)){
      return obj.score - this.score;
    }else{
      return this.city.compareTo(obj.city);
    }
  }
}

class Main {
  public static final int MOD = 1000000007;
  public static final int INF = 1000000000;
  public static int ans = 0;
  public static int N;
  public static void main(String[] args) {
    Scanner sc = new Scanner(in);
    N = sc.nextInt();
    cal("3"); cal("5"); cal("7");
    out.println(ans);
  }
  
  public static void cal(String S){
    if(Long.parseLong(S) > N) return;
    if(S.contains("3") && S.contains("5") && S.contains("7") ) ans++;
    cal(S + "3");
    cal(S + "5");
    cal(S + "7");
  }

  public static int gcd(int a, int b){
    if(b == 0) return a;
    return gcd(b, a%b);
  }
}

