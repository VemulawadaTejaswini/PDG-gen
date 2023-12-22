import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int Q = sc.nextInt();
        int[][] train = new int[N+1][N+1];
        int[] count = new int[Q];
        for(int i = 0; i < M; i++){
            int L = sc.nextInt();
            int R = sc.nextInt();
            train[L][R] ++;
        }
        for(int i = 0; i < Q; i++){
            int p = sc.nextInt();
            int q = sc.nextInt();
            for(int j = p; j <= q; j++){
                for(int k = p; k <= q; k++){
                    count[i] += train[j][k];
                }
            }
            System.out.println(count[i]);
        }
    }
}
