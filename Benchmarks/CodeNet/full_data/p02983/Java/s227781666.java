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

        int amari1 = l % 2019;
        int amari2 = (l + 1) % 2019;

        if (amari1 == 0 || amari2 == 0) {
            System.out.println(0);
            return;
        } else {

            //            int cnt = 0;

            for (int i = l + 1; i <= r; i++) {

                //                if (cnt <= 2019) {

                amari1 = Math.min(amari1, (i % 2019));

                //                } else {
                //                    break;
                //                }

//                cnt += 1;
            }

        }

        System.out.println(amari1 * (amari1 + 1));

    }

}
