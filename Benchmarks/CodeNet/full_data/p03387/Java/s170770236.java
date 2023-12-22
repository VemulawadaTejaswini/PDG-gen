import java.util.Scanner;

class Contest93C {

    static void Compare3Figures(int a, int b, int c) {
        if (b < a && a < c) {
            int tmp = a;
            a = b;
            b = tmp;
        }

        else if (b < a && c < b) {
            int tmptwo = a;
            a = c;
            c = tmptwo;
        }

        else if (a < b && c < b && a < c) {
            int tmpthree = b;
            b = c;
            c = tmpthree;
        }

        else if (a < b && c < a) {
            int tmpfour = a;
            a = c;
            c = b;
            b = tmpfour;
        }

        else if (b < a && b < c && c < a) {
            int tmpfive = a;
            a = b;
            b = c;
            c = tmpfive;

        }

        OddEvenCheck(a, b, c);

    }

    static void OddEvenCheck(int p, int q, int r) {
        int OddorEvenOne = (q - p) % 2;
        int OddorEvenTwo = (r - q) % 2;

        if (OddorEvenOne == 0 && OddorEvenTwo == 0) {
            System.out.println(MakeEqual3Figures(p, q, r));
        }

        else if (OddorEvenOne != 0 && OddorEvenTwo != 0) {
            p = p + 1;
            r = r + 1;
            System.out.println(MakeEqual3Figures(p, q, r) + 1);
        }

        else if (OddorEvenOne == 0 && OddorEvenTwo != 0) {
            p = p + 1;
            q = q + 1;
            System.out.println(MakeEqual3Figures(p, q, r) + 1);
        }

        else if (OddorEvenOne != 0 && OddorEvenTwo == 0) {
            q = q + 1;
            r = r + 1;
            System.out.println(MakeEqual3Figures(p, q, r) + 1);
        }

    }

    static int MakeEqual3Figures(int x, int y, int z) {
        int countone = 0;
        int counttwo = 0;
        int resultone = 0;

        while (x != z) {
            x += 2;
            countone++;
        }

        while (y != z) {
            y += 2;
            counttwo++;
        }

        resultone = countone + counttwo;
        return resultone;
    }

    public static void main(String args[]) {
        Scanner stdIn = new Scanner(System.in);

        int A = 0;
        int B = 0;
        int C = 0;

        do {
            A = stdIn.nextInt();
        } while (A < 0 || 50 < A);

        do {
            B = stdIn.nextInt();
        } while (B < 0 || 50 < B);

        do {
            C = stdIn.nextInt();
        } while (C < 0 || 50 < C);

        Compare3Figures(A, B, C);

    }
}