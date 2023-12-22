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

        String arr[] = mylist.get(0).split(" ");
        long n = Long.valueOf(arr[0]);
        long k = Long.valueOf(arr[1]);
        long amari = n % k;
        long temp = Math.abs(amari - k);

//        System.out.println(temp + " " + amari);

        System.out.println(Math.min(amari, temp));

    }

}
