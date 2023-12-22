import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] values = new int[n];

        for (int i = 0; i < n; i++) {
            values[i] = sc.nextInt();
        }

        int total = 0;
        for (int i = 0; i < n; i++) {
            int val = values[i] - sc.nextInt();
            total += val > 0 ? val : 0;
        }

        System.out.println(total);

    }
}