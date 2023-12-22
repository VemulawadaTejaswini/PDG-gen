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
            parameters.numberOfDays = inputReader.scanInt();
            parameters.dayActivities = new ArrayList<>();
            for (int i = 0; i < parameters.numberOfDays; ++i) {
                final DayActivity dayActivity = new DayActivity();
                dayActivity.activityPoints = new int [3];
                dayActivity.activityPoints[0] = inputReader.scanInt();
                dayActivity.activityPoints[1] = inputReader.scanInt();
                dayActivity.activityPoints[2] = inputReader.scanInt();

                parameters.dayActivities.add(dayActivity);
            }

            final Solver solver = new Solver(parameters);
            solver.solve();
        }

        outputWriter.close();
    }

    static class Solver {

        private final ProblemParameters parameters;
        private final int[][] dp;

        public Solver(final ProblemParameters parameters) {
            this.parameters = parameters;
            this.dp = new int[parameters.numberOfDays + 2][4];
        }

        public void solve() {
            for (int currentDay = 1; currentDay <= parameters.numberOfDays; ++currentDay) {
                for (int activity = 0; activity <= 2; ++activity) { // 0 mean swim, 1 mean catch bug, 2 mean do homework
                    int currentActivityPoint = parameters.dayActivities.get(currentDay - 1).activityPoints[activity];
                    int maxPossiblePoints = Integer.MIN_VALUE;
                    for (int previousActivity = 0; previousActivity <= 2; ++previousActivity) {
                        if (previousActivity != activity) {
                            maxPossiblePoints = Math.max(maxPossiblePoints, dp[currentDay - 1][previousActivity] + currentActivityPoint);
                        }
                    }

                    dp[currentDay][activity] = maxPossiblePoints;
                }
            }

            outputWriter.println(Math.max(dp[parameters.numberOfDays][0],
                    Math.max(dp[parameters.numberOfDays][1], dp[parameters.numberOfDays][2])));
        }
    }

    static class ProblemParameters {

        int numberOfDays;
        List<DayActivity> dayActivities;
    }

    static class DayActivity {

        int[] activityPoints;
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

        public String scanLine() throws IOException {
            int currentByte = findFirstUsefulByte();
            final StringBuilder stringBuilder = new StringBuilder();
            while (isUsefulByte(currentByte)) {
                stringBuilder.append((char) currentByte);
                currentByte = bufferedInputStream.read();
            }

            return stringBuilder.toString();
        }

        public double scanDouble() throws IOException { //Reason to use java's parser is because we had to write a lot of cases to handle floating point problems.
            return Double.parseDouble(scanLine());
        }

        public List<Integer> scanListOfIntegers(int numbersCount) throws IOException {
            final List<Integer> numberList = new ArrayList<>();
            while (numbersCount-- > 0) {
                numberList.add(scanInt());
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