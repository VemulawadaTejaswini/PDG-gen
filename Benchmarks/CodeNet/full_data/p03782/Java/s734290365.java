import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();
        List<Integer> a = new ArrayList<>();

        int ans = N;
        for(int i = 0; i < N; i++){
            int v = sc.nextInt();
            a.add(v);
        }

        a.sort(null);

        boolean[][] preSum = new boolean[N + 1][K + 9];
        boolean[][] postSum = new boolean[N + 1][K + 9];

        preSum[0][0] = postSum[0][0] = true;

        int len = a.size();

        for(int i = 1; i <= len; i++){
            preSum[i][0] = true;
            int v = a.get(i - 1);
            for(int j = K; j >= 0; j--){
                preSum[i][j] = preSum[i - 1][j];
                if(j - v >= 0){
                    preSum[i][j] |= preSum[i - 1][j - v];
                }
            }
        }

        Collections.reverse(a);

        for(int i = 1; i <= len; i++){
            postSum[i][0] = true;
            int v = a.get(i - 1);
            for(int j = K; j >= 0; j--){
                postSum[i][j] = postSum[i - 1][j];
                if(j - v >= 0){
                    postSum[i][j] |= postSum[i - 1][j - v];
                }
            }
        }

        Collections.reverse(a);

        for(int i = 1; i <= len; i++){

            int v = a.get(i - 1);
            if(v >= K){
                ans -= 1;
                continue;
            }

            boolean[] isExists = new boolean[K + 1];
            for(int j = K - 1; j >= 0; j--){
                isExists[j] = postSum[N - i][j] || isExists[j + 1];
            }

            for(int j = 0; j <= K - 1; j++){
                if(preSum[i - 1][j] && ((K - v - j) < 0 || isExists[K - v - j])){
                    ans -= 1;
                    break;
                }
            }

        }

        System.out.println(ans);
    }
}
