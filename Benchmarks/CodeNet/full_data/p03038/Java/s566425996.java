import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
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

        int n = Integer.valueOf(mylist.get(0).split(" ")[0]);
        int m = Integer.valueOf(mylist.get(0).split(" ")[1]);

        Long arr01[] = new Long[n];
        int j = 0;
        long sumdata = 0;
        for (String s : mylist.get(1).split(" ")) {
            arr01[j] = Long.valueOf(s);
            j += 1;
            sumdata += Long.valueOf(s);
        }

        Arrays.sort(arr01);

        //        System.out.println(Arrays.toString(arr01));
        for (int i = 2; i < 2 + m; i++) {

            String arr_temp[] = mylist.get(i).split(" ");

            int b = Integer.valueOf(arr_temp[0]);
            int c = Integer.valueOf(arr_temp[1]);

            for (int k = 0; k < b; k++) {
                if (arr01[k] < c) {
                    sumdata -= arr01[k];
                    sumdata += (long) c;
                    arr01[k] = (long) c;

                } else {
                    break;
                }
            }
            Arrays.sort(arr01);

        }

        System.out.println(sumdata);
    }

}
