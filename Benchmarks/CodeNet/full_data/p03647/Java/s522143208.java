import java.util.Scanner;

public class Main {
    void run() {
        Scanner scan = new Scanner(System.in);
        long k = scan.nextLong();
        long[] a = new long[4];
        for (int i = 0; i < 4; i++)
            a[i] = i;
        long n = k / 4;
        for (int i = 0; i < 4; i++)
            a[i] += n;
        n = k % 4;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 4; j++) {
                if (j == i)
                    a[j] += 4;
                else
                    a[j] -= 1;
            }
        }
        System.out.println("4");
        System.out.println(a[0] + " " + a[1] + " " + a[2] + " " + a[3]);
    }
    public static void main(String[] args) {
        new Main().run();
    }
}
