import java.util.*;
class Main {
    static int n;
    static int[][] a;
    static int cnt;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        a = new int[n][3];
        for(int i = 0; i<3; i++) {
            for(int j = 0; j<n; j++) {
                a[j][i] = sc.nextInt();
            }
        }
        for(int i = 0; i<n; i++) {
            dfs(i,1);
        }
        System.out.println(cnt);
    }
    public static void dfs(int i, int depth) {
        if(depth == 3) {
            cnt++;
            return;
        }
        for(int j = 0; j<n; j++) {
            //System.out.println(i+" "+j);
            if(a[i][depth-1]< a[j][depth]) dfs(j, depth+1);
        }
    }
}