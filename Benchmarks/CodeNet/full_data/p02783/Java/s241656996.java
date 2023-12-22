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

        String arr[] = mylist.get(0).split(" ");

        int h = Integer.valueOf(arr[0]);
        int a = Integer.valueOf(arr[1]);

        System.out.println(h % a == 0 ? h / a : (h / a) + 1);

    }

}
