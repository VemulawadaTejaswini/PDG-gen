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
        Set<Long> usedHash = new HashSet<>();
        for(int i=0;i<W;++i){
            long hsh = 0;
            for(int j=0;j<H;++j)hsh = (hsh*base + tmp[j][i])%mod;
            if(!usedHash.remove(hsh)){
                hsh = 0;
                for(int j=H-1;j>=0;--j)hsh = (hsh*base + tmp[j][i])%mod;
                usedHash.add(hsh);
            }
        }
        if(usedHash.size()==0)ans = true;
        if(usedHash.size()==1){
            for(int i=0;i<W;++i){
                long hsh = 0;
                for(int j=H-1;j>=0;--j)hsh = (hsh*base + tmp[j][i])%mod;
                if(usedHash.contains(hsh)){
                    for(int k=0; k<(H-1-k);++k)if(tmp[k][i]!=tmp[H-1-k][i])return;
                    ans = true;
                    return;
                }
            }
        }
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
        if(ans)System.out.println("YES");
        else System.out.println("NO");
    }
}