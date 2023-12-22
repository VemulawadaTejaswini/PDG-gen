import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int A = Integer.parseInt(sc.next());
        int B = Integer.parseInt(sc.next());

        int amax = N / 10000;
        int bmax = (N % 10000) / 1000;
        int cmax = (N % 1000) / 100;
        int dmax = (N % 100) / 10;
        int emax = N % 10;

        int sum = 0;

        if (amax == 1 && A == 1) {
            sum += 10000;
        }
        int brange;
        if (amax == 1) {
            brange = Math.min(B, 9);
        } else {
            brange = Math.min(B, bmax);
        }
        for (int b = 0; b < brange + 1; b++) {
            int crange;
            if (b != bmax || amax == 1) {
                crange = Math.min(B, 9);
            } else {
                crange = Math.min(B - b, cmax);
            }
            for (int c = 0; c < crange + 1; c++) {
                int drange;
                if (c != cmax || b != bmax || amax == 1) {
                    drange = Math.min(B - b - c, 9);
                } else {
                    drange = Math.min(B - b - c, dmax);
                }
                for (int d = 0; d < drange + 1; d++) {
                    int erange;
                    if (d != dmax || c != cmax || b != bmax || amax == 1) {
                        erange = Math.min(B - b - c - d, 9);
                    } else {
                        erange = Math.min(B - b - c - d, emax);
                    }
                    for (int e = Math.max(A - b - c - d, 0); e < erange + 1; e++) {
                        //System.out.println("add " + b + " "+ c +" " + d +" "+ e);
                        sum += (1000 * b) + (100 * c) + (10 * d) + e;

                    }
                }
            }
        }
        System.out.println(sum);
    }
}