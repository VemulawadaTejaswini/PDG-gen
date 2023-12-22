import java.util.*;
import java.awt.*;
import static java.lang.System.*;
import static java.lang.Math.*;
public class Main {
    public static void main(String[] $) {
        Scanner sc = new Scanner(in);
        int h=sc.nextInt();
        int w=sc.nextInt();
        char[][] f=new char[h][w];
        for (int i = 0; i < h; i++) {
            String t=sc.next();
            for (int j = 0; j < w; j++) {
                f[i][j]=t.charAt(j);
            }
        }
        int bblo=0;
        int wblo=0;
        int[] dx={-1,0,1,0};
        int[] dy={0,-1,0,1};
        int[][] node=new int[h][w];
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                if(node[i][j]==0){
                    Queue<Point> q=new ArrayDeque<>();
                    q.add(new Point(i,j));
                    while (!q.isEmpty()){
                        Point p=q.poll();
                        node[p.x][p.y]=1;
                        for (int k = 0; k <4; k++) {
                            int x=p.x+dx[k];
                            int y=p.y+dy[k];
                            if(0<=x&&x<h&&0<=y&&y<w){
                                if(node[x][y]==0&&f[i][j]==f[x][y]){
                                    q.add(new Point(x,y));
                                }
                            }
                        }
                    }
                    if(f[i][j]=='.'){
                        wblo++;
                    }else if(f[i][j]=='#'){
                        bblo++;
                    }
                }
            }
        }
        if(bblo*wblo==0){
            out.println(0);
        }else {
            out.println((bblo + wblo) * 2);
        }
    }
    //a文字目とb文字目を入れ替え（1-indexed）
    static String swap(String s,int a,int b){
        StringBuilder t=new StringBuilder(s);
        char A=s.charAt(a-1);
        char B=s.charAt(b-1);
        t.setCharAt(a-1,B);
        t.setCharAt(b-1,A);
        return t.toString();
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
    static int gcd (int a,int b) {
        int temp;
        while((temp = a%b)!=0) {
            a = b;
            b = temp;
        }
        return b;
    }
    //※最小公倍数はa*b/gcd(a,b)である
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