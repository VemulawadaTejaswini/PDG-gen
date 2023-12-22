import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        long n = 0, k = 0;
        boolean flag = false;
        Scanner sc = new Scanner(System.in);
        if (k == 0) {
            System.out.println(n * n);
            sc.close();
            flag = true;
        }
        if (flag) {
            long res = 0;
            for (long i = k + 1; i <= n; i++) {
                res += n / i * (i - k);
                res += (n % i - k + 1 > 0) ? n % i - k + 1 : 0;
            }
            System.out.println(res);
            sc.close();
        }
    }
}