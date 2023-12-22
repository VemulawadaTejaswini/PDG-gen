import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;
import java.util.HashMap;
import java.util.NavigableSet;
import java.util.TreeSet;

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
        ERoadwork solver = new ERoadwork();
        solver.solve(1, in, out);
        out.close();
    }

    static class ERoadwork {
        TreeSet<Integer> segmentSign;
        TreeSet<Integer> segmentVal;
        HashMap<Integer, Integer> values = new HashMap<>();
        boolean isAdding = false;
        public static int none = -1;

        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int q = in.nextInt();
            int max = 2 * 1000_000_000 + 1;
            segmentSign = new TreeSet<>();
            segmentVal = new TreeSet<>();
            ERoadwork.Input[] inputs = new ERoadwork.Input[n];
            for (int i = 0; i < n; i++) {
                int s = in.nextInt();
                int t = in.nextInt();
                int x = in.nextInt();

                inputs[i] = new ERoadwork.Input(s, t, x);
            }
            Arrays.sort(inputs);
            //Check beginning and end
            add(-1, none, true);
            add(max, none, true);
            for (ERoadwork.Input input : inputs) {
                isAdding = false;
                int s = input.s;
                int t = input.t;
                int x = input.x;
                if (s == t)
                    continue;
                int val1 = Math.max(0, s - x);
                int val2 = Math.max(0, t - x - 1);
                int val3 = Math.max(0, t - x);
                int first = segmentSign.floor(val1);
                if (values.get(first) == none) {
                    if (first == val1) {
                        remove(val1);
                    }
                    add(val1, x, true);
                    isAdding = true;
                }
                NavigableSet<Integer> tail = segmentSign.tailSet(val1, false);
                Integer[] myTail = tail.toArray(new Integer[0]);
                for (Integer pos : myTail) {
                    if (pos > val2) {
                        if (isAdding && pos != val3)
                            add(val3, none, true);
                        break;
                    }
                    if (values.get(pos) == none) {
                        remove(pos);
                        add(pos, x, pos - first > 1);
                        isAdding = true;
                    } else {
                        isAdding = false;
                    }
                    first = pos;
                }
            }

            for (int i = 0; i < q; i++) {
                int ques = in.nextInt();
                Integer posI = segmentVal.floor(ques);
                if (posI == null)
                    throw new RuntimeException("" + ques);
                int pos = posI;
                out.println(values.get(pos));
            }
        }

        private void add(int idx, int value, boolean addSign) {
            if (values.get(idx) != null && values.get(idx) == none && value == none)
                return;
            values.put(idx, value);
            if (addSign)
                segmentSign.add(idx);
            segmentVal.add(idx);
        }

        private void remove(int idx) {
            assertTrue(values.get(idx) == none);
            values.remove(idx);
            segmentSign.remove(idx);
            segmentVal.remove(idx);
        }

        public void assertTrue(boolean shouldBeTrue) {
            assertTrue(shouldBeTrue, "");
        }

        public void assertTrue(boolean shouldBeTrue, String message) {
            if (!shouldBeTrue)
                throw new RuntimeException(message);
        }

        public static class Input implements Comparable<ERoadwork.Input> {
            int s;
            int t;
            int x;

            public Input(int s, int t, int x) {
                this.s = s;
                this.t = t;
                this.x = x;
            }

            public int compareTo(ERoadwork.Input o) {
                return x - o.x;
            }

        }

    }
}

