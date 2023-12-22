
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        double sum = 0;
        long [] pow = new long[21];
        pow[0] = 1;
        for (int i = 1; i <= 20; ++i) {
            pow[i] = pow[i - 1] * 2;
          //  System.out.println("pow: " + pow[i]);
        }
        List<Long> pows = new ArrayList<>();
        for (int i = 0 ;i <= 20; ++i) {
            pows.add(pow[i]);
        }
        for (int i = 1; i <= n; ++i) {
            long target = k / i;
         //   System.out.println("target: " + target);
            int find = Collections.binarySearch(
                    pows,
                    target);
            int times;
            if (find >= 0 && find <= 20) {
                if (pows.get(find) == target) {
                    times = find;
                } else {
                    times = -1 * (find + 1);
                }
            } else {
                times = -1 * (find + 1);
            }
            if (Math.pow(2, times) * i < k) {
                times++;
            }

        //    System.out.println("i: " + i + " times: " + times + " add: " + Math.pow(2, times));
            sum += Math.pow(0.5, times);
       //     System.out.println("sum: " + sum);
        }
        sum /= n;
        System.out.println(sum);
    }

    public static int log(int x, int base)
    {
        return (int) (Math.log(x) / Math.log(base));
    }
}
