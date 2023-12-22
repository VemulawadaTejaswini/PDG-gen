import java.util.*;
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
        int[] a=new int[n+2];
        for (int i = 1; i <= n; i++) {
            a[i]=sc.nextInt();
        }
        int t=0;
        for (int i = 1; i <=1+n; i++) {
            t+=abs(a[i]-a[i-1]);
        }
        for (int i = 1; i <= n; i++) {
            int ans=0;
            if((a[i]-a[i-1])*(a[i+1]-a[i])>0)ans=t;
            if((a[i]-a[i-1])*(a[i+1]-a[i])<0)ans=t-abs(a[i]-a[i-1])-abs(a[i+1]-a[i])+abs(a[i+1]-a[i-1]);
            else ans=t;
            out.println(ans);
        }
    }
}