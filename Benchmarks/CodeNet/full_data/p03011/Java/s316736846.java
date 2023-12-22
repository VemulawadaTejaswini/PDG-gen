import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] a = new int[3];

        for (int i = 0; i < 3; i++) {
            a[i] = sc.nextInt();
        }

        int sum = 0;
        int max = 0;

        for (int i = 0; i < 3; i++) {
            sum += a[i];

            if (a[i] > max) {
                max = a[i];
            }
        }

        System.out.println(sum - max);
    }
}