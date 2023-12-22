
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

        String s = mylist.get(1);
        int cnt = 0;
        int wcnt = 0;
        int ecnt = 0;
        String before_data = "";
        for (int i = 0; i < s.length(); i++) {
            String stemp = s.substring(i, i + 1);

            if (stemp.equals("W") && !stemp.equals(before_data)) {
                cnt += Math.min(wcnt, ecnt);
                wcnt = 0;
                ecnt = 0;
            }

            if (stemp.equals("W")) {
                wcnt += 1;
            } else {
                ecnt += 1;
            }
            before_data = stemp;
        }
        cnt += Math.min(wcnt, ecnt);
        System.out.println(cnt);

    }

}
