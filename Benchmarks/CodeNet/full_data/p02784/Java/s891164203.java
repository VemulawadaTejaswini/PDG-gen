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

        int h = Integer.valueOf(arr01[0]);
        int n = Integer.valueOf(arr01[1]);

        Stream<String> stream = Arrays.stream(arr02);
        int arr03[] = stream.mapToInt(Integer::parseInt).toArray();

        int mysum = Arrays.stream(arr03).sum();

        System.out.println(h <= mysum ? "Yes" : "No");

    }

}
