import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] a = new int[n];

        int p = 0;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            if (a[i] == 1) {
                p = i;
            }
        }

        int c = 0;
        if (p == 0 || p == n-1) {
            if (n-p <= k) {
                c += n / k;
            } else {
                c += n / k + 1;
            }
        } else {
            if (p+1 <= k) {
                c++;
            } else {
                if ((p+1) % k == 0) {
                    c += (p+1) / k;
                } else {
                    c += (p+1) / k + 1;
                }
            }

            if (n-p+1 <= k) {
                c++;
            } else {
                if ((n-p+1) % k == 0) {
                    c += (n-p+1) / k;
                } else {
                    c += (n-p+1) / k + 1;
                }
            }
        }

        System.out.println(c);
    }
}
