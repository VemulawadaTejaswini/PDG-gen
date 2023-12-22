import java.util.*;
import javax.lang.model.util.ElementScanner6;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 入力
        int n = sc.nextInt();
        int[] plist = new int[n];
        for (int i = 0; i < n; i++) {
            plist[i] = sc.nextInt();
        }

        // 処理
        int out = 0;
        for (int i = 0; i < n; i++) {
            int[] work = new int[i + 1];
            System.arraycopy(plist, 0, work, 0, i + 1);
            Arrays.sort(work);
            if (work[0] == plist[i]) {
                out += 1;
            }
        }

        // 出力
        System.out.println(out);
    }
}