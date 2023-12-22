import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {

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
        String arr02[] = mylist.get(1).split(" ");
        String n = arr01[0];

        int cnt = 0;
        Boolean chkflg = true;

        for (int i = 1; i <= Integer.valueOf(n); i++) {
            if (Integer.valueOf(arr02[i - 1]) != i) {
                cnt += 1;
            }
            if (cnt > 2) {
                chkflg = false;
                break;
            }
        }

        System.out.println(chkflg ? "YES" : "NO");
    }

}