import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        new Main().compute();
    }

    void compute() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] a = new int[N];
        int[] b = new int[N];
        Integer[] c = new Integer[N];
        for (int i = 0; i < N; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
            c[i] = i;
        }
        Arrays.sort(c, (o1, o2) -> a[o1] - a[o2]);
        int ruikei = 0;
        for (int i = 0; i < N; i++) {
            ruikei += b[i];
            if (ruikei >= K) {
                System.out.println(a[i]);
                return;
            }
        }
    }
}
