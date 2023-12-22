import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputText = sc.next();
        try {
            String endHeisei = "2019/04/30";
            String format = "yyyy/mm/dd";
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(format);
            Date inputDate = simpleDateFormat.parse(inputText);
            Date endHeiseiDate = simpleDateFormat.parse(endHeisei);

            if (endHeiseiDate.after(inputDate)) {
                System.out.println("TBD");
            } else {
                System.out.println("Heisei");
            }
        } catch (Exception e) {
            System.out.println("TBD");
        }
    }
}