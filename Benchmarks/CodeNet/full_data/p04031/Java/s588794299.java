import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Integer[] a = new Integer[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int sum = 0;
        for (int num : a) {
            sum += num;
        }
        int ave = sum % n == 0 ? sum / n : sum / n + 1;

        int result = 0;
        for (int num : a) {
            result += Math.abs(num - ave) * Math.abs(num - ave);
        }

        System.out.println(result);
    }
}
