import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] ss =br.readLine().split(" ");
        int N = Integer.parseInt(ss[0]), C = Integer.parseInt(ss[1]);
        int[][] rec = new int[30][200002];
        for (int i = 0; i < N; i++) {
            ss = br.readLine().split(" ");
            int s = Integer.parseInt(ss[0]) * 2 - 1;
            int t = Integer.parseInt(ss[1]) * 2;
            int c = Integer.parseInt(ss[2]) - 1;
            rec[c][s]++;
            rec[c][t]--;
        }
        for (int i = 0; i < 30; i++) {
            for (int j = 1; j < 200002; j++) {
                rec[i][j] += rec[i][j - 1];
            }
        }
        int ans = 0;
        for (int i = 0; i < 200002; i++) {
            int tmp = 0;
            for (int j = 0; j < 30; j++) {
                tmp += rec[j][i];
            }
            ans = Math.max(ans, tmp);
        }
        System.out.println(ans);
    }
}