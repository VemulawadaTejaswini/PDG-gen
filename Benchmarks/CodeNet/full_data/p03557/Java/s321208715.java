import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.StringJoiner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] as = new int[N];
        for (int i = 0; i < N; i++) {
            as[i] = sc.nextInt();
        }
        int[] bs = new int[N];
        for (int i = 0; i < N; i++) {
            bs[i] = sc.nextInt();
        }
        int[] cs = new int[N];
        for (int i = 0; i < N; i++) {
            cs[i] = sc.nextInt();
        }

        System.out.println( solve(N, as, bs, cs) );
    }

    private static int solve(int N, int[] as, int[] bs, int[] cs) {
        Arrays.sort(as);
        Arrays.sort(bs);
        Arrays.sort(cs);

        int[] counts_b = new int[N];
        for (int i = N -1; i >= 0; i--) {
            int b = bs[i];
            int result = Arrays.binarySearch(cs, b);
            int index = result >= 0 ? result : ~result;

            if( b == cs[index] ) {
                counts_b[i] = N - index - 1;

            } else {
                counts_b[i] = N - index;
            }
            if( i != N - 1 ) {
                counts_b[i] += counts_b[i+1];
            }
        }

        int sum = 0;
        for (int i = 0; i < N; i++) {
            int a = as[i];
            int result = Arrays.binarySearch(bs, a);
            int index = result >= 0 ? result : ~result;

            if( index < N ) {
                if( a == bs[index] ) {
                    if( index + 1 < N ) {
                        sum += counts_b[index + 1];
                    }

                } else {
                    sum += counts_b[index];
                }
            }
        }

        return sum;
    }

    private static void show(int[] array) {
        StringJoiner j = new StringJoiner(" ");
        for (int i : array) {
            j.add("" + i);
        }
        System.err.println( j.toString() );
    }

    private static int sum(int[] array, int from) {
        int sum = 0;
        for (int i = from; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }
}
