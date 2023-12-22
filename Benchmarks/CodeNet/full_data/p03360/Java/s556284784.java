import java.util.Arrays;
import java.util.Scanner;

class Main {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        long[] a = new long[3];
        for (int i = 0; i < 3; i++) {
            a[i] = sc.nextLong();
        }
        int k = sc.nextInt();
        Arrays.sort(a);
        for (int i = 0; i < k; i++) {
            a[2] *= 2;
        }
        System.out.println(a[0] + a[1] + a[2]);
    }
}