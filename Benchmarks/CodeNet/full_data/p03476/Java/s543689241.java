import java.util.Scanner;

class Solver {
    public void Solve() {
        int q = sc.nextInt();
        int ruiseki[] = new int[200_000];
        ruiseki[0] = 0;

        // エストラテネスの揮
        int minFact[] = new int[200_000];
        for (int i = 2; i < minFact.length; i++) {
            if (minFact[i] == 0) {
                for (int j = i; j < minFact.length; j += i) {
                    minFact[j] = i;
                }
            }
        }

        for (int i = 1; i < ruiseki.length; i++) {
            if ((minFact[i] == i) && minFact[(i + 1) / 2] == (i + 1) / 2) {
                ruiseki[i] = ruiseki[i - 1] + 1;
            } else {
                ruiseki[i] = ruiseki[i - 1];
            }
        }
        for (int i = 0; i < q; i++) {
            int l = sc.nextInt();
            int r = sc.nextInt();
            int ans = ruiseki[r] - ruiseki[l - 1];
            System.out.println(ans);
        }

    }

    Scanner sc;

    Solver(Scanner in) {
        this.sc = in;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Solver s = new Solver(sc);
        s.Solve();
        sc.close();
    }
}
