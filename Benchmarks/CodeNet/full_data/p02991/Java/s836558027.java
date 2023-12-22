import java.util.*;


class Main{
    static int[][] dp;
    static int[][] map;
    static int n,m,T,S;
    public static void main(String argv[]) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        dp = new int[n+1][n+1];
        map = new int[n+1][3];
        for(int i=0;i<m;i++){
            int p = sc.nextInt();
            int q = sc.nextInt();
            dp[p][q]=1;
        }
        for(int i=0;i<n+1;i++){
            map[i][0]=999999999;
            map[i][1]=999999999;
            map[i][2]=999999999;
        }
        S = sc.nextInt();
        T = sc.nextInt();
        search(S, 0);
        // /dump();
        int result = -1;
        if(map[T][0]!=999999999){
            result = map[T][0]/3;
        }
        System.out.println(result);
    }

    public static void search(int node, int hosu) {
        if(hosu<=map[node][hosu%3]){
            map[node][hosu%3]=hosu;
        }
        else{
            return;
        }
        if(map[T][0] < hosu)return;
        for(int i=1;i<n+1;i++){
            if(dp[node][i]==1){
                search(i, hosu+1);
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
