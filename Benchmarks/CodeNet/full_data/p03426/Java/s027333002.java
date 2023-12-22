/*
String[]の初期化、整数の型がlongになっているか
関数（splitとかcontainsとか）内では"+"とかは正規表現となされるので"\\+"とする
配列のコピーはarr1=arr.clone()
HashSet<>[]はおのおの初期化した？？？？？
負の数の割り算は絶対値が小さいほうに切り捨てられるex.-1/2=0ので、ある値>kみたいな式だとバグらせやすいので注意
ある値>=kとして、切り上げた値をとるべき
toLowerCase()はアルファベット以外に対して行ってもエラーにはならない
ArrayDequeではpopとpushはStackと同じ操作になる
*/
//入力終了→Ctrl+D
import java.util.*;
import java.awt.*;
import java.awt.geom.Point2D;
import static java.lang.System.*;
import static java.lang.Math.*;
public class Main {
    public static void main(String[] $) {
        Scanner sc = new Scanner(in);
        int h=sc.nextInt();
        int w=sc.nextInt();
        int d=sc.nextInt();
        int[][] a=new int[h][w];
        int[] point=new int[90001];
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                a[i][j]=sc.nextInt();
                point[a[i][j]]=i*w+j;
            }
        }
        long[] ds=new long[h*w+1];
        for (int i = 1; i <= h * w; i++) {
            if(i>d)ds[i]=ds[i-d]+abs(point[i]/w-point[i-d]/w)+abs(point[i]%w-point[i-d]%w);
        }
        int q=sc.nextInt();
        for (int i = 0; i < q; i++) {
            int l=sc.nextInt();
            int r=sc.nextInt();
            out.println(ds[r]-ds[l]);
        }
    }
}