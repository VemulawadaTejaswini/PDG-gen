import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] a = new int[n];
        int[] c = new int[n + 1];

        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
            c[i] = 0;
        }
        c[n] = 0;
        for (int i = 0; i < n; i++) {
            c[a[i]]++;
        }
        Arrays.sort(c);

        int answer = 0;
        for (int i = 0; i <= n; i++) {
            if (k >= n) {
                break;
            }
            if (c[i] > 0) {
                answer += c[i];
                k++;
            }
        }
        System.out.println(answer);
    }
}
