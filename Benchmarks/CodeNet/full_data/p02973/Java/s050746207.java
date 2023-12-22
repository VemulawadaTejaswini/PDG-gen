import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        try (Scanner in = new Scanner(System.in)) {
            int N = in.nextInt();
            int[] A = new int[N];
            for (int i = 0; i < N; i++) {
                A[i] = in.nextInt();
            }

            int numColors = 1;
            int[] colorToA = new int[N];
            colorToA[0] = -A[0];
            for (int i = 1; i < N; i++) {
                int maxAColor = -1;

                int index = Arrays.binarySearch(colorToA, 0, numColors, -(A[i] - 1));
                if (index >= 0) {
                    maxAColor = index;
                } else {
                    index = -index - 1 - 1;
                    if (index - 1 >= 0) {
                        maxAColor = index - 1;
                    }
                }

                if (maxAColor == -1) {
                    colorToA[numColors] = -A[i];
                    numColors++;
                } else {
                    colorToA[maxAColor] = -A[i];
                }
            }
            System.out.println(numColors);
        }
    }
}
