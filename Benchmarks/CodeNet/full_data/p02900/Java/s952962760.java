import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long A = sc.nextLong();
    long B = sc.nextLong();
	long gcd = GCD(A,B);
    
    long max = (long)Math.sqrt((double)gcd);
    long ans = 0;
    for(long i=2;i<=max;i++){
      long a = 0;
      
      while(gcd%(Math.pow(i,a))==0){
        a++;
      }
      gcd /= Math.pow(i,a-1);
      if (a!=1){
        ans++;
      }
    }
    //最後にGCD自体が素数でないかチェック
    if(ans==0&&gcd!=1){ans=1;}
    System.out.println(ans+1);
  }
  public static long GCD(long a,long b){
    if(b==0){return a;}
    else{return GCD(b,a%b);}
  }
}
    