import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        EDP_C solver = new EDP_C();
        solver.solve(1, in, out);
        out.close();
    }

    static class EDP_C {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            long happiness[] = new long[100010];
            int a[] = new int[n + 10];
            int b[] = new int[n + 10];
            int c[] = new int[n + 10];
            char done[] = new char[n + 10];
            Arrays.fill(happiness, 0);

            for (int i = 1; i <= n; i++) {
                a[i] = in.nextInt();
                b[i] = in.nextInt();
                c[i] = in.nextInt();
            }

            for (int i = 1; i <= n; i++) {
                long pointA, pointB, pointC;
                pointA = happiness[i - 1] + a[i];
                pointB = happiness[i - 1] + b[i];
                pointC = happiness[i - 1] + c[i];
                if (done[i - 1] == 'a') {
                    if (pointB < pointC) {
                        happiness[i] = pointC;
                        done[i] = 'c';
                    } else {
                        happiness[i] = pointB;
                        done[i] = 'b';
                    }
                } else if (done[i - 1] == 'b') {
                    if (pointA < pointC) {
                        happiness[i] = pointC;
                        done[i] = 'c';
                    } else {
                        happiness[i] = pointA;
                        done[i] = 'a';
                    }

                } else if (done[i - 1] == 'c') {
                    if (pointA < pointB) {
                        happiness[i] = pointB;
                        done[i] = 'b';
                    } else {
                        happiness[i] = pointA;
                        done[i] = 'a';
                    }
                } else {
                    if (pointA < pointB) {
                        if (pointB < pointC) {
                            happiness[i] = pointC;
                            done[i] = 'c';
                        } else {
                            happiness[i] = pointB;
                            done[i] = 'b';
                        }
                    } else {
                        if (pointA < pointC) {
                            happiness[i] = pointC;
                            done[i] = 'c';
                        } else {
                            happiness[i] = pointA;
                            done[i] = 'a';
                        }
                    }
                }
            }

            out.print(happiness[n]);

        }

    }
}

