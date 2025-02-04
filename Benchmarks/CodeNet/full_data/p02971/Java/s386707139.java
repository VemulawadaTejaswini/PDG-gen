import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
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
        int n = Integer.valueOf(arr01[0]);

        ArrayList<Integer> list01 = new ArrayList<Integer>();

        for (int i = 1; i < 1 + n; i++) {

            list01.add(Integer.valueOf(mylist.get(i)));

        }

        for (int i = 0; i < list01.size(); i++) {

            ArrayList<Integer> list02 = new ArrayList<Integer>(list01);
            list02.remove(i);

            //昇順でソート
            Collections.sort(list02);

            //配列を出力(昇順ソート出力)
            //            System.out.println(list01);

            //降順でソート
            Collections.reverse(list02);

            System.out.println(list02.get(0));

            //            System.out.println(list_temp);

        }
    }

}
