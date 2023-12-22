import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

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

        int n = Integer.valueOf(arr01[0]);
        int k = Integer.valueOf(arr01[1]);

        List<String> list01 = Arrays.asList(arr02);
        List<Integer> list02 = list01.stream().map(Integer::valueOf).collect(Collectors.toList());

        //昇順でソート
        Collections.sort(list02);

        long mysum = 0;
        if (n > k) {
            n -= k;

            List<Integer> sub01 = list02.subList(0, n);

            mysum = sub01.stream()
                    .mapToLong(x -> x)
                    .sum();

        }

        System.out.println(mysum);

    }

}
