import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        int x = sc.nextInt();
        
        int res = Math.abs(sc.nextInt()-x);
        
        for(int i = 1; i < n; i++){
            res=gcd(res, Math.abs(sc.nextInt()-x));
        }
        
        System.out.println(res);
    }
    
  static int gcd(int a, int b) {
    if (b == 0) return a;
    return gcd(b, a%b);
  }

}
