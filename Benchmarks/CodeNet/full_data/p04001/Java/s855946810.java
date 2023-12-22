import java.util.*;
import java.text.*;

public class Main {

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        new Main().run();
    }

    void run() {

        String s = sc.next();

        int n = s.length() - 1;

        long res = 0;

        for (int i=0; i<(int)Math.pow(2, n); i++) {
            String bin = Integer.toBinaryString(i);

            while (bin.length() < n) bin = "0" + bin;
            bin = bin + "1";

//            System.out.println(bin);

            int idx = 0;
            List<Long> list = new ArrayList<>();
            for (int j=0; j<bin.length(); j++) {
                if (bin.charAt(j) == '1') {
                    list.add(Long.parseLong(s.substring(idx, j+1)));
                    idx = j+1;
                }
            }
//            System.out.println(list);
            long tmp = 0;
            for (Long t: list) tmp += t;
            res += tmp;
        }

        System.out.println(res);

    }


}
