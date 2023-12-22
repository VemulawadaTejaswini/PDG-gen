import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        int n = stdIn.nextInt();
        int l = stdIn.nextInt();
        int[] t = new int[n]; // 味
        for (int i = 0; i < n; i++) {
            t[i] = l + i;
        }
        int sum = t[0];
        int c;
        c = t[0];
        int total = 0;
        for (int i = 0; i < n; i++) {
            total += t[i];
        }
        if (t[n - 1] < 0)
            System.out.println(total - t[n - 1]);
        if (t[0] >= 0)
            System.out.println(total - t[0]);
        for (int i = 1; i < n; i++) {
            if (t[0] >= 0)
                break;
            sum += t[i];
            if (c <= sum) {
                if (Math.abs(total - t[i - 1]) > Math.abs(total - t[i]))
                    System.out.println(total - t[i]);
                else
                    System.out.println(total - t[i - 1]);
                break;
            } else
                c += t[i];
        }
    }
}
