import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.solve();
    }
    public void solve() {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int N = scan.nextInt();
        Train[] trains = new Train[N-1];
        for (int i = 0; i < N - 1; i++) {
            int C = scan.nextInt();
            int S = scan.nextInt();
            int F = scan.nextInt();
            Train t = new Train();
            t.C = C;
            t.S = S;
            t.F = F;
            trains[i] = t;
        }
        for (int i = 0; i < N-1; i++) {
            Train t = trains[i];
            long elapsed_time = t.S + t.C;
            for (int j = i + 1; j < N-1; j++) {
                Train n = trains[j];
                if (elapsed_time < n.S) {
                    elapsed_time = n.S;
                }
                if (elapsed_time % n.F == 0) {
                    elapsed_time += n.C;
                } else {
                    elapsed_time = (n.F - (elapsed_time % n.F)) + n.C;
                }
            }
            System.out.println(elapsed_time);
        }
        System.out.println(0);
    }
    class Train {
        int C;
        int S;
        int F;
    }
}
