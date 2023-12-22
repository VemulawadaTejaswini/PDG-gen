import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);

        int n = stdin.nextInt();
        int[] a = new int[n];
        int count = 0;
        boolean existOdd = false;

        for (int i = 0; i < n; i++)
            a[i] = stdin.nextInt();

        while (!existOdd) {
            for (int i = 0; i < n; i++) {
                if (a[i] % 2 == 1) {
                    existOdd = true;
                    break;
                }

                a[i] /= 2;
            }
            count++;
        }

        System.out.println(count - 1);
    }
}
