/*
String[]の初期化、整数の型がlongになっているか
関数（splitとかcontainsとか）内では"+"とかは正規表現となされるので"\\+"とする
配列のコピーはarr1=arr.clone()
HashSet<>[]はおのおの初期化した？？？？？
 */
import java.util.*;
import java.awt.*;
import java.awt.geom.*;
import static java.lang.System.*;
import static java.lang.Math.*;
public class Main {
    public static void main(String[] $) {
        Scanner sc = new Scanner(in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for (int i = 0; i < n; i++) {
            a[i]=sc.nextInt();
        }
        long ans=0;
        for (int left = 0; left < n; left++) {
            int right=left;
            long xor=0,sum=0;
            while (right<n&&(xor^a[right])==sum+a[right]){
                xor^=a[right];
                sum+=a[right];
                right++;
            }
            ans+=right-left;
        }
        out.println(ans);
    }
}