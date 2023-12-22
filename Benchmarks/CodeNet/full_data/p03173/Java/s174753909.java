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
            parameters.numberOfSlimes = inputReader.scanInt();
            parameters.heightOfSlime = inputReader.scanListOfLongs(parameters.numberOfSlimes);

            final Solver solver = new Solver(parameters);
            solver.solve();
        }

        outputWriter.close();
    }

    static class Solver {

        private final ProblemParameters parameters;
        private final long[] prefixSum;
        private final long[][] dp;

        public Solver(final ProblemParameters parameters) {
            this.parameters = parameters;
            this.prefixSum = new long[parameters.numberOfSlimes];
            this.dp = new long[parameters.numberOfSlimes][parameters.numberOfSlimes];
            resetDpStates();
            preCompute();
        }

        private void resetDpStates() {
            for (int i = 0; i < parameters.numberOfSlimes; ++i) {
                for (int j = 0; j < parameters.numberOfSlimes; ++j) {
                    dp[i][j] = -1;
                }
            }
        }

        private void preCompute() {
            prefixSum[0] = parameters.heightOfSlime.get(0);
            for (int slimeNumber = 1; slimeNumber < parameters.numberOfSlimes; ++slimeNumber) {
                prefixSum[slimeNumber] = prefixSum[slimeNumber - 1] + parameters.heightOfSlime.get(slimeNumber);
            }
        }

        public void solve() {
            outputWriter.println(rec(0, parameters.numberOfSlimes - 1));
        }

        private long rec(final int startOfSegment, final int endOfSegment) {
            if (startOfSegment + 1 == endOfSegment) {
                return parameters.heightOfSlime.get(startOfSegment) + parameters.heightOfSlime.get(endOfSegment);
            }

            if (startOfSegment == endOfSegment) {
                return 0;
            }

            if (dp[startOfSegment][endOfSegment] != -1) {
                return dp[startOfSegment][endOfSegment];
            }

            long answer = Long.MAX_VALUE;
            for (int pivotSlime = startOfSegment + 1; pivotSlime < endOfSegment; ++pivotSlime) {
                final long firstSubSegment = rec(startOfSegment, pivotSlime - 1);
                final long secondSubSegment = rec(pivotSlime + 1, endOfSegment);
                final long sumOfFirstSubSegment = getSumFromTo(startOfSegment, pivotSlime - 1);
                final long sumOfSecondSubSegment = getSumFromTo(pivotSlime + 1, endOfSegment);
                final long totalCostOfSegment = firstSubSegment + secondSubSegment;
                answer = Math.min(answer, solveBaseCase(sumOfFirstSubSegment,
                        parameters.heightOfSlime.get(pivotSlime), sumOfSecondSubSegment) + totalCostOfSegment);
            }
            dp[startOfSegment][endOfSegment] = answer;

            return answer;
        }

        // (a, b, c) -> 2 * b + Math.min(2 * a + 2 * c) + Math.max(a, c)
        private long solveBaseCase(final long firstElement, final long secondElement, final long thirdElement) {
            return Math.min ((2 * (firstElement * secondElement)) + thirdElement,
                    (2 * (secondElement + thirdElement)) + firstElement);
        }

        private long getSumFromTo(final int start, final int end) {
            final long sumTillStart_1 = start > 0 ? prefixSum[start - 1] : 0;
            final long sumTillEnd = prefixSum[end];

            return sumTillEnd - sumTillStart_1;
        }
    }

    static class ProblemParameters {

        int numberOfSlimes;
        List<Long> heightOfSlime;
    }

    static class Pair<F, S> {

        F first;
        S second;

        public Pair(final F first, final S second) {
            this.first = first;
            this.second = second;
        }
    }

    static class MatrixLib {

        private final long modulo;

        private MatrixLib(final long mod) {
            this.modulo = mod;
        }

        public Matrix pow(final Matrix matrix, long exponent) {
            Matrix resultantMatrix = Matrix.getIdentityMatrix(matrix.rowSize, matrix.colSize);
            Matrix copyOfSourceMatrix = new Matrix(matrix.rowSize, matrix.colSize);
            copyOfSourceMatrix.copyFrom(matrix);

            while (exponent > 0) {
                if ((exponent & 1) != 0) {
                    resultantMatrix = multiply(resultantMatrix, copyOfSourceMatrix);
                }

                exponent >>= 1;
                copyOfSourceMatrix = multiply(copyOfSourceMatrix, copyOfSourceMatrix);
            }

            return resultantMatrix;
        }

        private Matrix multiply(final Matrix firstMatrix, final Matrix secondMatrix) {
            assert firstMatrix.colSize == secondMatrix.rowSize;
            final Matrix resultantMatrix = new Matrix(firstMatrix.rowSize, secondMatrix.colSize);
            for (int row = 0; row < firstMatrix.rowSize; ++row) {
                for (int col = 0; col < secondMatrix.colSize; ++col) {
                    for (int inter = 0; inter < secondMatrix.rowSize; ++inter) {
                        long currentValue = resultantMatrix.getValueAt(row, col);
                        long multiplyValue = firstMatrix.getValueAt(row, inter) * secondMatrix.getValueAt(inter, col);
                        long updatedValue = adjustWithMod(adjustWithMod(currentValue) + adjustWithMod(multiplyValue));
                        resultantMatrix.setValueAt(row, col, updatedValue);
                    }
                }
            }

            return resultantMatrix;
        }

        private long adjustWithMod(final long value) {
            return value >= modulo
                    ? value % modulo
                    : (value < 0)
                    ? (value + modulo) % modulo
                    : value;
        }
    }

    static class Matrix {

        int rowSize;
        int colSize;
        long[][] matrix;

        public Matrix(final int rowSize, final int colSize) {
            this.rowSize = rowSize;
            this.colSize = colSize;
            this.matrix = new long[rowSize + 1][colSize + 1];
        }

        public void setValueAt(final int row, final int col, final long value) {
            this.matrix[row][col] = value;
        }

        public long getValueAt(final int row, final int col) {
            return this.matrix[row][col];
        }

        public void copyFrom(final Matrix sourceMatrix) {
            assert sourceMatrix.rowSize == rowSize && sourceMatrix.colSize == colSize;
            for (int row = 0; row < rowSize; ++row) {
                for (int col = 0; col < colSize; ++col) {
                    setValueAt(row, col, sourceMatrix.getValueAt(row, col));
                }
            }
        }

        public static Matrix getIdentityMatrix(final int rows, final int cols) {
            assert rows == cols : "Asked matrix is not square matrix can not provide identity matrix.";
            final Matrix resultantMatrix = new Matrix(rows, cols);
            for (int row = 0; row < rows; ++row) {
                resultantMatrix.setValueAt(row, row, 1);
            }

            return resultantMatrix;
        }

        @Override
        public String toString() {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("rowSize -> " + rowSize + " colSize -> " + colSize + "\n");
            for (int i = 0; i < rowSize; ++i) {
                for (int j = 0; j < colSize; ++j) {
                    stringBuffer.append(matrix[i][j] + " ");
                }
                stringBuffer.append("\n");
            }

            return stringBuffer.toString();
        }
    }

    static class NumberTheoryLib {

        public List<Integer> getMobiousFunctionValuesTill(final int maximumValue) {
            final List<Integer> mobiousFunctionValues = new ArrayList<>();
            mobiousFunctionValues.add(0); // For 0 dummy value
            mobiousFunctionValues.add(1); // For 1

            final int[] lowestPrimeDivisor = new int[maximumValue + 2];
            for (int currentNumber = 2; currentNumber <= maximumValue; ++currentNumber) {
                if (lowestPrimeDivisor[currentNumber] == 0) {
                    for (int multipleOfCurrentNumber = currentNumber; multipleOfCurrentNumber <= maximumValue;
                         multipleOfCurrentNumber += currentNumber) {
                        lowestPrimeDivisor[multipleOfCurrentNumber] = currentNumber;
                    }
                }

                boolean isNumberSqureFree = true;
                int numberOfDistinctPrimeDivisors = 0;
                int tempValueOfCurrentNumber = currentNumber;
                while (tempValueOfCurrentNumber > 1) {
                    int divisor = lowestPrimeDivisor[tempValueOfCurrentNumber];
                    if (tempValueOfCurrentNumber % divisor == 0) {
                        tempValueOfCurrentNumber /= divisor;
                        if (tempValueOfCurrentNumber % divisor == 0) { // Not a squareFree
                            isNumberSqureFree = false;
                            break;
                        }

                        numberOfDistinctPrimeDivisors++;
                    }
                }

                if (isNumberSqureFree) {
                    mobiousFunctionValues.add((numberOfDistinctPrimeDivisors & 1) != 0 ? -1 : 1);
                } else {
                    mobiousFunctionValues.add(0);
                }
            }

            return mobiousFunctionValues;
        }
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

        public List<String> scanListOfStrings(int numbersCount) throws IOException {
            final List<String> stringList = new ArrayList<>();
            while (numbersCount-- > 0) {
                stringList.add(scanString());
            }

            return stringList;
        }

        public List<Double> scanListOfDoubles(int numbersCount) throws IOException {
            final List<Double> doubleList = new ArrayList<>();
            while (numbersCount-- > 0) {
                doubleList.add(scanDouble());
            }

            return doubleList;
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