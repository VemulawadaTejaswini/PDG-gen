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
            String aStr[] = br.readLine().split(" ");
            int oddCount = 0;
            for (int i = 0; i < aStr.length; i++) {
                int tmp = Integer.parseInt(aStr[i]);
                if (tmp % 2 != 0) {
                    oddCount++;
                }
            }
            if (oddCount % 2 == 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}