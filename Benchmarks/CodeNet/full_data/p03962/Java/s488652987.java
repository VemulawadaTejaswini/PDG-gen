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
            int a = Integer.parseInt(strArr[0]);
            int b = Integer.parseInt(strArr[1]);
            int c = Integer.parseInt(strArr[2]);
            if (a == b) {
                if (a == c) {
                    System.out.println(1);
                } else {
                    System.out.println(2);
                }
            } else {
                if (a == c) {
                    System.out.println(2);
                } else if (b == c) {
                    System.out.println(2);
                } else {
                    System.out.println(3);
                }
            }
       } catch (IOException e) {
            e.printStackTrace();
       }
    }
}
