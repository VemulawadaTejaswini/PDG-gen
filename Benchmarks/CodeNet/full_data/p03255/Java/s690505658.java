import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] array = scanner.nextLine().split(" ");

        int N = Integer.parseInt(array[0]);
        int X = Integer.parseInt(array[1]);

        long[] a = new long[N];

        array = scanner.nextLine().split(" ");

        for (int i = 0; i < N; ++i) {
            a[i] = Long.parseLong(array[i]);
        }

        long min = Long.MAX_VALUE;
        for (int i = N; i > 0; --i) {
            long sum = 0;
            for (int j = 0; j < N; ++j) {
                int w = 1 + (N - j + i - 1) / i;
                if (w == 2) {
                    sum += 5 * a[j] + X * 2;
                } else {
                    sum += (2 * w - 1) * a[j] + X;
                }
            }
            if (min > sum) {
                min = sum;
            }
        }

        System.out.println(min);
    }
}