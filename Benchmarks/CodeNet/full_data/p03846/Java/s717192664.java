import java.util.*;
import java.awt.geom.Point2D;
import java.awt.*;
import static java.lang.System.*;
import static java.lang.Math.*;
//Loopで使う文字列の長さは固定！
//intで大丈夫？オーバーフローしない？
//Loop回数は本当に10⁹以内になってる？Loopは回る？？
public class Main {
    public static void main(String[]$){
        Scanner sc = new Scanner(in);
        int mod=1000000007;
        int n=sc.nextInt();
        int[] a=new int[n];
        for (int i = 0; i < n; i++) {
            a[i]=sc.nextInt();
        }
        HashMap<Integer,Integer> map=new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(a[i],map.getOrDefault(a[i], 0)+1);
        }
        if((n%2==0&&map.get(0)!=null)||(n%2==1&&map.get(0)!=1)){
            out.println(0);
            exit(0);
        }
        for(int k:map.keySet()){
            if(k!=0&&map.get(k)!=2){
                out.println(0);
                exit(0);
            }
        }
        if(n%2==0){
            out.println(power(2,n/2)%mod);
        }else{
            out.println(power(2,(n-1)/2)%mod);
        }
    }
    static long power(long x,int n){
        long mod=1000000007;
        long ans=1;
        while (n>0) {
            if((n&1)==1){
                ans=(ans*x)%mod;
            }
            x=(x*x)%mod;
            n>>=1;
        }
        return ans;
    }
}