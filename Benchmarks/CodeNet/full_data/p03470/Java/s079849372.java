import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] mochi = new int[n];
        for (int i = 0; i < mochi.length; i++) {
            mochi[i] = sc.nextInt();
        }

        Arrays.sort(mochi);
        int step = 1;
        int max_mochi = mochi[mochi.length - 1];
        for (int i = mochi.length - 2; i >= 0; i--) {
            if (mochi[i] < max_mochi) {
                step++;
                max_mochi = mochi[i];
            }
        }

        System.out.println(step);
    }
}