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

        String s = arr01[0];

        int cnt = 0;

        int l = s.length();

        for (int i = 0; i < s.length() / 2; i++) {

            String s1 = s.substring(i, i + 1);
            String s2 = s.substring(l - i - 1, l - i);

            if (!s1.equals(s2)) {
                cnt += 1;
            }
        }
        System.out.println(cnt);

    }

}
