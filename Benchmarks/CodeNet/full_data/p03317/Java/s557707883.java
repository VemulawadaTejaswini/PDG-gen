import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int p = 0;
        int[] a = new int[n];
        for (int i = 0 ; i < n ; i++) {
            a[i] = sc.nextInt();
            if (a[i] == 1) {
                p = i + 1;
            }
        }
        int c = 0;
        int temp = p;
        int temp2 = p;

        if (n == k) {
            System.out.println(1);
            return;
        }
        if (p < k && p > n - k + 1) {
            System.out.println(2);
            return;
        }else if (p < k && p <= n - k + 1) {
            c++;
            temp = k;
            while (temp < n) {
                temp += (k - 1);
                c++;
            }
            System.out.println(c);
            return;
        }else if (p >= k && p > n - k + 1) {
            c++;
            temp = n - k + 1;
            while (temp > 1) {
                temp -= (k - 1);
                c++;
            }
            System.out.println(c);
            return;
        } else {
            while (temp < n ) {
                temp += (k - 1);
                c++;
            }
            while (temp2 > 1) {
                temp2 -= (k - 1);
                c++;
            }
        }


        System.out.println(c);
    }

}