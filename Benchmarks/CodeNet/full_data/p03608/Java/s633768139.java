import java.util.*;

public class Main {
    public static void main(String[] args){
        /*
        2<=N<=200
        2<=R<=min(8,N)
        M<=N*(N-1)/2
        1<=Ci<=100000
        */
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int R = sc.nextInt();
        int[] r = new int[R];
        for(int i=0; i<R; i++) {
            r[i] = sc.nextInt();
        }
        //set dp table, initialize to INFINITE, and update according to path information
        int[][] dp  = new int[N+1][N+1]; //not using 0 index
        int INF = Integer.MAX_VALUE;
        for(int i=0; i<N+1; i++) {
            for(int j=0; j<N+1; j++) {
                if (i==j) {
                    dp[i][j] = 0;
                } else {
                    dp[i][j] = INF;
                }
            }
        } 
        //update according to path informations
        for(int i=0; i<M; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            dp[a][b] = c;
            dp[b][a] = c;
        }
        //Floyd-Warshall Algorithm;
        //ignore 0th index
        for(int k=1;k<N+1;k++) {
            for(int i=1;i<N+1;i++){
                for(int j=1;j<N+1;j++) {
                    dp[i][j] = Math.min(dp[i][k] + dp[k][j], dp[i][j]);
                }
            }
        }


        // System.out.println("DPTABLE");
        // for (int i=1;i<N+1;i++) {
        //     for (int j=1;j<N+1;j++) {
        //         // System.out.print(dp[i][j]);
        //         // System.out.print(",");
        //     }
        //     // System.out.println("");
        // }
        // //seartch for answer by dfs-like procedure
        //calculate answer of starting on r th town, and get minimal one.
        int answer = INF;
        int[][] relevantDistance = new int[R][R];
        // System.out.println("Relevant distances");
        for (int i=0; i<R; i++) {
            int Ri = r[i];
            for (int j=0; j<R; j++) {
                int Rj = r[j];
                relevantDistance[i][j] = dp[Ri][Rj];
                // System.out.print(relevantDistance[i][j]);
            }
            // System.out.println("");
        }
        for(int i=0;i<R;i++) {
            boolean[] checked = new boolean[R];
            for (int j=0; j<R; j++) {
                checked[j] = false;
            }
            int candidate = dfs(i,R,R,relevantDistance,checked, 0);
            answer = Math.min(candidate,answer);
        }
        //Output
        System.out.println(answer);
    }

    private static int dfs(int startIndex, int townNum, int restNum, int[][] distance, boolean[] checked, int currentValue) {
        // System.out.println("townNum");
        // System.out.println(townNum);
        if(restNum < 2)  {
            return(currentValue);
        }
        checked[startIndex] = true;
        int answer = Integer.MAX_VALUE;
        for (int next = 0; next < townNum; next++) {
            if (checked[next]) {
                continue;
            } 
            
            // System.out.print("next, ");
            // System.out.print(next);
            // System.out.print("; ");
            // System.out.print("townNum-1, ");
            // System.out.print(townNum-1);
            // System.out.print("; ");
            // System.out.print("currentValue, ");
            // System.out.println(currentValue);
            int candidate = dfs(next, townNum, restNum-1, distance, checked, distance[startIndex][next] + currentValue);
            // System.out.println("candidate");
            // System.out.println(candidate);
            answer = Math.min(candidate,answer);
            // System.out.println("answer");
            // System.out.println(answer);
        }
        return answer;
    }
}
