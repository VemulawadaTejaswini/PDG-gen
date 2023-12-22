import java.util.*;

class Main {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int count = 0;
        int[] balls = new int[n];
        for (int i = n; i > 0; i--) {
            int ai = a[i - 1];
            int flg = 0;
            for (int j = i * 2; j <= n; j += i) {
                flg = (flg + a[j - 1]) % 2;
            }
            ai = ai == flg ? 0 : 1;
            if (ai == 1) {
                balls[count] = i;
                count++;
            }
        }
        System.out.println(count);
        for (int i = 0; i < count; i++) {
            System.out.print(balls[i] + " ");
        }
        sc.close();
    }
}
