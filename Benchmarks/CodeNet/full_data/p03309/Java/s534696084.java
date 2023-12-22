import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        long sum = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt() - i;
            sum += arr[i];
        }
        int median = (int) Math.ceil(arr[n / 2]);
        System.out.println(sum - (median * n));
    }
}
