import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        int n = Integer.parseInt(str[0]);
        int m = Integer.parseInt(str[1]);

        long[][] map = new long[n][n];
        for(int i=0; i<n; i++) Arrays.fill(map[i], -Long.MAX_VALUE/2);
        for(int i=0; i<n; i++) map[i][i] = 0;

        for(int i=0; i<m; i++){
            str = br.readLine().split(" ");
            int from = Integer.parseInt(str[0]) - 1;
            int to = Integer.parseInt(str[1]) - 1;
            long cost = Long.parseLong(str[2]);
            map[from][to] = cost;
        }

        for(int k=0; k<n; k++){
            for(int i=0; i<n; i++){
                for(int j=0; j<n; j++){
                    if(map[i][j] < map[i][k] + map[k][j]){
                        map[i][j] = map[i][k] + map[k][j];
                    }
                }
            }
        }

        if(map[n-1][n-1] != 0) System.out.println("inf");
        else System.out.println(map[0][n-1]);
    }
}
