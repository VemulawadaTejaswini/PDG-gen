import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int q = Integer.parseInt(sc.next());
        Integer[] l = new Integer[q];
        Integer[] r = new Integer[q];
        for (int i = 0; i < q; i++) {
            l[i] = Integer.parseInt(sc.next());
            r[i] = Integer.parseInt(sc.next());
        }
        sc.close();

        // 主処理
        int[] count = new int[100001];
        for (int i = 1; i <= 100000; i++) {
            count[i] = count[i - 1];
            if (isPrime(i) && isPrime((i + 1) / 2)) {
                count[i]++;
            }
        }

        // 出力
        for (int i = 0; i < q; i++) {
            System.out.println(count[r[i]] - count[l[i] - 1]);
        }
    }

    public static boolean isPrime(long num) {
        if (num == 2) {
            return true;
        } else if (num < 2 || num % 2 == 0) {
            return false;
        }
        double sqrtNum = Math.sqrt(num);
        for (long i = 3; i <= sqrtNum; i += 2) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
