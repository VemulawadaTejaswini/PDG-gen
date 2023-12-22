import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int x = Integer.parseInt(sc.next());
    int y = Integer.parseInt(sc.next());
    
    int a = 0;
    int b = 0;
    int u = 0;
    int v = 0;
    int ai = 0;
    int aj = 0;
    boolean flg = false;
    long ans = 0;
    int k = 0;
    
    long mod = 1000000007;
    //long dp[][] = new long[x+2][y+2];
    
    if((x+y)%3 == 0){
      k = (x+y)/3;
    } else {
      System.out.println("0");
      return;
    }
    
    for(int i=0; i<x; i++){
      u = 2*i;
      v = i;
      if(u==x-(k-i) && v==y-2*(k-i)){
        flg = true;
        ai = i;
        aj = k-i;
      }
      if(flg) break;
    }
    
    if(ai < 0 || aj < 0){
      System.out.println("0");
      return;
    }
    
    //System.out.println(ai + " " + aj);
    
    // 666666C333333
    
    long bunsi = 1;
    long bunbo = 1;
    
    long fact[] = new long[666667];
    
    for(int i=ai+aj; i>=1; i--){
      bunsi *= i / mod;
    }
    for(int i=aj; i>=1; i--){
      bunbo *= i / mod;
    }
    
    System.out.println(bunsi/bunbo);
    
  }
  
  /*
  public long rec(int i, int j, dp){
    if(dp[i][j] > 0){
      return dp[i][j];
    }
    long ret = 0;

    return ret;
  }
  */
  
}
