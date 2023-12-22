import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        String s = null;
        try {
            s = br.readLine();
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");

        // Date型変換
        Date formatDate = null;
        try {
            formatDate = sdf.parse(s);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        Date compareDate = null;
        try {
            compareDate = sdf.parse("2019/04/30");
        } catch (ParseException e) {}

        if (formatDate.after(compareDate)) { // formatDate(2019/05/01...) > compareDate(2019/04/30)
            System.out.println("TBD");
        } else {
            System.out.println("Heisei");
        }
    }
}
