import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int [n];
        for (int i = 0 ; i < n ; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        int firstNum = a[n-1];
        if (n == 2) {
            System.out.println(Math.max(a[0], a[1]) + " " + Math.min(a[0], a[1]));
        } else {
            int halfN = firstNum;
            int smallNum = 0;
            int currentDiff = halfN;
            for (int i = 0 ; i < n - 1 ; i++) {
                int diff = Math.abs(halfN - 2 *a[i]);
                if (diff < currentDiff) {
                    currentDiff = diff;
                    smallNum = a[i];
                }
                //diffが最小になるようなa[i]を求める。

            }
            System.out.println(firstNum + " " + smallNum);

        }
    }

}