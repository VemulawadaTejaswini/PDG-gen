import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import java.util.Map;
import java.io.BufferedReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskE solver = new TaskE();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskE {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            TaskE.Number[] numbers = new TaskE.Number[n];
            for (int i = 0; i < n; ++i) {
                numbers[i] = new TaskE.Number(in.nextInt());
            }
            Arrays.sort(numbers);
            for (int i = 0; i < n; ++i) numbers[i].pos = i;
            Map<Integer, List<TaskE.Number>> divisorToNumbers = new HashMap<>();
            for (TaskE.Number num : numbers) {
                int a = num.a;
                for (int i = 2; i * i <= a; ++i)
                    if (a % i == 0) {
                        while (a % i == 0) a /= i;
                        List<TaskE.Number> old = divisorToNumbers.get(i);
                        if (old == null) {
                            old = new ArrayList<>(2);
                            divisorToNumbers.put(i, old);
                        }
                        old.add(num);
                    }
                if (a > 1) {
                    int i = a;
                    while (a % i == 0) a /= i;
                    List<TaskE.Number> old = divisorToNumbers.get(i);
                    if (old == null) {
                        old = new ArrayList<>(2);
                        divisorToNumbers.put(i, old);
                    }
                    old.add(num);
                }
            }
            for (List<TaskE.Number> l : divisorToNumbers.values()) {
                if (l.size() < 2) continue;
                TaskE.Divisor d = new TaskE.Divisor();
                List<TaskE.NumberAndDivisor> seq = new ArrayList<>();
                seq.add(new TaskE.NumberAndDivisor(null, null));
                for (TaskE.Number num : l) {
                    seq.add(new TaskE.NumberAndDivisor(num, d));
                }
                for (int i = 0; i < seq.size(); ++i) {
                    int j = (i + 1) % seq.size();
                    seq.get(i).next = seq.get(j);
                    seq.get(j).prev = seq.get(i);
                }
            }
            int curGeneration = 0;
            List<TaskE.Number> stack = new ArrayList<>();
            for (int i = 0; i < n; ++i) {
                ++curGeneration;
                int minAllowed = 0;
                for (TaskE.Number number : numbers) {
                    if (number.divs == null) continue;
                    if (number.generation == curGeneration) continue;
                    int minPos = number.findMinPos(curGeneration);
                    minAllowed = Math.max(minAllowed, minPos);
                }
                TaskE.Number nxt = null;
                outer:
                for (int j = minAllowed; j < numbers.length; ++j) {
                    TaskE.Number num = numbers[j];
                    if (num.divs == null) continue;
                    int left = -1;
                    int right = stack.size();
                    while (right - left > 1) {
                        int middle = (left + right) >> 1;
                        if (stack.get(middle).a < num.a) {
                            left = middle;
                        } else {
                            right = middle;
                        }
                    }
                    if (left < 0) {
                        nxt = num;
                        break outer;
                    }
                    for (TaskE.NumberAndDivisor div : num.divs) {
                        TaskE.Divisor d = div.d;
                        if (d.lastOccurrence >= stack.get(left).resPos) {
                            nxt = num;
                            break outer;
                        }
                    }
                }
                if (nxt == null) throw new RuntimeException();
                if (i > 0) out.print(" ");
                out.print(nxt.a);
                for (TaskE.NumberAndDivisor div : nxt.divs) {
                    div.next.prev = div.prev;
                    div.prev.next = div.next;
                    div.d.lastOccurrence = i;
                }
                nxt.divs = null;
                nxt.resPos = i;
                while (!stack.isEmpty() && stack.get(stack.size() - 1).a >= nxt.a) {
                    stack.remove(stack.size() - 1);
                }
                stack.add(nxt);
            }
            out.println();
        }

        static class Divisor {
            int lastOccurrence = -1;

        }

        static class NumberAndDivisor {
            TaskE.NumberAndDivisor next;
            TaskE.NumberAndDivisor prev;
            TaskE.Number n;
            TaskE.Divisor d;

            public NumberAndDivisor(TaskE.Number n, TaskE.Divisor d) {
                this.n = n;
                this.d = d;
                if (n != null) n.divs.add(this);
            }

        }

        static class Number implements Comparable<TaskE.Number> {
            int a;
            int pos;
            int generation;
            int resPos = -1;
            List<TaskE.NumberAndDivisor> divs = new ArrayList<>();

            public Number(int a) {
                this.a = a;
            }


            public int compareTo(TaskE.Number o) {
                return Integer.compare(a, o.a);
            }

            public int findMinPos(int curGeneration) {
                if (generation == curGeneration) return pos;
                generation = curGeneration;
                int res = pos;
                for (TaskE.NumberAndDivisor div : divs) {
                    if (div.next.n != null) {
                        res = Math.min(res, div.next.n.findMinPos(curGeneration));
                    }
                    if (div.prev.n != null) {
                        res = Math.min(res, div.prev.n.findMinPos(curGeneration));
                    }
                }
                return res;
            }

        }

    }

    static class InputReader {
        public BufferedReader reader;
        public StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }

        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

    }
}

