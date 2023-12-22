import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static final long MAX = 10000000000l;
    public static void main(String[] args) {
        try {
            // 標準入力
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);
            long n = Long.parseLong(br.readLine());
            long min = 0;
            boolean first = true;
            long j = 1;
            for (long i = n; i > 0; i--) {
                if (i * j == n) {
                    long temp = 0;
                    long xNum = String.valueOf( i ).length();
                    long yNum = String.valueOf( j ).length();
                    if (xNum > yNum) {
                        temp = xNum;
                    } else {
                        temp = yNum;
                    }
                    if (first || min > temp) {
                        min = temp;
                        first = false;
                    }
                }
                if (i == j) {
                    break;
                }
                j++;
            }
            System.out.println(min);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}