import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        if (N <= 3 || N % 2 == 1) {
            System.out.println(-1);
        } else {
            int cur = 0;
            int i = 0;
            int j = 0;
            char[][] arr = new char[N][N];
            for (int ii = 0; ii < N; ++ii) {
                for (int jj = 0; jj < N; ++jj) {
                    arr[ii][jj] = '.';
                }
            }
            while (i < N) {
                arr[i][j] = arr[i][j + 1] = (char) ('a' + cur);
                cur = (cur + 1) % 26;
                ++i;
                j = (j + 2) % N;
            }

            for (int ii = 0; ii < N; ++ii) {
                for (int jj = 0; jj < N; ++jj) {
                    System.out.print(arr[ii][jj]);
                } System.out.println();
            }

        }
    }
}