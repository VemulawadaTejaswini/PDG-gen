import java.lang.reflect.Array;
import java.util.*;
import java.awt.geom.Point2D;
import java.awt.*;
import static java.lang.System.*;
import static java.lang.Math.*;
public class Main {
    public static void main(String[]$){
        Scanner sc = new Scanner(in);
        int n=sc.nextInt();
        int[] node=new int[n+1];
        node[0]=-1;
        ArrayList<Integer>[] bridge=new ArrayList[n+1];
        int m=sc.nextInt();
        int[] a=new int[m];
        int[] b=new int[m];
        for (int i = 0; i <m ; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
        }
        for(int i=0;i<m;i++){
            bridge[a[i]].add(b[i]);
            bridge[b[i]].add(a[i]);
        }
        int ans=0;
        for (int i = 0; i <m; i++) {
            bridge[a[i]].remove(b[i]);
            bridge[b[i]].remove(a[i]);
            if(bfs(node,bridge))++ans;
            bridge[a[i]].add(b[i]);
            bridge[b[i]].add(a[i]);
        }
        out.println(ans);
    }
    static boolean bfs(int[] node,ArrayList[] x){
        Queue<Integer> q=new ArrayDeque<>();
        int sum=0;
        q.add(0);
        ++sum;
        node[0]=-1;
        while(q.size()>0){
            int tempnode=q.poll();
            for(Object k:x[tempnode]){
                if(node[(int)k]==0){
                    ++sum;
                    node[(int)k]=-1;
                    q.add((int)k);
                }
            }
        }
        return sum!=node.length;
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
    static class UF{
        static int size=1000000;
        static int[] par=new int[size];
        //初期化
        static void init(int n){
            for (int i = 0; i <n ; i++) {
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
        //同じ根をもつか判定
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