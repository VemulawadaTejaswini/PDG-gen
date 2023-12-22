import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        try {
            // 標準入力
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);
            long n = Long.parseLong(br.readLine());
            for (long i = n; i > 0; i--) {
                long tmp = (long)Math.sqrt(i);
                if (tmp * tmp == i) {
                    System.out.println(i);
                    break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
