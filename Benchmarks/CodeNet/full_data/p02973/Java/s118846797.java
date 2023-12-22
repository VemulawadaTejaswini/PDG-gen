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
                if (colorToA[0] >= A[i]) {
                } else {
                    int l = 0;
                    int r = numColors;
                    for (; l < r;) {
                        int c = (l + r) / 2;
                        if (c == l) {
                            break;
                        }
//                    if (colorToA[c] == A[i] && (c > 0 && colorToA[c - 1] != colorToA[c])) {
//                        maxAColor = c;
//                        break;
//                    } else 
                        if (colorToA[c] < A[i]) {
                            l = c;
                        } else {
                            r = c;
                        }
                    }
                    maxAColor = l;
                }
//                for (int color = 0; color < numColors; color++) {
//                    if (colorToA[color] < A[i]) {
//                        maxAColor = color;
//                        break;
//                    }
//                }

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

    private static int lb(int[] a, int l, int r, int key) {
        int index = Arrays.binarySearch(a, l, r, key);
        while (index > 0 && a[index - 1] == a[index]) {
            index = Arrays.binarySearch(a, l, index - 2, key);
        }
        return index;
    }
}
