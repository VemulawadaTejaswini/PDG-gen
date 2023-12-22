import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        try {
            // 標準入力
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);
            String strArr[]= br.readLine().split(" ");
            long n = Long.parseLong(strArr[0]);
            long m = Long.parseLong(strArr[1]);
            if (Math.abs(n - m) >= 2) {
                System.out.println(0);
            } else if (n != m) {
                System.out.println((getFactorial(n) * getFactorial(m)) % 1000000007);
            } else {
                System.out.println((getFactorial(n) * getFactorial(m) * 2) % 1000000007);
            }
        } catch (IOException e) {
            e.printStackTrace();
           }
    }

    public static long getFactorial(long num) {
        long ret = 1;
        for (long i = 2; i <= num; i++) {
            ret = ret * i % 1000000007;
        }
        return ret;
    }
}