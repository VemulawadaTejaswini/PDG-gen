import java.util.*;
import java.util.Arrays;
import java.util.ArrayList;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        ArrayList<int[]> list = new ArrayList<>();
        for(int i = 0; i < N; i++){
            A[i] = sc.nextInt();
            int[] a = {i, A[i]};
            list.add(a);
        }
        long[][] dp = new long[N+1][N+1];
        long max = 0;
        Collections.sort(
            list, 
            new Comparator<int[]>() {
                @Override
                public int compare(int[] obj1, int[] obj2) {
                    return obj2[1] - obj1[1];
                }
            }
        );

        for(int x = 0; x < N; x++){
            for(int y = 0; y < N; y++){
                if(x+y < N){
                    int[] dpm = list.get(x+y);
                    dp[x][y+1] = Math.max(dp[x][y+1], dp[x][y] + dpm[1]*Math.abs(dpm[0]-(N-y-1)));
                    dp[x+1][y] = Math.max(dp[x+1][y], dp[x][y] + dpm[1]*Math.abs(dpm[0]-x));
                }
            }
        }
        for(int i = 0; i <= N; i++){
            for(int j = 0; j <= N; j++){
                if(max < dp[i][j]){
                    max = dp[i][j];
                }
                
            }
        }

        System.out.println(max);
    }
} 