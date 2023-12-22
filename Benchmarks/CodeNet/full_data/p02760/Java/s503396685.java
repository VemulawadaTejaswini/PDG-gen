import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        Integer[] a = new Integer[9];
        for (int i = 0; i < 9; i++) {
            a[i] = Integer.parseInt(sc.next());
        }
        int n = Integer.parseInt(sc.next());
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            b[i] = Integer.parseInt(sc.next());
        }

        // 主処理
        List<Integer> list = Arrays.asList(a);
        for (int i = 0; i < b.length; i++) {
            int index = list.indexOf(b[i]);
            if (0 <= list.indexOf(b[i])) {
                a[index] = 0; 
            }
        }

        String result = isBingo(a) ? "Yes" : "No";

        // 出力
        System.out.println(result);
        sc.close();
    }

    public static boolean isBingo(Integer[] a) {
        boolean isBingoLine = (a[0] == 0 && a[1] == 0 && a[2] == 0) || (a[3] == 0 && a[4] == 0 && a[5] == 0) || (a[6] == 0 && a[7] == 0 && a[8] == 0);
        boolean isBingoColumn = (a[0] == 0 && a[3] == 0 && a[6] == 0) || (a[1] == 0 && a[4] == 0 && a[8] == 0) || (a[2] == 0 && a[5] == 0 && a[8] == 0);
        boolean isBingoSlash = (a[0] == 0 && a[4] == 0 && a[8] == 0) || (a[2] == 0 && a[4] == 0 && a[6] == 0);
        return isBingoLine || isBingoColumn || isBingoSlash;
    }
}