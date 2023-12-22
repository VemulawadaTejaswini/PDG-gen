import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n - 1];
        int[] b = new int[n - 1];
        int[] c = new int[n];
        for (int i = 0 ; i < n - 1 ; i++) {
            a[i] = sc.nextInt() - 1;
            b[i] = sc.nextInt() - 1;
        }
        int sum = 0;
        for (int i = 0 ; i < n ; i++) {
            c[i] = sc.nextInt();
            sum += c[i];
        }
        Arrays.sort(c);

        int[] e = new int[n];
        e[a[0]] = c[n - 1];
        e[b[0]] = c[n - 2];
        for (int i = 2 ; i < n ; i++) {
            for (int j = 0 ; j < n - 1 ; j++) {
                if (e[a[j]] * e[b[j]] == 0 && e[a[j]] + e[b[j]] != 0) {
                    if (e[a[j]] == 0) {
                        e[a[j]] = c[n - 1 - i];
                        break;
                    } else {
                        e[b[j]] = c[n - 1 - i];
                        break;
                    }
                }
            }
        }

        System.out.println(sum - c[n - 1]);
        for (int i = 0 ; i < n - 1 ; i++) {
            System.out.print(e[i]);
            System.out.print(" ");
        }

        System.out.print(e[n - 1]);
        System.out.println("");
    }

}