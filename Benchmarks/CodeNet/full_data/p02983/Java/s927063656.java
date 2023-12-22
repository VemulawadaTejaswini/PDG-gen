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

        int l = Integer.valueOf(arr01[0]);
        int r = Integer.valueOf(arr01[1]);

        int target = 2019;

        int cnt = 0;
        int mindata = 9999;
        while (l <= r) {

            int amari1 = l % target;
            int amari2 = (l + 1) % target;

            mindata = Math.min(mindata, (amari1 * amari2) % target);

            cnt += 1;

            l += 1;
            if (cnt >= 2020 || mindata == 0) {
                break;
            }
        }

        System.out.println(mindata);

    }
}
