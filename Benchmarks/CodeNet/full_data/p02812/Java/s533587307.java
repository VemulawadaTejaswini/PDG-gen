
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws Exception {

        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(is);

        List<String> mylist = new ArrayList<>();

        // 標準入力からの値を変数strinputに代入
        String strinput = reader.readLine();

        while (strinput != null) {

            mylist.add(strinput);
            strinput = reader.readLine();

        }

        String arr01[] = mylist.get(0).split(" ");

        int n = Integer.valueOf(arr01[0]);
        String s = mylist.get(1);

        int cnt = 0;

        int sposi = 0;

        while (sposi < n - 2) {

            String stemp = s.substring(sposi, sposi + 3);
            if (stemp.equals("ABC")) {
                cnt += 1;
                sposi += 3;
            } else {
                sposi += 1;
            }

        }

        System.out.println(cnt);

    }

}