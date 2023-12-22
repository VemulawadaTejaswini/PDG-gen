package _2017_like_number;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean isPrime[] = new boolean[100001];
        for (int i = 0; i <= 100000; i++) {
            isPrime[i] = true;
        }
        isPrime[0] = false;
        isPrime[1] = false;
        for (long i = 2; i <= 100000; i++) {
            for (long j = i * 2; j <= 100000; j += i) {
                isPrime[(int) j] = false;
            }
        }

        boolean isLike2017[] = new boolean[100001];
        for (int i = 0; i <= 100000; i++) {
            isLike2017[i] = isPrime[i] && isPrime[(i + 1) / 2];
        }
        int sum[] = new int[100002];
        sum[0] = 0;
        for (int i = 0; i <= 100000; i++) {
            sum[i + 1] = sum[i];
            if (isLike2017[i]) {
                sum[i + 1]++;
            }
        }

        for (int i = 0; i <= 40; i++) {
            System.out.print(sum[100000-i]);
            System.out.print(" ");
        }
        System.out.println();
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            int l = in.nextInt();
            int r = in.nextInt();
            System.out.println(sum[r + 1] - sum[l]);
        }
    }
}
