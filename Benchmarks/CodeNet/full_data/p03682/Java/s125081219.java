import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int N = in.nextInt();
        int[] x = new int[N], y = new int[N];
        for(int i =0; i < N; i++){
            x[i] = in.nextInt();
            y[i] = in.nextInt();

        }
        int[][] cost = new int[N][N];
        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                cost[i][j] = Math.min(Math.abs(x[i] - x[j]), Math.abs(y[i] - y[j]));
            }
        }
        int[] minicost = new int[N];
        boolean[] used = new boolean[N];
        Arrays.fill(minicost, Integer.MAX_VALUE);
        minicost[0] = 0;
        long ans = 0;

        while(true){
            int v = -1;
            for(int i = 0; i < N; i++){
                if(!used[i] && (v == -1 || minicost[i] < minicost[v])){
                    v = i;
                }
            }
            if(v == -1){
                break;
            }
            used[v] = true;
            ans += minicost[v];

            for(int i = 0; i < N; i++){
                minicost[i] = Math.min(minicost[i], cost[v][i]);
            }
        }
        System.out.println(ans);
    }
}
