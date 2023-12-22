import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int N = sc.nextInt();
        int[] L = new int[N];
        for (int i = 0; i < N; i++) {
            L[i] = sc.nextInt();
        }
        sc.close();

        Arrays.sort(L);

        int count = 0;
        for (int i = N - 1; i >= 2; i--) {
            for (int j = i - 1; j >= 1; j--) {
                if (isTriangle(L[i], L[j], L[j - 1])) {
                    int max = j - 1;
                    int min = 0;
                    while (max > min) {
                        int k = (max + min) / 2;
                        if (isTriangle(L[i], L[j], L[k])) {
                            max = k;
                        } else {
                            min = k + 1;
                        }
                    }
                    count += (j - min);
                }
            }
        }
        out.printf("%d\n", count);
        out.flush();
    }
    static boolean isTriangle(int a, int b, int c) {
        boolean result = false;
        if ((a < b + c) && (b < c + a) && (c < a + b)) {
            result = true;
        }
        return result;
    }
}
