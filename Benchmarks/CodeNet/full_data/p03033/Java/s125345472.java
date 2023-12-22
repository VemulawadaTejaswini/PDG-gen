
import java.io.*;
import java.util.*;


public class Main {
    static BufferedWriter log = new BufferedWriter(new OutputStreamWriter(System.out));
    static BufferedReader cin = new BufferedReader(new InputStreamReader(System.in));
    static int[][] arr;
    static int n, m;

    public static void main(String[] args) throws IOException {
        String[] strs = cin.readLine().split(" ");
        int N = Integer.parseInt(strs[0]);
        int Q = Integer.parseInt(strs[1]);
        int[][] block = new int[N][3];
        for (int i = 0; i < N; i++) {
            String str = cin.readLine();
            strs = str.split(" ");

            for (int j = 0; j < 3; j++)
                block[i][j] = Integer.parseInt(strs[j]);
        }
        while (Q-- > 0) {
            int start = Integer.parseInt(cin.readLine());
            boolean isEnded = false;
            int min = Integer.MAX_VALUE>>1;
            for (int i = 0; i < N; i++) {
                if ((block[i][2] + start) >= block[i][0] && (block[i][2] + start) <= (block[i][1]-1)){
                    isEnded = true;
                    min = Math.min(block[i][2],min);
                    break;
                }

            }

            if (! isEnded) log.write("-1\n");
            else
                log.write(min+"\n");

        }
        log.flush();

    }
}