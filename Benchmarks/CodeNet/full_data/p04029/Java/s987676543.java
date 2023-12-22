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
            int sum = 0;
            for (int i = 0; i < n; i++) {
                sum += i + 1;
            }
            System.out.println(sum);
        } catch (IOException e) {
            e.printStackTrace();
           }
    }
}
