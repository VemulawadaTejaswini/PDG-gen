import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        new Main().compute();
    }

    void compute() {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int W = sc.nextInt();
        int N = sc.nextInt();
        Queue<Integer> que = new ArrayDeque<>();
        for (int i = 0; i < N; i++) {
            int a = sc.nextInt();
            for (int j = 0; j < a; j++) {
                que.add(i);
            }
        }
        int[][] ans = new int[H][W];
        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                ans[i][j] = que.poll();
            }
        }
        for (int i = 0; i < H; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < W; j++) {
                    System.out.print(ans[i][j] + 1);
                }
            } else {
                for (int j = W - 1; j >= 0; j--) {
                    System.out.print(ans[i][j] + 1);
                }
            }
            System.out.println();
        }
    }
}