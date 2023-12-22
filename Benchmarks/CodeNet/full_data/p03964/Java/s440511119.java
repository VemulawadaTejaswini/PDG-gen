/*
文字列の配列の初期化、整数の型がlongになっているか
関数（splitとかcontainsとか）内では"+"とかは正規表現となされるので"\\+"とする
配列のコピーはarr1=arr.clone()
 */
import java.util.*;
import java.awt.*;
import java.awt.geom.*;
import static java.lang.System.*;
import static java.lang.Math.*;
public class Main {
    public static void main(String[] $) {
        Scanner sc = new Scanner(in);
        int n = sc.nextInt();
        int[] T = new int[n+1];
        T[0]=1;
        int[] A = new int[n+1];
        A[0]=1;
        for (int i = 1; i <= n; i++) {
            T[i] = sc.nextInt();
            A[i] = sc.nextInt();
        }
        for (int i = 1; i <= n; i++) {
            long k = max(ceil(A[i], A[0]), ceil(T[i], T[0]));
            //              out.println(k);
            A[0] *= k;
            T[0] *= k;
        }
//        for (int i = 0; i <= n; i++) out.println(T[i]+" "+A[i]);
        out.println(A[0]+T[0]);
    }
    static long ceil(long a,long b){
        return a%b==0?a/b:a/b+1;
    }
}