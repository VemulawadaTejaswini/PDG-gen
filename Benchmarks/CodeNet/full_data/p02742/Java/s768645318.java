import java.util.*;

public class Main {

    static final int MOD=1000000007;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        long h = sc.nextLong();
        long w = sc.nextLong();
        long ans = h*w;
        if(h*w%2==1)ans=ans/2+1;
        else ans = ans/2;
        System.out.println(ans);
    }
}