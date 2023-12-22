import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        try {
            // 標準入力
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);
            int n  = Integer.parseInt(br.readLine());
            int i = 0;
            boolean flag = false;
            while (true) {
                if (i * 4 > n || flag == true) {
                    break;
                }
                int j = 0;
                while (true) {
                    if (i * 4 + j * 7 > n) {
                        break;
                    }
                    if (i * 4 + j * 7 == n) {
                        flag = true;
                        break;
                    }
                    j++;
                }
                i++;
            }
            if (flag) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
