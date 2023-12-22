import java.util.*;

public class Main {

    static int MOD = 1000000007;
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        long n=sc.nextLong(),m=sc.nextLong();
        long ans=0;
        ans += Math.min(n,m/2);
        n=n-ans;
        m=m-ans*2;
        ans+= m/4;
        System.out.println(ans);

    }

}
