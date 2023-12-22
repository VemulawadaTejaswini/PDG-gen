import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
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
        String arr02[] = mylist.get(1).split(" ");
        List<String> list01 = new ArrayList<String>(Arrays.asList(arr02));
        //        System.out.println(list01);
        String arr_result[] = new String[n];
        //        String s = "";
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 1; i <= list01.size(); i++) {
            //            System.out.println(list01.get(i));
            int v = Integer.valueOf(list01.get(i - 1));
            //            System.out.println(i + " " + v);
            map.put(i, v);
            //            arr_result[i - 1] = i + 1;

        }

        // 昇順
        map.entrySet().stream()
                .sorted(java.util.Map.Entry.comparingByValue())
                .forEach(s -> System.out.print(s.getKey() + " "));

    }

}