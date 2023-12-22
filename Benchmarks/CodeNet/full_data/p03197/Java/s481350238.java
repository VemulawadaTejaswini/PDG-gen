import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        try (Scanner in = new Scanner(System.in)) {
            int N = in.nextInt();
            int[] a = new int[N];
            for (int i = 0; i < N; i++) {
                a[i] = in.nextInt();
            }

            boolean win1 = false;
            for (int i = 0; i < N; i++) {
                win1 = a[i] % 2 == 1;
            }
            System.out.println(win1 ? "first" : "second");
        }
    }
}
