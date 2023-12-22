import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
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
        Integer n = Integer.valueOf(arr01[0]);

        String result = "";
        List<String> list01 = Arrays.asList(arr02);
        for (int i = 0; i < n; i++) {

            result += String.valueOf(list01.indexOf(String.valueOf(i + 1)) + 1) + " ";

        }

        System.out.println(result);
    }

}