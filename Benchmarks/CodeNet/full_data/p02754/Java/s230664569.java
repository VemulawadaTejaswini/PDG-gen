import java.util.*;

public class Main {

    static final int MOD=1000000007;


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long a = sc.nextLong();
        long b = sc.nextLong();
        long sum = a+b;
        long ans = 0;
        long temp = n/sum;
        ans += temp*a;
        n-=temp*sum;
        ans+=Math.min(n,a);
        System.out.println(ans);



    }
}


