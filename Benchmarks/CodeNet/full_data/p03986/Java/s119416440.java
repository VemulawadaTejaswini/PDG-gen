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
            while (true) {
                int index = str.indexOf("ST");
                if (index == -1) {
                    System.out.println(str.length());
                    break;
                } else if (index == 0) {
                    str = str.substring(2);
                } else {
                    str = str.substring(0, index) + str.substring(index + 2, str.length());
                }

            }
        } catch (IOException e) {
            e.printStackTrace();
           }
    }
}
