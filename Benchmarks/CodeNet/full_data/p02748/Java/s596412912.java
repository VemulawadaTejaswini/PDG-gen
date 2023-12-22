import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // ##### 初期読み込み #######################################################################

        // 複数行 1行目h,w 2行目以降 long[][] ----------------------------------------------------
        String[] sLine1 = scanner.nextLine().split(" ");
        int a = Integer.parseInt(sLine1[0]);
        int b = Integer.parseInt(sLine1[1]);
        int m = Integer.parseInt(sLine1[2]);

        String[] sLine2 = scanner.nextLine().split(" ");
        long[] aline = new long[sLine2.length];
        long minA = 100001;
//        for (int i = 0; i < sLine2.length; i++) {
//            aline[i] = Long.parseLong(sLine2[i]);
//            if (aline[i] < minA) {
//                minA = aline[i];
//            }
//        }

        String[] sLine3 = scanner.nextLine().split(" ");
        long[] bline = new long[sLine3.length];
        long minB = 100001;
//        for (int i = 0; i < sLine3.length; i++) {
//            bline[i] = Long.parseLong(sLine3[i]);
//            if (bline[i] < minB) {
//                minB = bline[i];
//            }
//        }


        int max = a;
        if (max < b) max = b;
        for (int i = 0; i < max; i++) {
            // aline
            if (i < a) {
                aline[i] = Long.parseLong(sLine2[i]);
                if (aline[i] < minA) {
                    minA = aline[i];
                }
            }
            // bline
            if (i < b) {
                bline[i] = Long.parseLong(sLine3[i]);
                if (bline[i] < minB) {
                    minB = bline[i];
                }
            }
        }
        // ##### メイン処理 #######################################################################

        long min = minA + minB;
        for (int i = 0; i < m; i++) {
            String[] sLines = scanner.nextLine().split(" ");
            long sum = aline[Integer.parseInt(sLines[0]) - 1] + bline[Integer.parseInt(sLines[1]) - 1] - Integer.parseInt(sLines[2]);
            if (sum < min) {
                min = sum;
            }
        }

        System.out.println(min);
    }
}