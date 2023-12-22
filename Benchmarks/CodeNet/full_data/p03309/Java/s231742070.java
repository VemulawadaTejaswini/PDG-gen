import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        long sum = 0;
        int median;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt() - (i + 1);
            sum += arr[i];
        }

        Arrays.sort(arr);
        if (n % 2 == 0)
            median = (arr[(n - 1) / 2] + arr[n / 2]) / 2;
        else
            median = arr[n / 2];

        sum = 0;
        for (int i = 0; i < n; i++) {
            sum += Math.abs(arr[i] - median);
        }
        System.out.println(sum);
    }
}
