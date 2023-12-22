import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        new Main().solve();
    }

    void solve() {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int W = sc.nextInt();
        char a[][] = new char[H + 2][W + 2];
        String A[] = new String[H];
        for (int i = 0; i < H; i++) {
            A[i] = sc.next();
        }
        for (int i = 0; i < W+2; i++) {
            System.out.print("#");
        }
        System.out.println("");
        for (int i = 0; i < H; i++) {
            System.out.println("#" + A[i] + "#");
        }
        for (int i = 0; i < W+2; i++) {
            System.out.print("#");
        }
    }
}