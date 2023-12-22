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
            int a[] = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(br.readLine());
            }
            int now = a[0];
            int count = 1;
            StringBuilder strBuf = new StringBuilder();
            while (true) {
                if (now == 2) {
                    System.out.println(count);
                    break;
                } else {
                    if (strBuf.indexOf(String.valueOf(now)) != -1) {
                        System.out.println(-1);
                        break;
                    } else {
                        strBuf.append(now);
                    }
                }
                now = a[now - 1];
                count++;
            }
        } catch (IOException e) {
            e.printStackTrace();
           }
    }
}