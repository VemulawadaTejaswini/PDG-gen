import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main {
        public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        long ans = 0;

        String[] arr = br.readLine().split(" ");
        int L = Integer.parseInt(arr[0]);
        int R = Integer.parseInt(arr[1]);
        
        int l1 = L % 2019;
        int r1 = R % 2019;

        if (l1== 0 || r1 == 0 || R - L >= 2019) {
            ans = 0;
        } else {
            ans = Long.MAX_VALUE;
            for (int i = L; i < R; i++) {
                for (int j =  i + 1; j <= R; j++) {
                    ans = Math.min(ans, (i * j) % 2019);
                    if (ans == 0) {
                        break;
                    }
                }
            }
        }
        out.println(ans);
        out.close();
    }

}
