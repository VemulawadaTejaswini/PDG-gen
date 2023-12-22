import java.util.Arrays;
import java.util.Scanner;

/**
 * ABC111C
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] ai1 = new int[100050];
        int[] ai2 = new int[100050];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            if (i % 2 == 1) {
                ai1[a[i]]++;
            } else {
                ai2[a[i]]++;
            }
        }
        int oddMax = 0;
        int oddMaxV = 0;
        int evenMax = 0;
        int evenMaxV = 0;
        for (int i = 0; i < ai1.length; i++) {
            if (oddMax < ai1[i]) {
                oddMax = ai1[i];
                oddMaxV = i;
            }
            if (evenMax < ai2[i]) {
                evenMax = ai2[i];
                evenMaxV = i;
            }
        }
        Arrays.sort(ai1);
        Arrays.sort(ai2);
        if (oddMaxV == evenMaxV) {
            System.out.println(Math.max(n - ai1[ai1.length - 2] - ai2[ai2.length - 1],
                    n - ai1[ai1.length - 1] - ai2[ai2.length - 2]));
        } else {
            System.out.println(n - ai1[ai1.length - 1] - ai2[ai2.length - 1]);
        }
        sc.close();
    }
}