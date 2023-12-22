import java.util.Scanner;
import java.util.Arrays;

public class Main {

    int N;
    int M;
    int[][] ab = new int[20000][20000];
    boolean ch;
    public static void main(String[] args) {
        new Main().solve();
    }

    void solve() {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        ch=false;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                ab[i][j] = 0;
            }
        }
        for (int i = 0; i < M; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            a--;
            b--;
            ab[a][b] = 1;
        }
        dfs(0);
        if(ch==false){
        System.out.println("IMPOSSIBLE");
        }
    }

    void dfs(int n) {
        for(int i=0;i<N;i++){
            if(ab[n][N-1]==1&&n!=0){
                System.out.println("POSSIBLE");
                ch=true;
                return;
            }
            if(ab[n][i]==1&&n==0){
                dfs(i);
            }
        }
    }
}