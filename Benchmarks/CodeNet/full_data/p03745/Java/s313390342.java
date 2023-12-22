import java.util.Scanner;

/**
 * Created by Administrator on 2017/4/22.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n <= 2) System.out.println(1);
        else {
            int res = 0;
            int pre = scanner.nextInt();
            boolean isupper = true;
            int count = 1;
            for (int i = 1; i < n; i ++) {
               int cur = scanner.nextInt();
                if (isupper && cur < pre) {
                    isupper= false;
                    if (count >= 2) {
                        res ++;
                        count = 1;
                        pre = cur;
                        continue;
                    }
                }else if (!isupper && cur > pre) {
                    isupper = true;
                    if (count >= 2) {
                        res ++;
                        count = 1;
                        pre = cur;
                        continue;
                    }
                }
                count ++;
                pre = cur;

            }
            System.out.println(res + 1);
        }

    }
}
