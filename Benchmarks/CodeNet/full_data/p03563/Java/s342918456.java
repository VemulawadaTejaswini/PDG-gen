import java.util.*;
public class  Scratch {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        System.out.println((n+a)/2);
       
    }

    public static boolean prime(int n) {
        if (n <= 1) return false;
        if (n == 2) return true;
        if (n % 2 == 0) return false;
        int m = (int) Math.sqrt(n);
        for (int i = 3; i <= m; i += 2) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public boolean[] sieve(int n) {
        boolean[] prime = new boolean[n + 1];
        Arrays.fill(prime, true);
        prime[0] = false;
        prime[1] = false;
        int m = (int) Math.sqrt(n);
        for (int i = 2; i <= m; i++)
            if (prime[i])
                for (int j = i * i; i <= n; j += i) {
                    prime[j] = false;
                }
        return prime;
    }

    public static int _gcd(int a, int b) {
     if (b==0)return a;
     return _gcd(b,a%b);
    }
    public static int _LCM(int a,int b){
        return a*b/_gcd(a,b);
    }
    public  static  int toDecimal(int n,int b){
        int multiplier = 1;
        int result=0;
        while (n>0){
            result+=n%(10*multiplier);
            multiplier=b;
            n/=10;
        }
        return result;
    }
    public static List toBinary(int n){
        List<Integer>view = new ArrayList<>();
        int multiplier=2;
        while (n>0){
            view.add(n%2);
            n/=2;
        }
        return view;
    }
}








