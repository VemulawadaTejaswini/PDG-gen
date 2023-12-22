import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        int n = stdIn.nextInt();
        int l = stdIn.nextInt();
        int[] t = new int[n]; // 味
        int sum = 0;
        int total = 0;
        for (int i = 0; i < n; i++) {
            total += t[i];
        }
        for (int i = 0; i < n; i++) {
            t[i] = l + i;
        }
        int flag = t[0];
        if (t[0] < 0) {
            for (int i = 1; i < n; i++) {
                sum += t[i];
                if (flag <= sum) {
                    System.out.println(total - t[i]);
                } else
                    flag += t[i];
            }
        } else {
            System.out.println(total - t[0]);
        }
        if (t[n - 1] <= 0) {
            System.out.println(total - t[n - 1]);
        }
    }
}