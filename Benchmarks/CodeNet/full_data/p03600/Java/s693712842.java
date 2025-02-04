//package abc074_d;

import java.util.Scanner;

public class Main {

    private static int N;
    private static int[][] SRC;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        SRC = new int[N][N];
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < N; j++) {
                SRC[i][j] = sc.nextInt();
            }
        }
        long ans = 0;
        for(int i = 0; i < N-1; i++) {
            for(int j = i+1; j < N; j++) {
                boolean necessary = true;
                for(int k = 0; k < N; k++) {
                    if(k == i || k == j) continue;
                    if(SRC[i][j] > SRC[i][k] + SRC[k][j]) {
                        System.out.println(-1);
                        return;
                    }
                    if(SRC[i][j] == SRC[i][k] + SRC[k][j]) {
                        necessary = false;
                    }
                }
                if(necessary) ans += SRC[i][j];
            }
        }
        System.out.println(ans);
    }
}
