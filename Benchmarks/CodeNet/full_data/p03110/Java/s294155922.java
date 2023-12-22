import java.util.*;
 
 
class Main {
  static long gcd (long a, long b) {
    return b>0?gcd(b,a%b):a;
  }
  
  public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        double ans = 0;
        for(int i=0;i<N;i++){
          double value = sc.nextDouble();
          String S = sc.next();
          if (S.equals("JPY")){
            ans += value;
          }else{
            ans += value*380000.0;
          }
        }
        System.out.println(String.format("%.15f", ans));
      }
    
}