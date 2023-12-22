import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

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
        String arr02[] = mylist.get(1).split(" ");
        String arr03[] = mylist.get(2).split(" ");

        long a = Integer.valueOf(arr01[0]);
        long b = Integer.valueOf(arr01[1]);
        long m = Integer.valueOf(arr01[2]);

        Stream<String> stream02 = Arrays.stream(arr02);
        long arr02_temp[] = stream02.mapToLong(Long::parseLong).toArray();
        Arrays.sort(arr02_temp);

        Stream<String> stream03 = Arrays.stream(arr03);
        long arr03_temp[] = stream03.mapToLong(Long::parseLong).toArray();
        Arrays.sort(arr03_temp);

        long mysum = arr02_temp[0] + arr03_temp[0];

        for (int i = 3; i < 3 + m; i++) {

            String arr_temp[] = mylist.get(i).split(" ");

            long x = Long.valueOf(arr_temp[0]);
            long y = Long.valueOf(arr_temp[1]);
            long c = Long.valueOf(arr_temp[2]);

            //            System.out.println(mysum + " " + (arr02_temp[x - 1] + arr03_temp[y - 1] - c));
            mysum = Math.min(mysum, arr02_temp[(int) (x - 1)] + arr03_temp[(int) (y - 1)] - c);

        }

        System.out.println(mysum);

    }

}
