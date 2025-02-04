import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Objects;
import java.util.List;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.util.Collections;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author dyominov
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        BPath solver = new BPath();
        solver.solve(1, in, out);
        out.close();
    }

    static class BPath {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            List<A> list = new ArrayList<>();
            for (int i = 0; i < 3; i++) {
                int[] arr = new int[2];
                arr[0] = in.nextInt();
                arr[1] = in.nextInt();
                Arrays.sort(arr);
                list.add(new A(arr[0], arr[1]));
            }
            Collections.sort(list);
            int start = list.get(0).x;
            for (int j = 0; j < 1000; j++) {
                for (int i = 0; i < list.size(); i++) {
                    if (list.get(i).x == start || list.get(i).y == start) {
                        if (list.get(i).x == start) {
                            start = list.get(i).y;
                        } else {
                            start = list.get(i).x;
                        }
                        list.remove(i);
                        i--;
                    }
                }
            }
            out.println(list.isEmpty() ? "YES" : "NO");


        }

        class A implements Comparable<A> {
            int x;
            int y;

            A(int x, int y) {
                this.x = x;
                this.y = y;
            }

            public boolean equals(Object o) {
