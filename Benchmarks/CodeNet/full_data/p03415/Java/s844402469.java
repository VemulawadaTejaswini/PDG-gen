import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        try {
            // 標準入力
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);
            String str1 = br.readLine();
            String str2 = br.readLine();
            String str3 = br.readLine();
            System.out.println("" + str1.charAt(0) + str2.charAt(1) + str3.charAt(2));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
