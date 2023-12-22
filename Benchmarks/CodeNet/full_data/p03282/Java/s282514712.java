import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        try {
            // 標準入力
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);
            String s = br.readLine();
            long k = Long.parseLong(br.readLine());
            int ans = 1;
            for (int i = 0; i < s.length(); i++) {
                int tempNum = Integer.parseInt(s.substring(i, i + 1));
                if (tempNum != 1) {
                    ans = tempNum;
                    break;
                } else {
                    if (k == i + 1) {
                        break;
                    }
                }
            }
            System.out.println(ans);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
