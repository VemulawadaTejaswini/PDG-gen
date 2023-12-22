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
            long x = Long.parseLong(str[0]);
            long t = Long.parseLong(str[1]);
            if (x - t < 0) {
                System.out.println(0);
            } else {
                System.out.println(x - t);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
