import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

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

        //        Map<String, Integer> map = new HashMap<String, Integer>();
        TreeMap<String, Integer> map = new TreeMap<String, Integer>();
        for (int i = 1; i < 1 + n; i++) {

            String temp = mylist.get(i);

            if (map.containsKey(temp)) {
                int val = map.get(temp);
                map.put(temp, val + 1);
            } else {
                map.put(temp, 1);
            }
        }
        //        System.out.println(map);

        int maxdata = map.values().stream()
                .mapToInt(x -> x)
                .max()
                .orElse(0);
        //        System.out.println(maxdata);

        map.forEach((key, value) -> {
            if (value == maxdata) {
                System.out.println(key);
            }

        });

    }
}
