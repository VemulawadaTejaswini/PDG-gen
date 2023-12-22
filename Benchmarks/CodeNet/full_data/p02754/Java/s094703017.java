import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long n = sc.nextLong();
    long a = sc.nextLong();
    long b = sc.nextLong();
if (a+b== 0){
    System.out.println(0);

  return;
}
    long ans = 0;
    long mod = 0;
    ans = n / (a+b);
    mod = n % (a+b);
    ans=ans * a;
    if (mod <= a) {
    	ans+=mod;
    } else{
    	ans+=a;
    }
    System.out.println(ans);
  }
}


