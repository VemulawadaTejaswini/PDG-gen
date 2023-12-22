import java.lang.Math;
import java.util.Scanner;
import java.util.Arrays;

class Main {
    public static int gcdOfArray(int[] arr) {
        int result = arr[0];
        for (int i = 1; i < arr.length; i++) {
            result = gcd(arr[i], result);
        }
        return result;
    }

    public static int gcd(int a, int b) {
        return a == 0 ? b : gcd(b % a, a);
      }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] A = new int[N];

        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        int largestGCD = 0;

        for (int i = 0; i < N; i++) {
            int[] removed = Arrays.copyOf(A, N);
            removed[i] = i == 0 ? A[1] : A[i-1];
            int gcd = gcdOfArray(removed);

            if (gcd > largestGCD) { largestGCD = gcd; }
        }

        System.out.println(largestGCD);
    }
}
