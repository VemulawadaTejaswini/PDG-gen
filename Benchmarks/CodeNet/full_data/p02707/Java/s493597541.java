import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int[] B = new int[N];
        B[N - 2] = 0;

        for (int i = 0; i < N - 1; i++) {
            B[Integer.parseInt(sc.next()) - 1]++;
        }

        PrintWriter out = new PrintWriter(System.out);
        for (int i = 0; i < N; i++) {
            out.println(B[i]);
            out.flush();
        }

        sc.close();
    }
}