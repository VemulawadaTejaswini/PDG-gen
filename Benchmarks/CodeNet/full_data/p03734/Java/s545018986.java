
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import java.util.zip.ZipFile;

// class name example: practice_1__2017_04_16
/*
-------------------------
Summary:
Total  : 4
Correct: 4
Wrong  : 0


Class need to be named: Main



 */
public class Main {

    // -------------------------------------------------------------------------

    private final boolean debugMode = false;
    private static final int[] fileTestCases = {1, 2, 3, 4};
    //private final int[] fileTestCases = {0};
    private int correct = 0;
    private int totalTestCases = 0;
    private InputReader in;
    private PrintWriter out;

    // -------------------------------------------------------------------------

//    private void solveManyTestCasesPerFile(int fileTestCase) throws IOException { // many test cases per file
//        int T = in.nextInt();
//
//        for (int testNo = 1; testNo <= T; testNo++) {
//
//
//
//            if (debugMode) {
//                String actualResult = "'";
//                assertResults(fileTestCase, testNo - 1, actualResult);
//            }
//        }
//    }

    static class Knapsack {

        public static int knapSack(int W, int wt[], int val[], int n) {
            int i, w;
            int K[][] = new int[n + 1][W + 1];

            for (i = 0; i <= n; i++) {
                for (w = 0; w <= W; w++) {
                    if (i == 0 || w == 0)
                        K[i][w] = 0;
                    else if (wt[i - 1] <= w)
                        K[i][w] = Math.max(val[i - 1] + K[i - 1][w - wt[i - 1]], K[i - 1][w]);
                    else
                        K[i][w] = K[i - 1][w];
                }
            }

            return K[n][W];
        }

//        public static void main(String args[])
//        {
//            int val[] = new int[]{60, 100, 120};
//            int wt[] = new int[]{10, 20, 30};
//            int  W = 50;
//            int n = val.length;
//            System.out.println(knapSack(W, wt, val, n));
//        }
    }

    // Your objective is to maximize the total value of the selected items.
    private void solveOneTestCasePerFile(int fileTestCase) throws IOException { // 1 test case per file
        int items = in.nextInt();
        int targetWeight = in.nextInt();
        int[] weights = new int[items];
        int[] values = new int[items];
        for (int i = 0; i < items; i++) {
            weights[i] = in.nextInt();
            values[i] = in.nextInt();
        }

        int ans = Knapsack.knapSack(targetWeight, weights, values, items);
        System.out.println(ans);

        if (debugMode) {
            String actualResult = ans + "";
            assertResults(fileTestCase, 0, actualResult);
        }
    }

    // -------------------------------------------------------------------------

    private void assertResults(int fileTestCase, int testNo, String actualResult) throws IOException {
        if (debugMode) {
            System.out.println("------------------------- Test case: " + fileTestCase);
            List<String> expected;
            Path zipOutPath = absTestCasePath().resolve("_" + fileTestCase + "_output.zip"); // zip
            if (Files.exists(zipOutPath)) {
                ZipFile zipFile = new ZipFile(zipOutPath.toFile());
                InputStream stream = zipFile.getInputStream(zipFile.entries().nextElement());
                BufferedReader reader = new BufferedReader(new InputStreamReader(stream));
                expected = new ArrayList<>();
                String line = reader.readLine();
                while (line != null) {
                    expected.add(line);
                    line = reader.readLine();
                }
            } else {
                Path outputPath = absTestCasePath().resolve("_" + fileTestCase + "_output.txt");  // txt
                expected = Files.readAllLines(outputPath);
            }
            String expectedResult = expected.get(testNo);   // assert
            System.out.println("actual  : " + actualResult);
            System.out.println("expected: " + expectedResult);
            if (!actualResult.equals(expectedResult)) {
                System.out.println("test case: " + (fileTestCase) + " - wrong answer");
            } else {
                correct++;
            }
            totalTestCases++;
            System.out.println("-------------------------");
        }
    }

    private void run() throws IOException {
        out = new PrintWriter(System.out);
        if (debugMode) {
            for (int fileTestCase : fileTestCases) {
                Path zipInPath = absTestCasePath().resolve("_" + fileTestCase + "_input.zip");
                if (Files.exists(zipInPath)) { // test case in zip or txt format + in + out
                    ZipFile zipFile = new ZipFile(zipInPath.toFile());
                    InputStream stream = zipFile.getInputStream(zipFile.entries().nextElement());
                    in = new InputReader(stream);
                } else {
                    Path inputPath = absTestCasePath().resolve("_" + fileTestCase + "_input.txt");
                    in = new InputReader(new FileInputStream(inputPath.toFile()));
                }
                solveOneTestCasePerFile(fileTestCase);
            }
            System.out.println("Summary:");
            System.out.println("Total  : " + totalTestCases);
            System.out.println("Correct: " + correct);
            System.out.println("Wrong  : " + (totalTestCases - correct));
        } else {
            in = new InputReader(System.in);
            solveOneTestCasePerFile(-1);
        }
    }

    public static void main(String[] args) throws IOException {
        new Practice1__2017_05_05().run();
    }

    private Path absTestCasePath() {
        return Paths.get(new File(getClass().getResource("").getPath().replace("target", "src"))
                .getAbsolutePath()).getParent().resolve("test_cases");
    }

    // -------------------------------------------------------------------------

    private class InputReader {
        public BufferedReader reader;
        public StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
        }

        public String nextString() {
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
            return Integer.parseInt(nextString());
        }

        public long nextLong() {
            return Long.parseLong(nextString());
        }

        public double nextDouble() {
            return Double.parseDouble(nextString());
        }
    }
}
