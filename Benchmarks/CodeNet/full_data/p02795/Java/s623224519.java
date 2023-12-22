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

        int h = Integer.valueOf(mylist.get(0));
        int w = Integer.valueOf(mylist.get(1));
        int n = Integer.valueOf(mylist.get(2));

        System.out.println(n % Math.max(h, w) == 0 ? n / Math.max(h, w) : (n / Math.max(h, w)) + 1);

    }

}