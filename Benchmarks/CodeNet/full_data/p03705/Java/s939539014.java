import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        try {
            // 標準入力
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);
            String strArr[] = br.readLine().split(" ");
            long n = Long.parseLong(strArr[0]);
            long a = Long.parseLong(strArr[1]);
            long b = Long.parseLong(strArr[2]);
            long ans = (b - a) * (n - 2) + 1;
            if (ans > 0) {
                System.out.println(ans);
            } else {
                System.out.println(0);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}