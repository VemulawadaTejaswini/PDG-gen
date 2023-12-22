import java.lang.reflect.Array;
import java.util.*;

public class Main {

    static int MOD = 1000000007;


    public static void main(String[] args) {

        //int ans=Integer.MAX_VALUE;
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int k=sc.nextInt();
        long[] h = new long[n];
        for(int i=0;i<n;i++)h[i]=sc.nextLong();
        Arrays.sort(h);
        for(int i=0;i<k&&i<n;i++){
            h[n-i-1]=0;
        }
        long ans=0;
        for(int i=0;i<n;i++)ans+=h[i];

        System.out.println(ans);


    }


}
