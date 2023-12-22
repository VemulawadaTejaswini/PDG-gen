import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

        Map<String, String> map = new HashMap<>();
        Boolean chkflg = true;

        for (int i = 1; i < 1 + m; i++) {

            String arr_temp[] = mylist.get(i).split(" ");
            String s = arr_temp[0];
            String c = arr_temp[1];

            if (!map.containsKey(s)) {
                map.put(s, c);
            } else {
                String val = map.get(s);
                if (!val.equals(c)) {
                    chkflg = false;
                }
            }
        }

        String result = "1";
        for (int j = 1; j < n; j++) {
            result += "x";
        }
        char[] chr_res = result.toCharArray();

        if (chkflg) {
            for (Map.Entry<String, String> e : map.entrySet()) {

                Integer s = Integer.valueOf(e.getKey());
                String v = e.getValue();
                char[] ctemp = v.toCharArray();
                chr_res[s - 1] = ctemp[0];

            }

            int res = Integer.valueOf(String.valueOf(chr_res));

            if (String.valueOf(res).length() == n) {
                System.out.println(Integer.valueOf(String.valueOf(chr_res)));
            } else {
                System.out.println(-1);
            }
        } else {
            System.out.println(-1);
        }

    }

}
