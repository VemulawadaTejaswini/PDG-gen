import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        init();

        nextInt();
        String s = next();

        Map<Integer, ArrayList<Integer>> digitToIndices = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            int digit = s.charAt(i) - '0';
            if (!digitToIndices.containsKey(digit)) digitToIndices.put(digit, new ArrayList<>());
            digitToIndices.get(digit).add(i);
        }

        int numberOfPasswords = 0;
        for (int i = 0; i < 10; i++) {
            if (!digitToIndices.containsKey(i)) continue;
            for (int j = 0; j < 10; j++) {
                if (!digitToIndices.containsKey(j)) continue;
                for (int k = 0; k < 10; k++) {
                    int eqIndex = 0;
                    if (!digitToIndices.containsKey(k)) continue;
                    int iIndex = digitToIndices.get(i).get(eqIndex);
                    int jIndex = -(Collections.binarySearch(digitToIndices.get(j), iIndex) + 1);
                    if (i == j) {
                        eqIndex++;
                        if (digitToIndices.get(j).size() >= eqIndex + 1) jIndex = digitToIndices.get(j).get(eqIndex);
                        else continue;
                    }
                    else {
                        if (jIndex == digitToIndices.get(j).size()) continue;
                        else jIndex = digitToIndices.get(j).get(jIndex);
                    }
                    int kIndex = -(Collections.binarySearch(digitToIndices.get(k), jIndex) + 1);
                    if (j == k) {
                        eqIndex++;
                        int size = digitToIndices.get(k).size();
                        if (size >= eqIndex + 1) kIndex = digitToIndices.get(k).get(size - 1);
                        else continue;
                    }
                    else {
                        if (kIndex == digitToIndices.get(k).size()) continue;
                        else kIndex = digitToIndices.get(k).get(kIndex);
                    }
                    if (kIndex <= jIndex) continue;
                    numberOfPasswords++;
//                    System.out.println(i + "" + j + "" + k);
                }
            }
        }

        System.out.println(numberOfPasswords);
    }

    //Input Reader
    private static BufferedReader reader;
    private static StringTokenizer tokenizer;

    private static void init() {
        reader = new BufferedReader(new InputStreamReader(System.in));
        tokenizer = new StringTokenizer("");
    }

    private static String next() throws IOException {
        String read;
        while (!tokenizer.hasMoreTokens()) {
            read = reader.readLine();
            if (read == null || read.equals(""))
                return "-1";
            tokenizer = new StringTokenizer(read);
        }

        return tokenizer.nextToken();
    }

    private static int nextInt() throws IOException {
        return Integer.parseInt(next());
    }

//    private static long nextLong() throws IOException {
//        return Long.parseLong(next());
//    }
//
//    //    Get a whole line.
//    private static String line() throws IOException {
//        return reader.readLine();
//    }
//
//    private static double nextDouble() throws IOException {
//        return Double.parseDouble(next());
//    }
}