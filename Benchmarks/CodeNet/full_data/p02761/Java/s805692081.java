import java.util.Scanner;

/**
 * TITLE : Guess The Number
 * URL : https://atcoder.jp/contests/abc157/tasks/abc157_c
 */
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] number = new int[N];
        for (int i = 0; i < N; i++) {
            number[i] = -1;
        }

        int M = sc.nextInt();
        for (int i = 0; i < M; i++) {
            int S = sc.nextInt();
            int C = sc.nextInt();
            if (number[S - 1] == -1 || number[S - 1] == C) {
                number[S - 1] = C;
            } else {
                System.out.println(-1);
                return;
            }
        }

        if (number[0] == 0 && number.length != 1) {
            System.out.println(-1);
            return;
        } else if (number[0] == 0 && number.length == 1) {
            System.out.println(0);
            return;
        } else if (number[0] == -1) {
            number[0] = 1;
        }

        String answer = "";
        for (int i = 0; i < N; i++) {
            if (number[i] == -1) {
                number[i] = 0;
            }
            answer += number[i];
        }

        System.out.println(answer);
        sc.close();
    }
}ｖ