import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        String[] sArr = s.split("/");
        int yyyy = Integer.valueOf(sArr[0]);
        int mm = Integer.valueOf(sArr[1]);
        int dd = Integer.valueOf(sArr[2]);

        String ans = "Heisei";

        Date border = new Date(2019, 4, 30);
        Date targetDate = new Date(yyyy, mm, dd);

        if (targetDate.compareTo(border) > 0) ans = "TBD";

        System.out.println(ans);
    }
}
