import java.lang.reflect.Array;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        long ans = 0;
        long x = sc.nextLong();
        long y = sc.nextLong();

        if(x<0)ans++;
        if(y<0)ans++;
        ans+=Math.abs(Math.abs(x)-Math.abs(y));
        if(Math.abs(x)==Math.abs(y))ans=1;

        System.out.println(ans);

    }
}


