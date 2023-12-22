import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int X = 0;
        X = (int) Math.round(N / 1.08);
        int trueN = 0;
        trueN = (int) (X * 1.08);
        PrintWriter out = new PrintWriter(System.out);

        if (trueN != N) {
            out.println(":(");
            out.flush();
            sc.close();
            return;
        }

        out.println(X);
        sc.close();
        out.flush();
    }
}