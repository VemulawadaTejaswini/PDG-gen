import java.util.*;

class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        int sum_sub = 0;

        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(sc.next());
        }
        for (int i = 0; i < n; i++) {
            b[i] = Integer.parseInt(sc.next());
            sum_sub += (b[i] - a[i]);
        }

        if (sum_sub < 0) {
            System.out.println("No");
            return;
        } else if (sum_sub == 0) {
            System.out.println("Yes");
        } else {
            int now = 0;
            for (int i = 0; i < sum_sub; i++) {
                while (a[now] >= b[now]) {
                    now++;
                    if (now == n - 1) {
                        break;
                    }
                }
                if (a[now] < b[now] || now == n - 1) {
                    a[now] += 2;
                }
            }

            now = 0;
            for (int i = 0; i < sum_sub; i++) {
                while (a[now] <= b[now]) {
                    now++;
                    if (now == n - 1) {
                        break;
                    }
                }
                if (a[now] > b[now] || now == n - 1) {
                    b[now]++;
                }
            }

            for (int i = 0; i < n; i++) {
                if (a[i] != b[i]) {
                    System.out.println("No");
                    return;
                }
            }

            System.out.println("Yes");
        }
    }
}