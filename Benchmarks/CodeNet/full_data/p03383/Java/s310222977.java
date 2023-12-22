import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

class Main{

    static long[] hash;

    static int[] used;
    static int[][] tmp;
    static int[][] mat;
    static int H,W;
    static boolean ans=false;
    static long mod = (long)1e9+7;
    static long base = 9973;



    static void check(){
        if(ans)return;
        for(int i=0;i<H;++i){
            if(used[i]%2==0){
                tmp[used[i]/2]=mat[i];
            }else{
                tmp[H-1 -used[i]/2]=mat[i];
            }
        }

        boolean half = false;
        boolean usd[] = new boolean[W];
        for(int i=0;i<W;++i){
            if(usd[i])continue;
            usd[i]=true;
            for(int j=0;j<W;++j){
                if(usd[j])continue;
                boolean ok=true;
                for(int h=0;h<H;++h)if(tmp[h][i]!=tmp[H-1-h][j])ok=false;
                if(!ok){
                    if(j==W-1){
                        if(half)return;
                        for(int h=0;h<(H-1-h);++h)if(tmp[h][i]!=tmp[H-1-h][i])return;
                        half=true;
                    }
                }else{
                    usd[j]=true;
                    break;
                }
            }
        }
        ans=true;
    }

    static void dfs(int v, int depth){
        if(depth==H){
            check();
            return;
        }
        if(v==-1){
            for(int i=0;i<H;++i)if(used[i]<0){
                used[i]=depth;
                dfs(i,depth+1);
                used[i]=-1;
            }
        }else{
            for(int i=0;i<H;++i){
                if(i==v)continue;
                if(hash[i]==hash[v]){
                    used[i]=depth;
                    dfs(-1,depth+1);
                    used[i]=-1;
                }
            }
        }
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        H = scan.nextInt();
        W = scan.nextInt();
        mat = new int[H][W];
        tmp = new int[H][W];
        hash = new long[H];
        used = new int[H];
        Arrays.fill(used,-1);
        for(int i=0;i<H;++i){
            String s = scan.next();
            int cnt[] = new int[26];
            for(int j=0;j<W;++j){
                mat[i][j]=s.charAt(j)-'a';
                cnt[mat[i][j]]++;
            }
            for(int j=0;j<26;++j)hash[i] = (hash[i]*base + cnt[j])%mod;
        }
        dfs(-1,0);
        if(!ans && H%2==1){
            used[1]=0;
            dfs(1,1);
        }
        if(ans)System.out.println("YES");
        else System.out.println("NO");
    }
}