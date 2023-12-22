import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int mod = 1000000007;
    int n = sc.nextInt();
    int m = sc.nextInt();
    int ba = 0;
    long ans = 1;
    for (int i = 0;i<m;i++){
      int ca = sc.nextInt();
      if (ba == ca){
        ans = 0;
        break;
      }
      int steps = ca - ba -1;
      ans = ans*stepcalc(0,steps)%mod;
      ba = ca+1;
      //System.out.println(ans);
    }
    sc.close();
    int steps = n-ba;
    ans *= stepcalc(0,steps);
    System.out.println(ans%mod);
  }
  public static long stepcalc(int n,int m){
    if (n == m){
      return 1;
    }else if (n+1 == m){
      return 1;
    }else if (n+2 == m){
      return 2;
    }else{
      return stepcalc(n+1,m) + stepcalc(n+2,m);
    }
  }
}