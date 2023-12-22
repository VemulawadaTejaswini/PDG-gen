import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        init();

        int n = nextInt();
        int[] ls = new int[n];
        for (int i = 0; i < n; i++) {
            ls[i] = nextInt();
        }

        Arrays.sort(ls);
        int[] prefixSum = new int[2001];
        for (int l : ls) prefixSum[l]++;
        for (int i = 1; i < prefixSum.length; i++) prefixSum[i] += prefixSum[i - 1];


//        System.out.println(Arrays.toString(ls));
        int triples = 0;
        for (int i = 0; i < ls.length; i++) {
            for (int j = i + 1; j < ls.length; j++) {
                int a = ls[i];
                int b = ls[j];

                int min = Math.max(a, b);
                int max = a + b;
                triples += prefixSum[max - 1] - prefixSum[min];
//                int minIndex = Arrays.binarySearch(ls, min);
//                if (minIndex < 0) minIndex = -(minIndex + 1);
//                if (minIndex < ls.length && ls[minIndex] == min) minIndex++;
//                minIndex = Math.max(j + 1, minIndex);
//
//                int maxIndex = Arrays.binarySearch(ls, max);
//                if (maxIndex < 0) maxIndex = -(maxIndex + 1);
//                if (maxIndex < ls.length && ls[maxIndex] >= max) maxIndex--;
//                maxIndex = Math.min(ls.length - 1, maxIndex);
//
//                if (maxIndex < ls.length && maxIndex >= minIndex) {
//                    triples += (maxIndex - minIndex) + 1;
//                    System.out.println(a + " " + b + ": (" + minIndex + "->" + maxIndex + ")");
//                }
            }
        }

        System.out.println(triples);
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
}