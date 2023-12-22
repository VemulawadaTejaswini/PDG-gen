import java.lang.reflect.Array;
import java.util.*;

public class Main {

    static int MOD = 1000000007;


    public static void main(String[] args) {

        //int ans=Integer.MAX_VALUE;
        Scanner sc = new Scanner(System.in);
        long h=sc.nextLong();
        long ans=solve(h);

        System.out.println(ans);

    }

    private static long solve(long n){
        if(n==1)return 1;
        return 1+solve(n/2)*2;
    }


}
