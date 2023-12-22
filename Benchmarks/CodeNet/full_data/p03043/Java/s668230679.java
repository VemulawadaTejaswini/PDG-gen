import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        double ans = 0;
        for (int i = 1; i <= N; i++) {
            double p = (double) 1 / N;
            int j = i;
            while (j < K) {
                p /= 2;
                j *= 2;
            }
            ans += p;
        }
        System.out.println(ans);
    }

}
