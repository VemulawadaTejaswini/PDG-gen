import java.util.*;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main.solve());
    }
    long solve(){
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt(), r = sc.nextInt();
        int mod = 2019;
        boolean[] vis = new boolean[mod];
        for(int i=0;i<mod&&i+l<=r;i++){
            vis[(l+i)%mod] = true;
        }
        long ans = mod-1;
        for(int i=0;i<mod;i++){
            if(!vis[i]) continue;
            for(int j=0;j<mod;j++){
                if(j==i) continue;
                if(vis[j]) ans = Math.min(ans, i*j%mod);
            }
        }
        return ans;
    }
}