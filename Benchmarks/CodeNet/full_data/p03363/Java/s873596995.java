import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = Integer.parseInt(scanner.nextLine());
        long[] sums = new long[N];
        String[] array = scanner.nextLine().split(" ");
        long sum = 0;
        for (int i = 0; i < N; ++i) {
            sum += Long.parseLong(array[i]);
            sums[i] = sum;
        }
        long count = 0;
        {
            long subCount = 0;
            for (int i = 0; i < N; ++i) {
                if (sums[i] == 0) {
                    ++subCount;
                }
            }
            count += (subCount * (subCount + 1)) / 2;
        }
        for (int i = 0; i < N; ++i) {
            if (sums[i] != 0) {
                long subCount = 0;
                long c = sums[i];
                for (int j = i + 1; j < N; ++j) {
                    if (sums[j] == c) {
                        sums[j] = 0;
                        ++subCount;
                    }
                }
                count += (subCount * (subCount + 1)) / 2;
            }
        }
        System.out.println(count);
    }
}