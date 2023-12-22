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
            str = str.replace("2017/01", "2018/01");
            System.out.println(str);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
