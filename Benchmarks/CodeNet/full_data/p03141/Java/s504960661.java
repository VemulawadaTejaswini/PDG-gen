import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Comparator;

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
        Nikkei_C solver = new Nikkei_C();
        solver.solve(1, in, out);
        out.close();
    }

    static class Nikkei_C {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();

            long[] a = new long[n];
            long[] b = new long[n];
            long[] sub = new long[n];

            long scoreA = 0;
            long scoreB = 0;

            boolean equalA = true;
            boolean equalB = true;
            boolean equalAB = true;

            dish[] dishes = new dish[n];

            for (int i = 0; i < n; i++) {
                a[i] = in.nextLong();
                if (i > 0 && a[i] != a[i - 1]) {
                    equalA = false;
                }

                b[i] = in.nextLong();
                if (i > 0 && b[i] != b[i - 1]) {
                    equalB = false;
                }

                if (a[i] != b[i]) {
                    equalAB = false;
                }
                sub[i] = a[i] - b[i];

                dish dish = new dish(a[i], b[i]);
                dishes[i] = dish;
            }


            if (equalAB) {
                //幸福度の高い順に食べていく
                Arrays.sort(a);
                int cnt = 1;
                for (int i = n - 1; 0 <= i; i--) {
                    if (cnt % 2 == 1) {
                        scoreA += a[i];
                    } else {
                        scoreB += a[i];
                    }
                    cnt++;
                }
                out.print(scoreA - scoreB);
                return;
            }


            if (equalA && equalB) {
                // 幸福度の高い順に食べていく
                Arrays.sort(a);
                int cnt = 1;
                for (int i = n - 1; 0 <= i; i--) {
                    if (cnt % 2 == 1) {
                        scoreA += a[i];
                    } else {
                        scoreB += b[i];
                    }
                    cnt++;
                }
                out.print(scoreA - scoreB);
            } else if (equalA && !equalB) {
                // Bの高い順に食べていく

                Arrays.sort(dishes, new Comparator<dish>() {

                    public int compare(dish o1, dish o2) {
                        return (int) (o2.b - o1.b);
                    }
                });
                int cnt = 1;
                for (int i = n - 1; 0 <= i; i--) {
                    if (cnt % 2 == 1) {
                        scoreA += dishes[i].a;
                    } else {
                        scoreB += dishes[i].b;
                    }
                    cnt++;
                }
                out.print(scoreA - scoreB);

            } else if (!equalA && equalB) {
                // Aの高い順に食べていく
                Arrays.sort(dishes, new Comparator<dish>() {

                    public int compare(dish o1, dish o2) {
                        return (int) (o2.a - o1.a);
                    }
                });
                int cnt = 1;
                for (int i = n - 1; 0 <= i; i--) {
                    if (cnt % 2 == 1) {
                        scoreA += dishes[i].a;
                    } else {
                        scoreB += dishes[i].b;
                    }
                    cnt++;
                }
                out.print(scoreA - scoreB);
            } else {
                Arrays.sort(dishes, new Comparator<dish>() {

                    public int compare(dish o1, dish o2) {
                        if ((o2.a - o2.b) - (o1.a - o1.b) == 0) {
                            return (int) (o1.a - o2.a);
                        }
                        return (int) ((o2.a - o2.b) - (o1.a - o1.b));
                    }
                });

                int cnt = 1;
                for (int i = n - 1; 0 <= i; i--) {
                    if (cnt % 2 == 1) {
                        scoreA += dishes[i].a;
                    } else {
                        scoreB += dishes[i].b;
                    }
                    cnt++;
                }
                out.print(scoreA - scoreB);

            }


        }

    }

    static class dish {
        long a;
        long b;

        dish(long a, long b) {
            this.a = a;
            this.b = b;
        }

    }
}

