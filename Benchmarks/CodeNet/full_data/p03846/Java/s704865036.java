import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Integer[] a = new Integer[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a, Comparator.reverseOrder());
        boolean flag = true;
        int res = 0;

        if (n % 2 == 0) {
            int num = 1;
            for (int i = 0; i < n; i += 2) {
                if (a[i] != n - num || a[i + 1] != n - num) {
                    flag = false;
                    break;
                }
                num += 2;
            }
            if (flag) {
                res = (int) Math.pow(2, n / 2);
            }

        } else {
            int num = 1;
            if (a[n - 1] != 0) {
                flag = false;
            }
            for (int i = 0; i < n; i += 2) {
                
                if (a[i] != n - num || a[i + 1] != n - num) {
                    flag = false;
                    break;
                }
                num += 2;

            }
            if (flag) {
                res = (int) Math.pow(2, n / 2);
            }

        }

        res %= 1000000000 + 7;
        System.out.println(res);

    }

}
