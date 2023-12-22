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

        String arr_result[] = mylist.get(1).split(" ");

        int mindata = Integer.valueOf(arr_result[0]);
        int maxdata = Integer.valueOf(arr_result[1]);

        for (int i = 2; i < 1 + m; i++) {
            String arr02[] = mylist.get(i).split(" ");
            int l = Integer.valueOf(arr02[0]);
            int r = Integer.valueOf(arr02[1]);

            if (mindata < l) {
                mindata = l;
            }
            if (maxdata > r) {
                maxdata = r;
            }

//            System.out.println(mindata + " " + maxdata);

        }

        System.out.println(maxdata - mindata >= 0 ? maxdata - mindata + 1 : 0);
    }

}
