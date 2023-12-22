import java.util.*;

class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        int sum_sub = 0;
        int sum_a = 0, sum_b = 0;
        int tmp = -1;

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
            sum_sub += (a[i] - b[i]);
        }

        if (sum_sub > 0) {
            System.out.println("No");
            return;
        } else if (sum_sub == 0) {
            System.out.println("Yes");
        } else {
            int now = 0;
            while (tmp != 0) {
                sum_a = 0;
                sum_b = 0;
                tmp = 0;

                if (a[now] == b[now]) {
                    now++;
                }
                if (a[now] > b[now]) {
                    b[now]++;

                    int hoge = now + 1;
                    if (hoge == n) {
                        hoge--;
                    }

                    a[hoge] += 2;
                } else if (a[now] < b[now]) {
                    a[now] += 2;

                    int hoge = now + 1;
                    if (hoge == n) {
                        hoge--;
                    }

                    b[hoge]++;
                }

                

                for (int i = 0; i < n; i++) {
                    if (a[i] != b[i]) {
                        tmp++;
                    }
                    sum_a += a[i];
                    sum_b += b[i];
                }

                if (sum_a > sum_b) {
                    System.out.println("No");
                    return;
                }
            }
            System.out.println("Yes");
        }
    }
}