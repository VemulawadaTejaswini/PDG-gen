import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        Integer[] a = new Integer[N];
        for (int i = 0; i < N; i++) {
            a[i] = scanner.nextInt();
        }
        Arrays.sort(a, Comparator.reverseOrder());

        int alicePoint = 0;
        int bobPoint = 0;
        for (int i = 0; i < N; i++) {
            if (i % 2 == 0) {
                alicePoint += a[i];
            } else {
                bobPoint += a[i];
            }
        }

        System.out.println(alicePoint - bobPoint);
    }
}
