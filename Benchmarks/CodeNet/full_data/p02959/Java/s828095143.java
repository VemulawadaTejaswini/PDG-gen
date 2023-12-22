import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Integer[] a = new Integer[n + 1];
        for (int i = 0; i < n + 1; i++) {
            a[i] = sc.nextInt();
        }
        Integer[] b = new Integer[n];
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }

        int result = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] > b[i]) {
                result += b[i];
            } else {
                result += a[i];
                b[i] -= a[i];
                if (a[i + 1] > b[i]) {
                    result += b[i];
                    a[i + 1] -= b[i];
                } else {
                    result += a[i + 1];
                    a[i + 1] = 0;
                }
            }
        }

        System.out.println(result);
    }
}
