import java.util.*;


class Main{
    static int[][] dp;
    static int[] map;
    static int n,m,T,S;
    static boolean isGoal=false;
    public static void main(String argv[]) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        dp = new int[n+1][n+1];
        map = new int[n+1];
        for(int i=0;i<m;i++){
            dp[sc.nextInt()][sc.nextInt()]=1;
        }
        for(int i=0;i<n+1;i++){
            map[i]=999999;
        }
        S = sc.nextInt();
        T = sc.nextInt();
        search(S, S, 0);
        // /dump();
        int result = -1;
        if(map[T]!=999999){
            result = map[T]/3;
        }
        System.out.println(result);
    }

    public static void search(int node, int prev_node, int hosu) {
        if(hosu%3==0){
            if(map[node]<=hosu)return;
            map[node]=hosu;
        }
        for(int i=0;i<n+1;i++){
            if(dp[node][i]==1){
                search(i, node, hosu+1);
            }
        }
        return;
    }

    public static void dump() {
        for(int i=0;i<n+1;i++){
            for(int j=0;j<n+1;j++){
                System.out.print(dp[i][j] + " ");
            }
            System.out.println();
        }
        for(int i=0;i<n+1;i++){
            System.out.println(map[i]);

        }
    }
}