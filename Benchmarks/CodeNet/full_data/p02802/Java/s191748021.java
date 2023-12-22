import java.util.*;
import javax.lang.model.util.ElementScanner6;

class Record {
    int ac = 0;
    int wa = 0;
}

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 入力
        int n = sc.nextInt();
        int m = sc.nextInt();

        // 処理
        Map<Integer, Record> xx = new HashMap<>();
        for (int i = 0; i < m; i++) {
            int no = sc.nextInt();
            String result = sc.next();

            if (xx.get(no) == null) {
                Record record = new Record();
                if (result.equals("AC")) {
                    record.ac += 1;
                } else if (result.equals("WA")) {
                    record.wa += 1;
                }
                xx.put(no, record);
            } else {
                Record record = xx.get(no);
                if (result.equals("AC") && record.ac == 0) {
                    record.ac += 1;
                } else if (result.equals("WA") && record.ac == 0) {
                    record.wa += 1;
                }
                xx.put(no, record);
            }
        }

        int out_ac = 0;
        int out_wa = 0;
        for (Record record : xx.values()) {
            out_ac += record.ac;
            out_wa += record.ac > 0 ? record.wa : 0;
        }

        // 出力
        System.out.print(out_ac);
        System.out.print(' ');
        System.out.println(out_wa);
    }
}