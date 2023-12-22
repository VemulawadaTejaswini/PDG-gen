import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int N = Integer.parseInt(sc.next());
        int[] H = new int[N];
        for (int i = 0; i < N; i++) {
            H[i] = Integer.parseInt(sc.next());
        }
        sc.close();

        int max = 0;
        for (int i = 0; i < N; i++) {
            int move = 0;
            for (int j = i; j < N-1; j++) {
                if (H[j] < H[j+1]) {
                    break;
                }
                move++;
            }
            if (max < move) {
                max = move;
            }
        }

        out.printf("%d\n", max);
        out.flush();
    }
}
