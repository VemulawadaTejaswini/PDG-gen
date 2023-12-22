import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int N = scan.nextInt();
        int A = scan.nextInt();
        int B = scan.nextInt();
        int C = scan.nextInt();
        int D = scan.nextInt();
        String S = scan.next();
        char[] data = S.toCharArray();
        int[] sum_rock = new int[N+1];
        int[] sum_empty = new int[N+1];
        sum_rock[0] = 0;
        sum_empty[0] = 0;
        for (int i = 0; i < N; i++) {
            if (data[i] == '#') {
                sum_rock[i + 1] = sum_rock[i] + 1;
                sum_empty[i + 1] = 0;
            } else {
                sum_rock[i + 1] = 0;
                sum_empty[i + 1] = sum_empty[i] + 1;
            }
        }
        boolean cannot_move_A_to_C = false;
        for (int i = A; i <= C; i++) {
            if (2 <= sum_rock[i]) {
                cannot_move_A_to_C = true;
                break;
            }
        }
        boolean cannot_move_B_to_D = false;
        for (int i = B; i <= D; i++) {
            if (2 <= sum_rock[i]) {
                cannot_move_B_to_D = true;
                break;
            }
        }
        boolean answer = solve(sum_empty, cannot_move_A_to_C, cannot_move_B_to_D, A, B, C, D);
        System.out.println(answer ? "Yes" : "No");
    }
    public static boolean solve(int[] sum_empty, boolean cannot_move_A_to_C, boolean cannnot_move_B_to_D, int A, int B, int C, int D) {
        if (cannot_move_A_to_C || cannnot_move_B_to_D) {
            return false;
        }
        // A<C<B<D
        // BをDに移動して、AをCに移動する
        if (C < B) {
            return true;
        }
        // A<B<C<D
        // BをDに移動して、AをCに移動する
        if (B < C && C < D) {
            return true;
        }
        // A<B<D<C
        // AをCに移動して、BをDに移動する
        // AがBを追い越す場所があるが
        if (D < C) {
            if (can_jump(sum_empty, B, D)) {
                return true;
            }
        }
        return false;
    }
    public static boolean can_jump(int[] sum_empty, int B, int D) {
        if (B + 1 == D) {
            return 2 < sum_empty[D];
        }
        if (B + 2 == D) {
            return 2 < sum_empty[D];
        }
        if (sum_empty[B+1] == 0) {
            for(int i = B+1; i <= D; i++) {
                if (2 < sum_empty[i]) {
                    return true;
                }
            }
        } else {
            for (int i = B; i <= D; i++) {
                if (2 < sum_empty[i]) {
                    return true;
                }
            }
        }
        return false;
    }
}
