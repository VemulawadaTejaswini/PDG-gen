import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class Main {

    private final static InputReader inputReader = new InputReader(System.in);
    private final static OutputWriter outputWriter = new OutputWriter(System.out);

    public static void main(String[] args) throws IOException {
        int numberOfTestCases = 1;//inputReader.scanInt();
        for (int testCase = 1; testCase <= numberOfTestCases; ++testCase) {
            final ProblemParameters parameters = new ProblemParameters();
            parameters.numberOfNodes = inputReader.scanInt();
            parameters.numberOfEdges = inputReader.scanInt();
            parameters.adjList = new List[parameters.numberOfNodes + 2];

            for (int currentNode = 1; currentNode <= parameters.numberOfNodes; ++currentNode) {
                parameters.adjList[currentNode] = new ArrayList<>();
            }

            for (int i = 0; i < parameters.numberOfEdges; ++i) {
                final int from = inputReader.scanInt();
                final int to = inputReader.scanInt();

                parameters.adjList[from].add(to);
            }

            final Solver solver = new Solver(parameters);
            solver.solve();
        }

        outputWriter.close();
    }

    static class Solver {

        private final ProblemParameters parameters;
        private final int[] incomingEdgeCount;
        private final int[] memo;

        public Solver(final ProblemParameters parameters) {
            this.parameters = parameters;
            this.incomingEdgeCount = new int[parameters.numberOfNodes + 2];
            this.memo = new int[parameters.numberOfNodes + 2];
        }

        public void solve() {
            resetMemo();
            prepareInComingEdgeCount();
            int maxDist = 0;
            for (int currentNode = 1; currentNode <= parameters.numberOfNodes; ++currentNode) {
                if (incomingEdgeCount[currentNode] == 0) {
                    maxDist = Math.max(maxDist, dfs(currentNode));
                }
            }

            outputWriter.println(maxDist);
        }

        private void resetMemo() {
            for (int i = 1; i <= parameters.numberOfNodes; ++i) {
                memo[i] = -1;
            }
        }

        private void prepareInComingEdgeCount() {
            for (int currentNode = 1; currentNode <= parameters.numberOfNodes; ++currentNode) {
                for (int nextNode : parameters.adjList[currentNode]) {
                    incomingEdgeCount[nextNode]++;
                }
            }
        }

        private int dfs(int currentNode) {
            if (memo[currentNode] != -1) {
                return memo[currentNode];
            }

            int maxDist = 0;
            for (int nextNode : parameters.adjList[currentNode]) {
                maxDist = Math.max(maxDist, dfs(nextNode) + 1);
            }

            memo[currentNode] = maxDist;
            
            return maxDist;
        }
    }

    static class ProblemParameters {

        int numberOfNodes;
        int numberOfEdges;
        List<Integer>[] adjList;
    }

    // We can use abstract method or loaner pattern to create different classes for different dataTypes and
    // keep repeated code in with generic class. But can't follow OOPS in CP :( because of TLE or MLE.
    // So try to use less object creation in CP.
    static class InputReader {

        private final BufferedInputStream bufferedInputStream;

        private final static char NEGATIVE_CHAR = '-';
        private final static char SPACE_CHAR = ' ';
        private final static char TAB_CHAR = '\t';
        private final static char NEW_LINE_WITH_N = '\n';
        private final static char NEW_LINE_WITH_R = '\r';
        private final static int END_OF_INPUT_STREAM = -1;

        public InputReader(final InputStream inputStream) {
            bufferedInputStream = new BufferedInputStream(inputStream);
        }

        public int scanInt() throws IOException {
            int currentByte = findFirstUsefulByte();
            boolean isNegative = false;
            if (currentByte == NEGATIVE_CHAR) {
                isNegative = true;
                currentByte = bufferedInputStream.read();
            }

            int number = 0;
            while (isUsefulByte(currentByte)) {
                number = (number * 10) + (currentByte - '0');
                currentByte = bufferedInputStream.read();
            }

            return isNegative ? -number : number;
        }

        public long scanLong() throws IOException {
            int currentByte = findFirstUsefulByte();
            boolean isNegative = false;
            if (currentByte == NEGATIVE_CHAR) {
                isNegative = true;
                currentByte = bufferedInputStream.read();
            }

            long number = 0;
            while (isUsefulByte(currentByte)) {
                number = (number * 10) + (currentByte - '0');
                currentByte = bufferedInputStream.read();
            }

            return isNegative ? -number : number;
        }

        public String scanString() throws IOException {
            int currentByte = findFirstUsefulByte();
            final StringBuilder stringBuilder = new StringBuilder();
            while (isUsefulByte(currentByte)) {
                stringBuilder.append((char) currentByte);
                currentByte = bufferedInputStream.read();
            }

            return stringBuilder.toString();
        }

        public double scanDouble() throws IOException { //Reason to use java's parser is because we had to write a lot of cases to handle floating point problems.
            return Double.parseDouble(scanString());
        }

        public List<Integer> scanListOfIntegers(int numbersCount) throws IOException {
            final List<Integer> numberList = new ArrayList<>();
            while (numbersCount-- > 0) {
                numberList.add(scanInt());
            }

            return numberList;
        }

        public List<Long> scanListOfLongs(int numbersCount) throws IOException {
            final List<Long> numberList = new ArrayList<>();
            while (numbersCount-- > 0) {
                numberList.add(scanLong());
            }

            return numberList;
        }

        private int findFirstUsefulByte() throws IOException {
            int currentByte = bufferedInputStream.read();
            while (!isUsefulByte(currentByte)) {
                currentByte = bufferedInputStream.read();
            }

            return currentByte;
        }

        private boolean isUsefulByte(final int currentByte) {
            if (currentByte == SPACE_CHAR || NEW_LINE_WITH_N == currentByte || NEW_LINE_WITH_R == currentByte
                    || currentByte == TAB_CHAR || currentByte == END_OF_INPUT_STREAM) {
                return false;
            } else {
                return true;
            }
        }
    }

    // Try to use it in tr-resource block.
    // To avoid close call manually.
    static class OutputWriter implements AutoCloseable {

        private final static boolean IS_AUTO_FLUSH_FOR_NEW_LINE = true;
        private final PrintWriter printWriter;

        public OutputWriter(final OutputStream outputStream) {
            this.printWriter = new PrintWriter(outputStream, IS_AUTO_FLUSH_FOR_NEW_LINE);
        }

        public void print(Object... objects) {
            for (int objectIndex = 0; objectIndex < objects.length; ++objectIndex) {
                if (objectIndex != 0) {
                    printWriter.print(' ');
                }
                printWriter.print(objects[objectIndex]);
            }
        }

        public void println(Object... objects) {
            print(objects);
            printWriter.println();
        }

        public void flush() { //Force flush if require after printing each element on one line
            printWriter.flush();
        }

        public void close() {
            printWriter.close();
        }
    }
}