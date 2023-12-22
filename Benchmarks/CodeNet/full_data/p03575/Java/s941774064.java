import java.util.*;

public class Main {
    static int n;
    static int m;
    static int [] a;
    static int [] b;
    static boolean [][] boo;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        a = new int [m];
        b = new int [m];
        boo = new boolean [n+1][n+1];
        for(int i = 0; i < m; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
            boo[a[i]][b[i]] = boo[b[i]][a[i]] = true;
        }
        solve();
    }
    
    static void solve(){
        int ans = 0;
        for(int i = 0; i < m; i++) {
            boo[a[i]][b[i]] = boo[b[i]][a[i]] = false;
            if(!judge(i)){
                ans++;
            }
            boo[a[i]][b[i]] = boo[b[i]][a[i]] = true;
        }
        System.out.println(ans);
    }
    
    static boolean judge(int i) {
        for(int x = 1; x <= n; x++) {
            if(boo[a[i]][x] && boo[x][b[i]]){
                return true;
            }
        }
        return false;
    }
}