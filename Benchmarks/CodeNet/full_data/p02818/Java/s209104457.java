
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

        long a = Long.valueOf(arr01[0]);
        long b = Long.valueOf(arr01[1]);
        long k = Long.valueOf(arr01[2]);

        if (a >= k) {

            a = k - a;

        } else if (a + b > k) {

            long temp = b - (k - a);
            a = 0;
            b = temp;

        } else {

            a = 0;
            b = 0;
        }

        System.out.println(a + " " + b);

    }

}