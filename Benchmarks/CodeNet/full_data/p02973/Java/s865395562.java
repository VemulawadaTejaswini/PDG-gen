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
            colorToA[0] = A[0];
            for (int i = 1; i < N; i++) {
                int maxAColor = -1;
                if (colorToA[0] >= A[i]) {
                } else {
                    int l = 0;
                    int r = numColors;
                    for (; l < r;) {
                        int c = (l + r) / 2;
                        if (c == l) {
                            break;
                        }
                        if (colorToA[c] < A[i] && (c - 1 < 0 || colorToA[c - 1] != colorToA[c])) {
                            l = c;
                        } else {
                            r = c;
                        }
                    }
                    maxAColor = l;
                }

                if (maxAColor == -1) {
                    colorToA[numColors] = A[i];
                    numColors++;
                } else {
                    colorToA[maxAColor] = A[i];
                }
            }
            System.out.println(numColors);
        }
    }

}
