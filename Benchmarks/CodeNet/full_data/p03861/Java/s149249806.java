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
            long a = Long.parseLong(strArr[0]);
            long b = Long.parseLong(strArr[1]);
            long x = Long.parseLong(strArr[2]);
            long tmp1 = b / x;
            long tmp2 = a / x;
            if (a == 0) {
            	tmp1++;
            }
            System.out.println(tmp1 - tmp2);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}