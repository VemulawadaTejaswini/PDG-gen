import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        try (Scanner in = new Scanner(System.in)) {
            int N = in.nextInt();
            int K = in.nextInt();
            int[] V = new int[N];
            for (int i = 0; i < N; i++) {
                V[i] = in.nextInt();
            }

            int max = 0;
            int[] array = new int[100];

            int maxGet = Math.min(N, K);
            for (int get = 0; get <= maxGet; get++) {
                int put = K - get;
                for (int getL = 0; getL <= get; getL++) {
                    int getR = get - getL;

                    int size = 0;
                    for (int i = 0; i < getL; i++) {
                        array[size++] = V[i];
                    }
                    for (int i = 0; i < getR; i++) {
                        array[size++] = V[V.length - 1 - i];
                    }

                    Arrays.sort(array, 0, size);

                    int sum = 0;
                    for (int i = put; i < size; i++) {
                        sum += array[i];
                    }
                    max = Math.max(max, sum);
                }
            }
            System.out.println(max);
        }
    }
}
