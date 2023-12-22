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
            String s = br.readLine();
            String t = br.readLine();
            int ans = n * 2;
            for (int i = 0; i < n; i++) {
                String tmp1 = s.substring(i);
                String tmp2 = t.substring(0, t.length() - i);
                if (tmp1.equals(tmp2)) {
                    ans -= tmp1.length();
                }
            }
            System.out.println(ans);
        } catch (IOException e) {
            e.printStackTrace();
           }
    }
}
