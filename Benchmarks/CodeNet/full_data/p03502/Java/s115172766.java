import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        try {
            // 標準入力
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);
            String str = br.readLine();
            long sum = 0;
            for (int i = 0; i < str.length(); i++) {
                long temp = Long.parseLong(str.substring(i, i + 1));
                sum += temp;
            }
            if (Long.parseLong(str) % sum == 0) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
