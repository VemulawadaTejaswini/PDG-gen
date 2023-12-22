import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        try {
            // 標準入力
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);
            String str[] = br.readLine().split(" ");
            int x = Integer.parseInt(str[0]);
            int y = Integer.parseInt(str[1]);
            int z = Integer.parseInt(str[2]);
            boolean flag = true;
            int num = 0;
            int ans = 0;
            while (num < x) {
                if (flag) {
                    num += z;
                } else {
                    if (num + y <= x) {
                        num += y;
                        ans++;
                    } else {
                        break;
                    }
                }
                flag = !flag;
            }
            if (y * ans + z * (ans + 1) > x) {
                ans--;
            }
            System.out.println(ans);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
