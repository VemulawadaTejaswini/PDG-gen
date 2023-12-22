import java.util.Scanner;

// B - Palindrome-philia
// https://atcoder.jp/contests/abc147/tasks/abc147_b
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.next());
        Long[] arr = new Long[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Long.parseLong(scanner.next());
        }
        scanner.close();

        long sum = 0;
        for (int i = 0; i < N - 1; i++) {
            long left = arr[i];
            for (int j = i + 1; j < N; j++) {
                long right = arr[j];

                long num = left ^ right;
                sum += num;

            }
        }

        System.out.println(sum % (long) (Math.pow(10, 9) + 7));
    }
}
