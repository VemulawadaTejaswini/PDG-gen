import java.io.*;
import java.util.*;

public class Main {

    static Parser parser = new Parser();

    public static void main(String[] args) throws IOException {

        int N = parser.parseInt();

        int wIdx[] = new int[N + 1];
        int bIdx[] = new int[N + 1];

        for(int i = 0; i < 2 * N; i++){
            char ch = parser.parseString().charAt(0);
            int idx = parser.parseInt();

            if(ch == 'W'){
                wIdx[idx] = i;
            }else{
                bIdx[idx] = i;
            }
        }

        int wCost[][] = new int[N + 1][N + 1];
        int bCost[][] = new int[N + 1][N + 1];

        for(int i = 1; i <= N; i++){
            for(int j = i + 1; j <= N; j++){
                if(wIdx[i] > wIdx[j]){
                    wCost[i][N] += 1;
                }
                if(bIdx[i] > bIdx[j]){
                    bCost[N][i] += 1;
                }
            }
        }

        for(int i = 1; i <= N; i++){
            for(int j = N - 1; j >= 0; j--){
                wCost[i][j] = wCost[i][j + 1] + (wIdx[i] > bIdx[j + 1] ? 1 : 0);
            }
        }

        for(int i = 1; i <= N; i++){
            for(int j = N - 1; j >= 0; j--){
                bCost[j][i] = bCost[j + 1][i] + (bIdx[i] > wIdx[j + 1] ? 1 : 0);
            }
        }

        int dp[][] = new int[N + 1][N + 1];
        for(int i = 0; i <= N; i++){
            Arrays.fill(dp[i], (int)1e9);
        }

        dp[0][0] = 0;
        for(int i = 0; i <= N; i++){
            for(int j = 0; j <= N; j++){

                if(i > 0){
                    dp[i][j] = Math.min(dp[i][j], dp[i - 1][j] + wCost[i][j]);
                }

                if(j > 0){
                    dp[i][j] = Math.min(dp[i][j], dp[i][j - 1] + bCost[i][j]);
                }
            }
        }

        System.out.println(dp[N][N]);
    }
}

class Parser {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final Iterator<String> stringIterator = br.lines().iterator();
    private static final Deque<String> inputs = new ArrayDeque<>();

    void fill() throws IOException {
        if(inputs.isEmpty()){
            if(!stringIterator.hasNext()) throw new IOException();
            inputs.addAll(Arrays.asList(stringIterator.next().split(" ")));
        }
    }

    Integer parseInt() throws IOException {
        fill();
        if(!inputs.isEmpty()) {
            return Integer.parseInt(inputs.pollFirst());
        }
        throw new IOException();
    }

    Long parseLong() throws IOException {
        fill();
        if(!inputs.isEmpty()) {
            return Long.parseLong(inputs.pollFirst());
        }
        throw new IOException();
    }

    Double parseDouble() throws IOException {
        fill();
        if(!inputs.isEmpty()) {
            return Double.parseDouble(inputs.pollFirst());
        }
        throw new IOException();
    }

    String parseString() throws IOException {
        fill();
        return inputs.pollFirst();
    }

}