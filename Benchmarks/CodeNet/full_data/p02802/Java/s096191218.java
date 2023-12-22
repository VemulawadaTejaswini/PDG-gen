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
        int m = Integer.valueOf(arr01[1]);

        int cnt1 = 0;
        int cnt2 = 0;
        Boolean chkflg = true;
        int before_data = 0;
        for (int i = 1; i < 1 + m; i++) {

            String arr_temp[] = mylist.get(i).split(" ");
            int p = Integer.valueOf(arr_temp[0]);
            String s = arr_temp[1];

            if (p != before_data) {
                chkflg = true;
            }

            if (chkflg) {

                if (s.equals("AC")) {
                    cnt1 += 1;
                    chkflg = false;
                }
                if (s.equals("WA")) {
                    cnt2 += 1;
                }
                before_data = p;

            }
        }

        System.out.println(cnt1 + " " + cnt2);

    }
}
