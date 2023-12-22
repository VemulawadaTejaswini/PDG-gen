import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];

        int minIndex = 0;
        int maxIndex = 0;

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            if (a[minIndex] > a[i])
                minIndex = i;
            else if (a[maxIndex] < a[i])
                maxIndex = i;
        }

        while (a[maxIndex] > 0) {
            if (a[maxIndex] < a[minIndex]) {
                Arrays.sort(a);
                maxIndex = n-1;
                minIndex = 0;
            }
            a[maxIndex] -= a[minIndex];
        }

        System.out.println(a[minIndex]);
    }
}
