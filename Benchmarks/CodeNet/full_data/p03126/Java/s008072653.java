import java.util.*;

import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        boolean[][] likeFoods = new boolean[N][M+1];
        for (int i = 0; i < N; i++) {
            int K = sc.nextInt();
            for(int k = 0; k < K; k++){
               likeFoods[i][sc.nextInt()] = true;
            }
        }

        solver(N, M, likeFoods);
    }

    public static void solver(int N, int M, boolean[][] likeFoods) {
        int count = 0;
        for(int m = 1; m < M+1; m++){
            boolean allLike = true;
            for(int n = 0; n < N; n++){
                if(!likeFoods[n][m]){
                    allLike = false;
                    break;
                }
            }
            if(allLike == true){
                count++;
            }
        }
        out.println(count);
    }
}