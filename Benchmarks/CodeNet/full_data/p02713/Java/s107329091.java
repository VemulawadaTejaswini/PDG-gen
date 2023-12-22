import java.util.*;
class Main{
  public static int gcd(int a, int b){
    if(b > a)
      return gcd(b,a);
    else if(b == 0)
      return a;
    else
      return gcd(b, a%b);
  }
  public static int gcd3(int a, int b, int c){
    return gcd(gcd(a, b), c);
  }
  
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int k = sc.nextInt();
    int ans = 0;
    
    for(int i=1;i<=k;i++){
      for(int j=1;j<=k;j++){
        for(int l=1;l<=k;l++){
          ans += gcd3(i,j,l);
        }
      }
    }
    System.out.println(ans);    
  }
}