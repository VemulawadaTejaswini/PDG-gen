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

        String result = "";
        for (int j = 0; j < n; j++) {
            result += "0";
        }

        char[] chrdata = result.toCharArray();

        for (int i = 1; i < 1 + m; i++) {
            String arr01_res[] = mylist.get(i).split(" ");
            int s = Integer.valueOf(arr01_res[0]);
            String c = arr01_res[1];
            char[] ctemp = c.toCharArray();

            chrdata[s - 1] = ctemp[0];

            //            System.out.println(chrdata);
        }

        int res = Integer.valueOf(String.valueOf(chrdata));

        if (String.valueOf(res).length() == n) {
            System.out.println(Integer.valueOf(String.valueOf(chrdata)));
        } else {
            System.out.println(-1);
        }
    }

}
