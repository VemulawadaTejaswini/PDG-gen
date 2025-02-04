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

        int x = Integer.valueOf(arr01[0]);
        int y = Integer.valueOf(arr01[1]);
        int mysum = 0;
        Integer arr02[] = { 30000, 20000, 10000 };

        if (x == 1 && y == 1) {
            mysum = arr02[x - 1] + arr02[y - 1] + 40000;
        } else if (x <= 3 && y <= 3) {
            mysum = arr02[x - 1] + arr02[y - 1];
        } else if (x <= 3 && y > 3) {
            mysum = arr02[x - 1];
        } else if (x > 3 && y <= 3) {
            mysum = arr02[y - 1];
        }
        System.out.println(mysum);

    }

}