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

    static void OddEvenCheck(int a, int b, int c) {
        int OddorEvenOne = (b - a) % 2;
        int OddorEvenTwo = (c - b) % 2;

        if (OddorEvenOne == 0 && OddorEvenTwo == 0) {
            System.out.print(MakeEqual3Figures(a, b, c));
        }

        else if (OddorEvenOne != 0 && OddorEvenTwo != 0) {
            a = a + 1;
            c = c + 1;
            System.out.print(MakeEqual3Figures(a, b, c) + 1);
        }

        else if (OddorEvenOne == 0 && OddorEvenTwo != 0) {
            a = a + 1;
            b = b + 1;
            System.out.print(MakeEqual3Figures(a, b, c) + 1);
        }

        else if (OddorEvenOne != 0 && OddorEvenTwo == 0) {
            b = b + 1;
            c = c + 1;
            System.out.print(MakeEqual3Figures(a, b, c) + 1);
        }

    }

    static int MakeEqual3Figures(int a, int b, int c) {
        int countone = 0;
        int counttwo = 0;
        int resultone = 0;

        while (a != c) {
            a += 2;
            countone++;
        }

        while (b != c) {
            b += 2;
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

        System.out.println(" ");
    }
}