import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int T = Integer.parseInt(sc.next());
        int[] t = new int[N];
        int pret = 0;
        int time = T;
        for (int i = 0; i < N; i++) {
            t[i] = Integer.parseInt(sc.next());
        }

        for (int i = 0; i < N; i++) {

            if ((t[i] - pret) < T) {
                time += t[i] - pret;
            } else {
                time += T;
            }
            pret = t[i];
        }

        PrintWriter out = new PrintWriter(System.out);
        out.println(time);

        sc.close();
        out.flush();
    }
}