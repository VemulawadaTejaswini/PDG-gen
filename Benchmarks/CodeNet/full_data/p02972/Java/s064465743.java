import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int count = 0;
        int[] aa = new int[n];
        for (int i = n - 1; 0 <= i; i--) {
            int s = 0;
            for (int j = 2 * i + 1; j < n; j += i + 1) {
                s += aa[j];
            }
            s %= 2;
            if (a[i] + s == 1) {
                count++;
                aa[i] = 1;
            }
        }
        System.out.println(count);
        StringBuilder builder = new StringBuilder();
        if (0 < count) {
            for (int i = 0; i < n; i++) {
                if (aa[i] == 1) {
                    builder.append(i + 1).append(' ');
                }
            }
            System.out.println(builder.substring(0, builder.length() - 1));
        }
    }
}
