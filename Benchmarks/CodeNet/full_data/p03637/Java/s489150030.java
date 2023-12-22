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
            int count2 = 0;
            int count4 = 0;
            String strArr[] = br.readLine().split(" ");
            for (int i = 0; i < n; i++) {
                long temp = Long.parseLong(strArr[i]);
                if (temp % 4 == 0) {
                    count4++;
                }
                if (temp == 2) {
                    count2++;
                }
            }
            n = n - (count2 - 1);
            n = n / 2;
            n -= count4;
            if (n > 0) {
                System.out.println("No");
            } else {
                System.out.println("Yes");
            }
        } catch (IOException e) {
            e.printStackTrace();
           }
    }
}
