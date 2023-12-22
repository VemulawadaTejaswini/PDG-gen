import java.util.Scanner;

public class Main {

    private static boolean[] prime = new boolean[100001];

    private static boolean isPrime(int x) {
        if (x < 2) {
            return false;
        } else if (x == 2) {
            return true;
        }
        if (x % 2 == 0) {
            return false;
        }
        for (int i = 3; i * i <= x; i += 2) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        int[] l = new int[q];
        int[] r = new int[q];
        for (int i = 0; i < q; i++) {
            l[i] = sc.nextInt();
            r[i] = sc.nextInt();
        }
        for (int i = 2; i <= 100000; i++) {
            prime[i] = isPrime(i);
        }
        int[] primeSum = new int[100001];
        int sum = 0;
        for (int i = 0; i <= 100000; i++) {
            if (prime[i] && prime[(i + 1) / 2]) {
                sum++;
            }
            primeSum[i] = sum;
        }
        for (int i = 0; i < q; i++) {
            System.out.println(primeSum[r[i]] - primeSum[l[i] - 1]);
        }
    }

}
