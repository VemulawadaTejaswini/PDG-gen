import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String[] str = br.readLine().split(" ");

        int n = Integer.parseInt(br.readLine());
        String s = br.readLine();

        int cnt = 0;
        while (s.indexOf("1101") != -1 || s.indexOf("1011") != -1 || s.indexOf("101") != -1) {
            if (s.indexOf("1101") != -1) {
                cnt++;
                s = s.replaceFirst("1101", "1010");
            }

            if (s.indexOf("1011") != -1) {
                cnt++;
                s = s.replaceFirst("1011", "0101");
            }

            if (s.indexOf("101") != -1) {
                cnt++;
                s = s.replaceFirst("101", "010");
            }
        }

        System.out.println(cnt);
    }
}
