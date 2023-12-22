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
        String arr02[] = mylist.get(1).split(" ");
        String s = arr02[0];

        int cnt = 1;

        for (int i = 1; i < n; i++) {

            String stemp_before = s.substring(i - 1, i);
            String stemp = s.substring(i, i + 1);

            if (!stemp_before.equals(stemp)) {
                cnt += 1;
            }
            //            System.out.println(stemp_before + " " + stemp + " " + cnt);

        }

        System.out.println(cnt == 0 ? 1 : cnt);
    }

}
