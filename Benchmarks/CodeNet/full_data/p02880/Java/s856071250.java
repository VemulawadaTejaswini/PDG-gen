import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        PrintWriter out = new PrintWriter(System.out);
        if (N > 81) {
            out.println("No");
            sc.close();
            out.flush();
            return;
        }

        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                if (i * j == N) {
                    out.println("Yes");
                    sc.close();
                    out.flush();
                    return;
                }
            }
        }

        out.println("No");
        sc.close();
        out.flush();
    }
}