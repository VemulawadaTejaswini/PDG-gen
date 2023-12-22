/*
String[]の初期化、整数の型がlongになっているか
関数（splitとかcontainsとか）内では"+"とかは正規表現となされるので"\\+"とする
配列のコピーはarr1=arr.clone()
HashSet<>[]はおのおの初期化した？？？？？
 */
/*
サンプル1の流れ
バラバラ（4C2=6）→1,4のサイズ取得して計算（6-1*1=5）→つなぐ（1-4,2,3）→2,3のサイズ取得して計算（5-1*1=4）→2,3をつなぐ（1-4,2-3）→...
 */
import java.util.*;
import java.awt.*;
import java.awt.geom.*;
import static java.lang.System.*;
import static java.lang.Math.*;
public class Main {
    public static void main(String[] $) {
        Scanner sc = new Scanner(in);
        long n=sc.nextLong();
        int m=sc.nextInt();
        int[] A=new int[m];
        int[] B=new int[m];
        for (int i = 0; i < m; i++) {
            A[i]=sc.nextInt();
            B[i]=sc.nextInt();
        }
        long[] ans=new long[m];
        UF.init(100001);
        int a=0,b=0;
        ans[m - 1] = n * (n - 1) / 2;
        for (int i = 1; i < m; i++) {
            a = A[m - i];
            b = B[m - i];
            //out.print(m - i + " " + UF.us(a) + " size " + UF.us(b) + "→     ");
            //out.println(a + "と" + b + "をつなぐ");
            //out.print(" " + UF.same(a, b) + " ");
            if (UF.same(a, b)) {
                ans[m - i - 1] = ans[m - i];
            } else {
                ans[m - 1 - i] = ans[m - i] - (long) UF.us(a) * (long) UF.us(b);
            }
            UF.unite(a,b);
            //out.println(UF.us(a) + " size " + UF.us(b));
            //out.println(ans[m - 1 - i]);
        }
        for (long l:ans)out.println(l);
    }
    static class UF{
        static int[] par;
        static int[] size;
        static int[] rank;
        //初期化
        static void init(int n){
            par=new int[n];
            size=new int[n];
            rank=new int[n];
            for (int i = 0; i <n ; i++) {
                par[i]=i;
                size[i]=1;
                rank[i]=0;
            }
        }
        //根をたどる
        static int root(int x){
            if(par[x]==x){
                return x;
            }else{
                return par[x]=root(par[x]);
            }
        }
        //同じ根をもつか判定
        static boolean same(int x,int y){
            return root(x)==root(y);
        }
        //合体
        static void unite(int x,int y){
            x=root(x);
            y=root(y);
            if(x==y)return;
            if(rank[x]<rank[y]){
                par[x]=y;
                size[y]+=size[x];
            }else {
                par[y]=x;
                size[x]+=size[y];
                if(rank[x]==rank[y])rank[x]++;
            }
        }
        //aを含む集合のサイズ
        static int us(int a){
            return size[root(a)];
        }
    }
}