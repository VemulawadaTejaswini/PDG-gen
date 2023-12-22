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
            boolean trueFlag = false;
            for (int i = 0; i < b; i++) {
                if ((i * b + c) % a == 0) {
                    System.out.println("YES");
                    trueFlag = true;
                    break;
                }
            }
            if (!trueFlag) {
                System.out.println("NO");
            }
        } catch (IOException e) {
            e.printStackTrace();
           }
    }
}
