import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
        int m = Integer.valueOf(arr01[1]);

        Map<Integer, List<Integer>> map = new HashMap<Integer, List<Integer>>();

        for (int i = 1; i < 1 + m; i++) {

            String arr_temp[] = mylist.get(i).split(" ");

            int p = Integer.valueOf(arr_temp[0]);
            int y = Integer.valueOf(arr_temp[1]);

            if (map.containsKey(p)) {

                List<Integer> list_temp = new ArrayList<Integer>();
                list_temp = map.get(p);
                list_temp.add(y);
                map.put(p, list_temp);

            } else {
                List<Integer> list_temp = new ArrayList<Integer>();
                list_temp.add(y);
                map.put(p, list_temp);
            }

        }

        //        System.out.println(map);

        for (int i = 1; i < 1 + m; i++) {

            String arr_temp[] = mylist.get(i).split(" ");

            int p = Integer.valueOf(arr_temp[0]);
            int y = Integer.valueOf(arr_temp[1]);

            List<Integer> list01 = new ArrayList<Integer>();
            list01 = map.get(p);

            long cnt = list01.stream().filter(x -> x < y).count() + 1;

            //            System.out.println(cnt);

            System.out.printf("%06d%06d\n", p, cnt);

        }

    }

}
