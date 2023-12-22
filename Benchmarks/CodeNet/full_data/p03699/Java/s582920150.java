import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int min = 1000;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            sum += num;
            if (num % 10 != 0) {
                min = Math.min(min, num);
            }
        }

        sc.close();

        if (sum % 10 == 0) {
            sum -= min;
        }

        if (sum % 10 == 0) {
            System.out.println(0);
        } else {
            System.out.println(sum);
        }
    }
}