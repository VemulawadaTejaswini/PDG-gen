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
            long y = Long.parseLong(strArr[1]);
            if (x >= 0) {
                if (y >= 0) {
                    if (y >= x) {
                        System.out.println(y - x);
                    } else {
                        System.out.println(y - (-1 * x) + 1);
                    }
                } else {
                    if (x > Math.abs(y)) {
                        System.out.println(y - (-1 * x) + 1);
                    } else {
                        long diff = Math.abs(y) - x;
                        System.out.println(diff + 1);
                    }
                }
            } else {
                if (y >= 0) {
                    if (Math.abs(x) > y) {
                        System.out.println((-1 * y) - x + 1);
                    } else {
                        long diff = y - (-1 * x);
                        System.out.println(diff + 1);
                    }
                } else {
                    if (Math.abs(x) >= Math.abs(y)) {
                        System.out.println(y - x);
                    } else {
                        long diff = (-1 * y) - (-1 * x);
                        System.out.println(diff + 2);
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
           }
    }
}
