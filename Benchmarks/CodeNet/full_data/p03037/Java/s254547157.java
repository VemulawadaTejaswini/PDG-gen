import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int M = Integer.parseInt(sc.next());
        int L = 0;
        int R = 0;
        int Lmax = 0;
        int Rmin = 100000;

        for (int i = 0; i < M; i++) {
            L = Integer.parseInt(sc.next());
            if (L > Lmax) {
                Lmax = L;
            }
            R = Integer.parseInt(sc.next());
            if (R < Rmin) {
                Rmin = R;
            }
        }
        int judge = Rmin - Lmax + 1;

        System.out.println(judge);

        sc.close();
    }
}