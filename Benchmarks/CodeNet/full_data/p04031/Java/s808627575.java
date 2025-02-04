import java.util.Scanner;

/**
 * Created by wild on 16/08/13.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] num = new int[n];
        for (int i = 0; i < n; i++) {
            num[i] = scan.nextInt();
        }

        int resultMin = Integer.MAX_VALUE;

        for (int i = -100; i <= 100; i++) {
            int resultTmp = 0;
            for (int j = 0; j < num.length; j++) {
                resultTmp += Math.pow(num[j] - i, 2);
            }
            if (resultTmp < resultMin) {
                resultMin = resultTmp;
            }
        }

        System.out.println(resultMin);
    }
}