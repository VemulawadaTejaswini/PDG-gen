import java.util.*;

public class Main {

    static final int MOD=1000000007;


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int a = sc.nextInt();
        int b=sc.nextInt();
        long ans = 1;

        for(int i=0;i<n;i++){
            ans*=2;
            ans%=MOD;

        }
        ans--;

        ans-=(com(n,a)%MOD+com(n,b)%MOD)%MOD;
        ans%=MOD;
        if(ans<0)ans+=MOD;
        System.out.println(ans);


    }


    static long com(int n,int k){
        long ans=1;
        k= Math.min(n-k,k);
        for(int i=0;i<k;i++){
            ans=(ans*(n-i)/(i+1))%MOD;
        }
        return ans;
    }


}


