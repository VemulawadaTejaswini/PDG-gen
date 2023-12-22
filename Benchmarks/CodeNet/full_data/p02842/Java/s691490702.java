import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int X1 = 0;
        int X2 = 0;
        X1 = (int) Math.floor(N / 1.08);
        X2 = (int) Math.ceil(N / 1.08);
        int trueN1 = 0;
        int trueN2 = 0;
        trueN1 = (int) Math.floor(X1 * 1.08);
        trueN2 = (int) Math.floor(X2 * 1.08);
        PrintWriter out = new PrintWriter(System.out);

        if (trueN1 != N && trueN2 != N) {
            out.println(":(");
            out.flush();
            sc.close();
            return;
        }

        if (trueN1 == N) {
            out.println(X1);
            out.flush();
        } else {
            out.println(X2);
            out.flush();
        }

        sc.close();
    }
}