
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();
        str = str.replace("B", "0");
        str = str.replace("W", "1");
        int[] c = new int[2 * n];// 0=left, 1=right
        int rev = 0;
        for (int i = 0; i < n * 2; i++) {
            int p = Integer.parseInt(str.substring(i, i + 1));
            if (rev % 2 == p) {
                rev++;
                c[i] = 0;
            } else {
                rev--;
                c[i] = 1;
            }
        }
        if (rev != 0) {
            System.out.println(0);
            return;
        }
        //dump(c);
        int res = 1;
        for (int k = 0; k < n; k++) {
            res *= (k + 1);
        }
        int count = 0;
        int sum = 0;
        for (int i = 2 * n - 1; i >= 0; i--) {
            if (c[i] == 0) {
                res *= count;
                count--;
            } else {
                count++;
                sum++;
            }
            if (sum == n) {
                int tmp = 1;
                for (int k = 0; k < count; k++) {
                    tmp *= (k + 1);
                }
                res *= tmp;
                break;
            }
        }
        System.out.println(res);
    }

    static void dump(int[] s) {
        for (int i = 0; i < s.length; i++) {
            System.out.print(s[i] + " ");
        }
    }
}