import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] c = new int[n - 1];
        int[] s = new int[n - 1];
        int[] f = new int[n - 1];
        for (int i = 0; i < n - 1; i++) {
            c[i] = sc.nextInt();
            s[i] = sc.nextInt();
            f[i] = sc.nextInt();
        }
        for (int i = 0; i < n - 1; i++) {
            int t = s[i] + c[i];
            for (int j = i + 1; j < n - 1; j++) {
                int k = 0;
                while (true) {
                    if (t <= k * f[j] + s[j]) {
                        t = k * f[j] + s[j] + c[j];
                        break;
                    }
                    k++;
                }
            }
            System.out.println(t);
        }
        System.out.println(0);
    }
}