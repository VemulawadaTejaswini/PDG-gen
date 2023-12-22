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
  public static void main(String[] args) {
    Scanner sc = new Scanner(in);
    int N = sc.nextInt();
    int M = sc.nextInt();
    int s[] = new int[M];
    for(int i=0; i<M; i++){
      int k = sc.nextInt();
      for(int j=0; j<k; j++){
        int a = sc.nextInt();
        s[i] += 1 << (a-1);
      }
    }
    int p[] = new int[M];
    for(int i=0; i<M; i++) p[i] = sc.nextInt();
    int ans = 0;
    for(int i=0; i<(1<<N); i++){
      boolean check = true;
      for(int j=0; j<M; j++){
        int tmp = i & s[j];
        int cnt = 0;
        while(tmp > 0){
          if((tmp & 1) == 1) cnt++;
          tmp >>= 1;
        }
        if(cnt % 2 != p[j]){
          check = false;
          break;
        }
      }
      if(check == true) ans++;
    }
    out.println(ans);
      
  }

  public static int gcd(int a, int b){
    if(b == 0) return a;
    return gcd(b, a%b);
  }
}

