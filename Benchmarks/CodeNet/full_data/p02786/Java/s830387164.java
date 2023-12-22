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

        long h = Long.valueOf(arr01[0]);

        List<Long> list01 = new ArrayList<Long>();

        list01.add(h);

        Boolean chkflg = true;

        long cnt = 0;

        while (chkflg) {

            if (list01.size() == 0) {
                chkflg = false;
                break;
            }

            long temp = list01.get(0);

            if (temp != 1) {

                long halfdata = temp / 2;
                list01.remove(0);
                list01.add(halfdata);
                list01.add(halfdata);

                cnt += 1;

            } else {
                list01.remove(0);
                cnt += 1;

            }

        }

        System.out.println(cnt);
    }
}
