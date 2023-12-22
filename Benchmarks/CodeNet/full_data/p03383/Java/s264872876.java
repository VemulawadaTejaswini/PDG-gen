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
    static boolean[][] same;



    static void check(){
        if(ans)return;
        for(int i=0;i<H;++i)tmp[(used[i]%2==0 ? used[i]/2 : H-1-used[i]/2)]=mat[i];

        boolean half = false;
        boolean usd[] = new boolean[W];
        for(int i=0;i<W;++i){
            if(usd[i])continue;
            usd[i]=true;
            boolean flag=false;
            for(int j=0;j<W;++j){
                if(usd[j])continue;
                boolean ok=true;
                for(int h=0;h<H;++h)if(tmp[h][i]!=tmp[H-1-h][j])ok=false;
                if(ok){
                    usd[j]=true;
                    flag=true;
                    break;
                }
            }
            if(!flag){
                if(half)return;
                for(int h=0;h<(H-1-h);++h)if(tmp[h][i]!=tmp[H-1-h][i])return;
                half=true;
            }
        }
        ans=true;
        return;
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
            return;
        }else{
            for(int i=0;i<H;++i){
                if(i==v)continue;
                if(same[i][v]){
                    used[i]=depth;
                    dfs(-1,depth+1);
                    used[i]=-1;
                }
            }
            return;
        }
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        H = scan.nextInt();
        W = scan.nextInt();
        mat = new int[H][W];
        tmp = new int[H][];
        used = new int[H];
        same = new boolean[H][H];
        Arrays.fill(used,-1);
        int cnt[][] = new int[H][26];
        for(int i=0;i<H;++i){
            String s = scan.next();
            for(int j=0;j<W;++j){
                mat[i][j]=s.charAt(j)-'a';
                cnt[i][mat[i][j]]++;
            }
        }
        for(int i=0;i<H;++i)for(int j=0;j<H;++j){
            for(int k=0;k<26;++k){
                if(cnt[i][k]!=cnt[j][k])break;
                if(k==25)same[i][j]=same[j][i]=true;
            }
        }
        used[0]=0;
        dfs(0,1);
        if(!ans && H%2==1){
            used[0]=-1;
            used[1]=0;
            dfs(1,1);
        }
        if(ans)System.out.println("YES");
        else System.out.println("NO");
    }
}