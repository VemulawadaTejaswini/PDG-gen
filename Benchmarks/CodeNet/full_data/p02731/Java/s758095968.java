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

        int l = Integer.valueOf(arr01[0]);
        double maxdata = 0;
        int a = 1;
        int b = 1;

        for (int i = a; i <= l; i++) {
            for (int j = b; j <= l; j++) {
                if (i + j >= l) {
                    break;
                }
                int k = l - i - j;
                //                System.out.println(i + " " + j + " " + k);
                if (k > 0) {
                    maxdata = Math.max(maxdata, i * j * k);
                }
            }
        }

        System.out.println(maxdata);

    }

}
