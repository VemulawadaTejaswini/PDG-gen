import java.text.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.JAPAN);
        Scanner sc = new Scanner(System.in);
        String a = sc.next();//A

        try {
            // 日付1を「A」に設定
            Date date1 = DateFormat.getDateInstance().parse(a);
            // 日付2を「2019/4/30」に設定
            Date date2 = DateFormat.getDateInstance().parse("2019/04/30");

            // 2つの日付を比較し、結果によってメッセージを変えます
            int diff = date1.compareTo(date2);
            if (diff > 0) {
                System.out.println("TBD");
            } else {
                System.out.println("Heisei");
            }

        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
