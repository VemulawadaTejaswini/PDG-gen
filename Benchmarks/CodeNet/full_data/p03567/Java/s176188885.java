import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        try {
            // 標準入力
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);
            String str = br.readLine();
            boolean flag1 = false;
            boolean flag2 = false;
            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                if (ch == 'A') {
                    flag1 = true;
                } else if (ch == 'C') {
                    if (flag1) {
                        flag2 = true;
                        break;
                    } else {
                        flag1 = false;
                    }
                } else {
                    flag1 = false;
                }
            }
            if (flag2) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
