import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        try {
            // 標準入力
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);
            int n = Integer.parseInt(br.readLine());
            int k = Integer.parseInt(br.readLine());
            int ans = 1;
            for (int i = 0; i < n; i++) {
                int tmp1 = ans * 2;
                int tmp2 = ans + k;
                if (tmp1 > tmp2) {
                    ans = tmp2;
                } else {
                    ans = tmp1;
                }
            }
            System.out.println(ans);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
