import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Iterator;
import java.io.BufferedWriter;
import java.util.Set;
import java.util.InputMismatchException;
import java.io.IOException;
import java.util.HashSet;
import java.util.Objects;
import java.io.Writer;
import java.io.OutputStreamWriter;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Egor Kulikov (egor@egork.net)
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        OutputWriter out = new OutputWriter(outputStream);
        TaskE solver = new TaskE();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskE {
        public void solve(int testNumber, InputReader in, OutputWriter out) {
            String s = in.readString();
            TaskE.Node start = new TaskE.Node(3, -1);
            TaskE.Node last = start;
            for (int i = 0; i < s.length(); i++) {
                TaskE.Node current = new TaskE.Node(s.charAt(i) - 'A', i);
                current.left = last;
                last.right = current;
                last = current;
            }
            TaskE.Node end = new TaskE.Node(3, s.length());
            last.right = end;
            end.left = last;
            Set<TaskE.Node>[][][] nodes = new Set[3][4][4];
            int[] qty = new int[3];
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 4; j++) {
                    for (int k = 0; k < 4; k++) {
                        nodes[i][j][k] = new HashSet<>();
                    }
                }
            }
            for (TaskE.Node node = start.right; node != end; node = node.right) {
                nodes[node.letter][node.left.letter][node.right.letter].add(node);
                qty[node.letter]++;
            }
            while (true) {
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 4; j++) {
                        while (!nodes[i][i][j].isEmpty()) {
                            TaskE.Node current = nodes[i][i][j].iterator().next();
                            removeNode(start, end, nodes, qty, current);
                        }
                        while (!nodes[i][j][i].isEmpty()) {
                            TaskE.Node current = nodes[i][j][i].iterator().next();
                            removeNode(start, end, nodes, qty, current);
                        }
                    }
                }
                int max = 0;
                int min = 0;
                for (int i = 1; i < 3; i++) {
                    if (qty[i] > qty[max]) {
                        max = i;
                    }
                    if (qty[i] < qty[min]) {
                        min = i;
                    }
                }
                if (max == min) {
                    break;
                }
                if (qty[min] == 0) {
                    out.printLine("");
                    return;
                }
                int mid = 3 - max - min;
                if (!nodes[max][mid][3].isEmpty()) {
                    TaskE.Node current = nodes[max][mid][3].iterator().next();
                    removeNode(start, end, nodes, qty, current);
                    continue;
                }
                if (!nodes[max][3][mid].isEmpty()) {
                    TaskE.Node current = nodes[max][3][mid].iterator().next();
                    removeNode(start, end, nodes, qty, current);
                    continue;
                }
                if (!nodes[max][min][3].isEmpty()) {
                    TaskE.Node current = nodes[max][min][3].iterator().next();
                    removeNode(start, end, nodes, qty, current);
                    continue;
                }
                if (!nodes[max][3][min].isEmpty()) {
                    TaskE.Node current = nodes[max][3][min].iterator().next();
                    removeNode(start, end, nodes, qty, current);
                    continue;
                }
                if (!nodes[max][mid][min].isEmpty()) {
                    TaskE.Node current = nodes[max][mid][min].iterator().next();
                    removeNode(start, end, nodes, qty, current);
                    continue;
                }
                if (!nodes[max][min][mid].isEmpty()) {
                    TaskE.Node current = nodes[max][min][mid].iterator().next();
                    removeNode(start, end, nodes, qty, current);
                    continue;
                }
                if (!nodes[max][mid][mid].isEmpty()) {
                    TaskE.Node current = nodes[max][mid][mid].iterator().next();
                    removeNode(start, end, nodes, qty, current);
                    continue;
                }
                if (!nodes[max][min][min].isEmpty()) {
                    TaskE.Node current = nodes[max][min][min].iterator().next();
                    removeNode(start, end, nodes, qty, current);
                    continue;
                }
            }
            StringBuilder answer = new StringBuilder();
            for (TaskE.Node node = start.right; node != end; node = node.right) {
                answer.append((char) ('A' + node.letter));
            }
            out.printLine(answer);
        }

        protected void removeNode(TaskE.Node start, TaskE.Node end, Set<TaskE.Node>[][][] nodes, int[] qty,
                                  TaskE.Node current) {
            nodes[current.letter][current.left.letter][current.right.letter].remove(current);
            qty[current.letter]--;
            TaskE.Node left = current.left;
            TaskE.Node right = current.right;
            if (left != start) {
                nodes[left.letter][left.left.letter][left.right.letter].remove(left);
            }
            if (right != end) {
                nodes[right.letter][right.left.letter][right.right.letter].remove(right);
            }
            left.right = right;
            right.left = left;
            if (left != start) {
                nodes[left.letter][left.left.letter][left.right.letter].add(left);
            }
            if (right != end) {
                nodes[right.letter][right.left.letter][right.right.letter].add(right);
            }
        }

        static class Node {
            TaskE.Node left;
            TaskE.Node right;
            int letter;
            int id;

            public Node(int letter, int id) {
                this.letter = letter;
                this.id = id;
            }

            public boolean equals(Object o) {
                if (this == o) {
                    return true;
                }
                if (o == null || getClass() != o.getClass()) {
                    return false;
                }
                TaskE.Node node = (TaskE.Node) o;
                return id == node.id;
            }

            public int hashCode() {
                return Objects.hash(id);
            }

        }

    }

    static class OutputWriter {
        private final PrintWriter writer;

        public OutputWriter(OutputStream outputStream) {
            writer = new PrintWriter(new BufferedWriter(new OutputStreamWriter(outputStream)));
        }

        public OutputWriter(Writer writer) {
            this.writer = new PrintWriter(writer);
        }

        public void print(Object... objects) {
            for (int i = 0; i < objects.length; i++) {
                if (i != 0) {
                    writer.print(' ');
                }
                writer.print(objects[i]);
            }
        }

        public void printLine(Object... objects) {
            print(objects);
            writer.println();
        }

        public void close() {
            writer.close();
        }

    }

    static class InputReader {
        private InputStream stream;
        private byte[] buf = new byte[1024];
        private int curChar;
        private int numChars;
        private InputReader.SpaceCharFilter filter;

        public InputReader(InputStream stream) {
            this.stream = stream;
        }

        public int read() {
            if (numChars == -1) {
                throw new InputMismatchException();
            }
            if (curChar >= numChars) {
                curChar = 0;
                try {
                    numChars = stream.read(buf);
                } catch (IOException e) {
                    throw new InputMismatchException();
                }
                if (numChars <= 0) {
                    return -1;
                }
            }
            return buf[curChar++];
        }

        public String readString() {
            int c = read();
            while (isSpaceChar(c)) {
                c = read();
            }
            StringBuilder res = new StringBuilder();
            do {
                if (Character.isValidCodePoint(c)) {
                    res.appendCodePoint(c);
                }
                c = read();
            } while (!isSpaceChar(c));
            return res.toString();
        }

        public boolean isSpaceChar(int c) {
            if (filter != null) {
                return filter.isSpaceChar(c);
            }
            return isWhitespace(c);
        }

        public static boolean isWhitespace(int c) {
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }

        public interface SpaceCharFilter {
            public boolean isSpaceChar(int ch);

        }

    }
}

