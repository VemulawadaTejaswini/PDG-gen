import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long k = scanner.nextInt();
        int[] a = new int[n];
        long sum = 0;
        int count = 0;
        int head = 0;
        for (int i = 0; i < a.length; i++) {
            a[i] = scanner.nextInt();
        }

        for (int i = 0; i < a.length; i++) {
            sum = 0;
            for (int j = i; j < a.length; j++) {
                sum += a[j];
                if (sum >= k) {
                    count += a.length - j + 1;
                    break;
                }
            }

        }
        System.out.println(count);
    }
}