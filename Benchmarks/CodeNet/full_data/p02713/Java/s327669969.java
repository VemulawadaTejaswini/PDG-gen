import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        int k = in.nextInt();
        long ans = 0;
        for(int i=1;i<=k;++i){
            for(int j=1;j<=k;++j){
                for(int l=1;l<=k;++l){
                    int a = gcd(i,j);
                    int b  = gcd(a,l);
                    ans+=b;
                }
            }
        }
        System.out.println(ans);
    }
    public static int gcd(int a,int b){
        if(a==0)return b;
        return gcd(b%a,a);
    }
}
