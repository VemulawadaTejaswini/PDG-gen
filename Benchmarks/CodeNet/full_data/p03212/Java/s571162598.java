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
        int n=sc.nextInt();
        if(n<357){
            out.println(0);
        }else{
            int ans=0;
            int c=String.valueOf(n).length();
            for (int i = 3; i <=c ; i++) {
                long m=power(3,i);
                for (int j = 0; j < m; j++) {
                    String s=Integer.toString(j, 3);
                    int l=i-s.length();
                    for (int k = 0; k < l; k++) {
                        s="0"+s;
                    }
                    s=s.replaceAll("0", "3");
                    s=s.replaceAll("1", "5");
                    s=s.replaceAll("2", "7");
                    int k=Integer.parseInt(s);
                    //out.println("s="+s+"  k="+k+"  judge="+(k<=n&&f(s)));
                    if(k<=n&&f(s))ans++;
                }
            }
            out.println(ans);
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
    //最大公約数
    static int gcd (int a, int b) {
        int temp;
        while((temp = a%b)!=0) {
            a = b;
            b = temp;
        }
        return b;
    }
//※最小公倍数はa*b/gcd(a,b)である
    static boolean f(String s){
        int k=s.length();
        int c3=0,c5=0,c7=0;
        for (int i = 0; i < k; i++) {
            char p=s.charAt(i);
            if(p=='3')c3++;
            else if(p=='5')c5++;
            else if(p=='7')c7++;
        }
        return(c3*c5*c7>0&&c3+c5+c7==k);
    }
}
