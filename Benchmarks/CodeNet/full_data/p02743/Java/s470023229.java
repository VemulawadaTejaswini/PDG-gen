import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigDecimal;
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

        String arr_temp[] = mylist.get(0).split(" ");
        int a = Integer.valueOf(arr_temp[0]);
        int b = Integer.valueOf(arr_temp[1]);
        int c = Integer.valueOf(arr_temp[2]);

        BigDecimal x = new BigDecimal(Double.toString((Math.sqrt((double) a))));
        BigDecimal y = new BigDecimal(Double.toString((Math.sqrt((double) b))));
        BigDecimal z = new BigDecimal(Double.toString((Math.sqrt((double) c))));

        BigDecimal z_temp = x.add(y);

        //        System.out.println(z_temp);
        //        System.out.println(z);
        //        System.out.println(z_temp.compareTo(z));
        if (z_temp.compareTo(z) == -1) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }

}
