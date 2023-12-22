import java.util.*;

class Main {
    public static void main(String[] args) {
        new Solver().run();
    }
}

class Solver {

    private void mark(int[][] card, int v) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (card[i][j] == v) {
                    card[i][j] = 0;
                }
            }
        }
    }

    private void check(boolean bingo) {
        if (bingo) {
            System.out.println("Yes");
            System.exit(0);
        }
    }

    public void run() {
        Scanner sc = new Scanner(System.in);
        int[][] card = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                card[i][j] = sc.nextInt();
            }
        }

        int N = sc.nextInt();
        int[] b = new int[N];
        for (int i = 0; i < N; i++) {
            b[i] = sc.nextInt();
            mark(card, b[i]);
        }

        //for (int i = 0; i < 3; i++) {
        //    for (int j = 0; j < 3; j++) {
        //        System.out.print(card[i][j] + " ");
        //    }
        //    System.out.println();
        //}

        // horizontal check
        boolean bingo = true;
        for (int i = 0; i < 3; i++) {
            bingo = true;
            for (int j = 0; j < 3; j++) {
                if (card[i][j] != 0) {
                    bingo = false;
                }
            }
            check(bingo);
        }

        // vertical check
        for (int j = 0; j < 3; j++) {
            bingo = true;
            for (int i = 0; i < 3; i++) {
                if (card[i][j] != 0) {
                    bingo = false;
                }
            }
            check(bingo);
            //System.out.println(String.format("checking: false col[%d]", j));
        }

        bingo = true;
        for (int i = 0; i < 3; i++) {
            if (card[i][i] != 0) {
                bingo = false;
            }
        }
        check(bingo);

        bingo = true;
        for (int i = 0; i < 3; i++) {
            if (card[i][2 - i] != 0) {
                bingo = false;
            }
        }
        check(bingo);

        System.out.println("No");

        return;
    }

}
