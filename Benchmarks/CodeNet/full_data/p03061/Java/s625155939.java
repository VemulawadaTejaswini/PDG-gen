import java.util.Arrays;
import java.util.Scanner;

public class Main {
    void run() {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = scan.nextInt();

        int h = 0;
        int max = a[0];
        for (int i = 0; i < n; i++) {
            if (a[0] != a[i]) {
                h++;
                max = Math.max(a[i], max);
            }
        }
        if (h  < 2) {
            System.out.println(max);
            return;
        }


        int ans = 0;
        for (int i = 1; i < Math.sqrt(Math.pow(10, 9)); i++) {
            int f = 0;
            for (int j = 0; j < n; j++) {
                if (a[j] % i != 0)
                    f++;
            }
            if (f < 2)
                ans = i;
        }
        System.out.println(ans);
    }

    int gcd (int a, int b) {
        int temp;
        while((temp = a%b)!=0) {
            a = b;
            b = temp;
        }
        return b;
    }

    public static void main(String[] args) {
        new Main().run();
    }
}
