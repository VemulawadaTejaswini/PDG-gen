
import java.util.Scanner;


public class Main {
    public static void main(String main[]) {
        //input should be grater than 2
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = getIntArrayInput(n, sc);
        int[] dp = new int[n];

        int max = 0;
        for (int i = n - 2; i >= 0; i--) {
            int curr = arr[i];
            if (curr >= arr[i + 1]) {
                dp[i] = dp[i + 1] + 1;
                max = Math.max(dp[i], max);
            }

        }

        System.out.println((max - 1) > 0 ? max : 0);
    }


    static int[] getIntArrayInput(int length, Scanner scn) {
        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            arr[i] = scn.nextInt();
        }
        return arr;
    }


}