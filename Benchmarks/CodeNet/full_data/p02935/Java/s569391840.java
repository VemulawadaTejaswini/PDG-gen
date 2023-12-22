import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        Float[] a = new Float[N];
        for (int i = 0; i < N; i++)
            a[i] = (float) sc.nextInt();
        float sum = 0.0f;

        Arrays.sort(a, Comparator.reverseOrder());

        for (int i = 0; i < N; i++) {
            sum += a[i] / Math.pow(2, i);
        }

        sum += a[N - 1] / Math.pow(2, N-1);

        System.out.println(sum / 2);
    }
}