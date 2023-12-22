import java.util.Scanner;

public class Main {
    public static void main(String[] arge) {
        new Main().run();
    }

    private void run() {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] a = new int[N];
        int min = Integer.MAX_VALUE;
        int minIndex = 0;
        for (int i = 0; i < N; i++) {
            a[i] = scanner.nextInt();
            if (min > a[i]) {
                min = a[i];
                minIndex = i;
            }
        }

        int count = 0;
        do {
            count = 0;
            int tmp = minIndex;
            for (int i = 0; i < N; i++) {
                if (tmp == i) continue;
                a[i] = a[i] % a[minIndex];
                if (a[i] == 0) count++;
                if (a[i] != 0 && a[i] < min) {
                    min = a[i];
                    minIndex = i;
                }
            }
        } while (count != N-1);
        System.out.println(min);

    }
}