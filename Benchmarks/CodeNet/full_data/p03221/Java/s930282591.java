import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;
import java.util.ArrayList;

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
        ABC_113_C solver = new ABC_113_C();
        solver.solve(1, in, out);
        out.close();
    }

    static class ABC_113_C {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int m = in.nextInt();

            List<Long> years = new ArrayList<Long>();


            String[] answerList = new String[m];
            TreeSet<Long> sortedYears = new TreeSet<Long>();
            int[] townCity = new int[m];
            int[] city = new int[n];


            for (int i = 0; i < m; i++) {
                int p = in.nextInt();
                long year = in.nextLong();
                answerList[i] = String.format("%06d", p);
                townCity[i] = p;
                years.add(year);
                sortedYears.add(year);
            }


            for (Long year : sortedYears) {
                int pNumber = years.indexOf(year);

                answerList[pNumber] += String.format("%06d", city[townCity[pNumber] - 1] + 1);
                city[townCity[pNumber] - 1]++;
            }

            for (String answer : answerList) {
                out.println(answer);
            }

//        for (int i = 0; i < n; i++) {
//            Collections.sort(histories[i]);
//        }
//
//        for (long year : years) {
//            for (int i = 0; i < histories.length; i++) {
//                if (histories[i].contains(year)) {
//                    int p = i + 1;
//                    int birth = histories[i].indexOf(year) + 1;
//                    out.println(String.format("%06d", p) + String.format("%06d", birth));
//                    break;
//                }
//            }
//        }

        }

    }
}

