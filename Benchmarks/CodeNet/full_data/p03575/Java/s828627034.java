import java.util.*;
import static java.lang.System.*;
public class Main {
    public static void main(String[]$) {
        Scanner sc = new Scanner(in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] a = new int[m];
        int[] b = new int[m];
        for (int i = 0; i < m; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
        }
        int ans=0;
        //辺iを切断(切断する辺をかえていく)
        for (int i = 0; i <m ; i++) {
            //UFを用意(初期化)
            UF.init();
            for (int j = 0; j <m ; j++) {
                //切断操作(i==jのときは追加しない)
                if(i!=j) {
                    //辺の追加(辺i以外)
                    UF.unite(a[j], b[j]);
                }
            }
            //グラフが非連結なら異なる根をもつ頂点の組が存在するので、それをさがす
            for(int j=2;j<=n;j++){
                if(!UF.same(1,j)){
                    ++ans;
                    //一つ見つけたら非連結とわかるのでLoopを抜ける
                    break;
                }
            }
        }
        out.println(ans);
    }
    static class UF{
        static int size=51;
        static int[] par=new int[size];
        //初期化
        static void init(){
            for (int i = 1; i <size ; i++) {
                par[i]=i;
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
        //同じ根をもつか(同じ集合に属するか)判定
        static boolean same(int x,int y){
            return root(x)==root(y);
        }
        //合体
        static void unite(int x,int y){
            x=root(x);
            y=root(y);
            if(x==y)return;
            par[x]=y;
        }
    }
}