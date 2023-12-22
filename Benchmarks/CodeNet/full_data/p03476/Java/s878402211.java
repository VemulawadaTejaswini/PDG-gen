import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[] tmp = new int[10001];
        for (int i = 1; i < tmp.length; i++) {
            if (isPrime(i) && isPrime((i + 1) / 2)) {
                tmp[i] = tmp[i - 1] + 1;
            } else {
                tmp[i] = tmp[i - 1];
            }
        }
        Scanner sc = new Scanner(System.in);
        int Q = sc.nextInt();
        for (int i = 0; i < Q; i++) {
            int left = sc.nextInt();
            int right = sc.nextInt();
            System.out.println(tmp[right] - tmp[left - 1]);
        }
    }

    private static boolean isPrime(int num) {

        if (num <= 1) {
            return false;
        }
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}