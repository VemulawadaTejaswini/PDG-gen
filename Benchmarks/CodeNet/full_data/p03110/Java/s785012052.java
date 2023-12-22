import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int i,ans,n = nextInt();
    ans = 0;
    for(i=0;i<n;i++){
      double x = nextInt();
      string u = nextInt();
      if(u==BTC){
        x *= 380000;
      }
      ans += x;
    }
    System.out.println(ans);
  }
}
