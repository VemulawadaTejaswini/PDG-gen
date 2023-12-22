import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = sc.nextInt();
        int[][] differences = new int[c][c];
        int[][] colors = new int[n][n];
        int[][] patterns = new int[3][c];
        for (int i = 0; i < c ; i++) {
            for (int j = 0 ; j < c ; j++) {
                differences[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < n ; i++) {
            for (int j = 0 ; j < n ; j++) {
                colors[i][j] = sc.nextInt();
                patterns[(i+j)%3][colors[i][j]]++;
            }
        }

        // 色の組み合わせの最大値は30P3 = 24360、それぞれにn^2個のマスについて確認するロジックが入る
        // ただめんどくさいわ。回せるかこんなループ。
        // そこであらかじめ、「あまりが0,1,2それぞれの時に、どの色がいくつあるか」を取得しておく
        // こうすることで、24360回ループを回したとしても、計算自体はそこまで多くなくて済む。本当？

        long min = Long.MAX_VALUE;
        for (int i = 0 ; i < c ; i++) {
            for (int j = 0 ; j < c ; j++) {
                if (i != j) {
                    for (int k = 0 ; k < c ; k++) {
                        if (i != k && j != k) {
                            long tmp = 0;
                            for (int m = 0 ; m < c ; m++) {
                                tmp += patterns[0][m] * differences[m][i];
                                tmp += patterns[1][m] * differences[m][j];
                                tmp += patterns[2][m] * differences[m][k];
                            }
                            min = Math.min(tmp, min);
                        }
                    }
                }
            }
        }
        System.out.println(min);
    }
}