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
            long x = Long.parseLong(strArr[0]);
            long a = Long.parseLong(strArr[1]);
            long b = Long.parseLong(strArr[2]);
            long diff = a - b;
            if (diff >= 0) {
                System.out.println("delicious");
            } else {
                if (x < Math.abs(diff)) {
                    System.out.println("dangerous");
                } else {
                    System.out.println("safe");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
           }
    }
}